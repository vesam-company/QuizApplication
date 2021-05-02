@file:Suppress("DEPRECATION")

package com.vesam.quiz.ui.view.fragment


import android.media.MediaPlayer
import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.vesam.quiz.R
import com.vesam.quiz.data.model.quiz_detail.Answer
import com.vesam.quiz.data.model.quiz_detail.Question
import com.vesam.quiz.databinding.FragmentItemQuestionsBinding
import com.vesam.quiz.ui.view.adapter.answer_quiz_list.AnswerAdapter
import com.vesam.quiz.utils.application.AppQuiz
import com.vesam.quiz.utils.build_config.BuildConfig.Companion.FORMAT_AUDIO
import com.vesam.quiz.utils.build_config.BuildConfig.Companion.FORMAT_TEXT
import com.vesam.quiz.utils.build_config.BuildConfig.Companion.FORMAT_VIDEO
import com.vesam.quiz.utils.build_config.BuildConfig.Companion.ITEM_QUESTION
import com.vesam.quiz.utils.extention.checkPersianCharacter
import com.vesam.quiz.utils.extention.initFindFileInStorage
import com.vesam.quiz.utils.tools.GlideTools
import com.vesam.quiz.utils.tools.HandelErrorTools
import org.koin.android.ext.android.inject
import tcking.github.com.giraffeplayer2.GiraffePlayer


class ItemQuestionsFragment : DialogFragment() {
    private lateinit var binding: FragmentItemQuestionsBinding
    private lateinit var mediaPlayerQuestion: MediaPlayer
    private lateinit var mediaPlayerAnswer: MediaPlayer
    private val glideTools: GlideTools by inject()
    private val handelErrorTools: HandelErrorTools by inject()
    private val answerAdapter: AnswerAdapter by inject()
    private lateinit var question: Question

    fun setQuestion(question: Question) {
        this.question = question
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.AppTheme)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentItemQuestionsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        try {
            initAction()
        } catch (e: Exception) {
            handelErrorTools.handelError(e)
        }
    }

    override fun onResume() {
        super.onResume()
        initResumeVideo()
        initResumeSound()
    }

    private fun initResumeSound() {
        initResumeSoundQuestion()
        initResumeSoundAnswer()
    }

    private fun initResumeSoundQuestion() {
        binding.lnQuestionSoundLayout.imgQuestionPlaySound.visibility = View.GONE
        binding.lnQuestionSoundLayout.imgQuestionPauseSound.visibility = View.VISIBLE
    }

    private fun initResumeSoundAnswer() {
        binding.lnAnswerSoundLayout.imgAnswerPlaySound.visibility = View.VISIBLE
        binding.lnAnswerSoundLayout.imgAnswerPauseSound.visibility = View.GONE
    }

    private fun initResumeVideo() = try {
        when (binding.lnAnswerVideoLayout.cvAnswerVideo.visibility) {
            View.VISIBLE -> initShowAnswerVideoResumed()
            else -> initShowQuestionVideoResumed()
        }
    } catch (e: Exception) {
        handelErrorTools.handelError(e)
    }

    private fun initShowAnswerVideoResumed() {
        if (binding.lnAnswerVideoLayout.videoView.player.isPlaying)
            binding.lnAnswerVideoLayout.videoView.player.onActivityResumed()
    }

    private fun initShowQuestionVideoResumed() {
        if (binding.lnQuestionVideoLayout.viewVideoQuestion.player.isPlaying)
            binding.lnQuestionVideoLayout.viewVideoQuestion.player.onActivityResumed()
    }

    override fun onPause() {
        super.onPause()
        initPauseVideo()
        initPauseSoundAnswer()
        initPauseSoundQuestion()
    }

    override fun onDestroy() {
        super.onDestroy()
        initDestroyVideo()
        initStateAudio()
    }

    private fun initDestroyVideo() {
        try {
            if (binding.lnQuestionVideoLayout.viewVideoQuestion.player.isPlaying)
                binding.lnQuestionVideoLayout.viewVideoQuestion.player.onActivityDestroyed()
            if (binding.lnAnswerVideoLayout.videoView.player.isPlaying)
                binding.lnAnswerVideoLayout.videoView.player.onActivityDestroyed()
        } catch (e: Exception) {
            handelErrorTools.handelError(e)
        }
    }

    private fun initAction() {
        initAdapter()
        initOnClick()
        initQuestion()
        initOnBackPress()
    }

    private fun initOnClick() {
        binding.lnParent.setOnClickListener {}
        binding.lnQuestionSoundLayout.imgQuestionPlaySound.setOnClickListener { initPlaySoundQuestion() }
        binding.lnQuestionSoundLayout.imgQuestionPauseSound.setOnClickListener { initPauseSoundQuestion() }
        binding.lnAnswerSoundLayout.imgAnswerPlaySound.setOnClickListener { initPlaySoundAnswer() }
        binding.lnAnswerSoundLayout.imgAnswerPauseSound.setOnClickListener { initPauseSoundAnswer() }
    }

    private fun initQuestion() {
        initStateQuestionFormat(question)
        checkPersianCharacter(question.title, binding.lnQuestionTextLayout.txtQuestion)
        answerAdapter.updateList(question.answers)
        initStateListFormat(answerAdapter.initFindIsCorrectAnswer()!!)
    }

    private fun initStateQuestionFormat(question: Question) {
        when (question.quizDescription.format) {
            FORMAT_TEXT -> initQuestionFormatText(question)
            FORMAT_VIDEO -> initQuestionFormatVideo(question)
            FORMAT_AUDIO -> initQuestionFormatAudio(question)
            else -> initQuestionFormatImage(question)
        }
    }


    private fun initQuestionFormatImage(question: Question) {
        initShowQuestionFormatImage()
        glideTools.displayImageOriginal(
            binding.lnQuestionImageLayout.imgQuestion,
            question.quizDescription.urlContent
        )
    }

    private fun initQuestionFormatAudio(question: Question) {
        initShowQuestionFormatSound()
        initSoundQuestion(question.uriPath)
    }

    private fun initSoundQuestion(content: String) {
        releaseMPQuestion()
        mediaPlayerQuestion = MediaPlayer()
        try {
            mediaPlayerQuestion.setDataSource(
                initFindFileInStorage(content)
            )
            mediaPlayerQuestion.prepare()
        } catch (e: Exception) {
            handelErrorTools.handelError(e)
        }
        initPlaySoundQuestion()
    }

    private fun releaseMPQuestion() {
        if (::mediaPlayerQuestion.isInitialized) try {
            mediaPlayerQuestion.release()
        } catch (e: Exception) {
            handelErrorTools.handelError(e)
        }
    }

    private fun releaseMPAnswer() {
        if (::mediaPlayerAnswer.isInitialized) try {
            mediaPlayerAnswer.release()
        } catch (e: Exception) {
            handelErrorTools.handelError(e)
        }
    }

    private fun initPlaySoundQuestion() {
        initPauseSoundAnswer()
        binding.lnQuestionSoundLayout.imgQuestionPlaySound.visibility = View.GONE
        binding.lnQuestionSoundLayout.imgQuestionPauseSound.visibility = View.VISIBLE
        if (::mediaPlayerQuestion.isInitialized)
            mediaPlayerQuestion.start()
    }

    private fun initPauseSoundQuestion() {
        binding.lnQuestionSoundLayout.imgQuestionPlaySound.visibility = View.VISIBLE
        binding.lnQuestionSoundLayout.imgQuestionPauseSound.visibility = View.GONE
        if (::mediaPlayerQuestion.isInitialized) try {
            mediaPlayerQuestion.pause()
        } catch (e: Exception) {
            handelErrorTools.handelError(e)
        }
    }

    private fun initPlaySoundAnswer() {
        initPauseSoundQuestion()
        binding.lnAnswerSoundLayout.imgAnswerPlaySound.visibility = View.GONE
        binding.lnAnswerSoundLayout.imgAnswerPauseSound.visibility = View.VISIBLE
        if (::mediaPlayerAnswer.isInitialized)
            mediaPlayerAnswer.start()
    }

    private fun initPauseSoundAnswer() {
        binding.lnAnswerSoundLayout.imgAnswerPlaySound.visibility = View.VISIBLE
        binding.lnAnswerSoundLayout.imgAnswerPauseSound.visibility = View.GONE
        if (::mediaPlayerAnswer.isInitialized) try {
            mediaPlayerAnswer.pause()
        } catch (e: Exception) {
            handelErrorTools.handelError(e)
        }
    }

    private fun initQuestionFormatVideo(question: Question) {
        initShowQuestionFormatVideo()
        initVideoQuestion(question.uriPath)
    }

    private fun initVideoQuestion(content: String) {
        binding.lnQuestionVideoLayout.viewVideoQuestion.setVideoPath(initFindFileInStorage(content)).player.start()
    }

    private fun initQuestionFormatText(question: Question) {
        initShowQuestionFormatText()
        binding.lnQuestionTextLayout.txtQuestion.text = question.title
    }

    private fun initShowQuestionFormatText() {
        binding.lnQuestionVideoLayout.cvQuestionVideo.visibility = View.GONE
        binding.lnQuestionTextLayout.lnText.visibility = View.VISIBLE
        binding.lnQuestionImageLayout.lnImage.visibility = View.GONE
        binding.lnQuestionSoundLayout.lnSound.visibility = View.GONE
    }

    private fun initShowQuestionFormatImage() {
        binding.lnQuestionVideoLayout.cvQuestionVideo.visibility = View.GONE
        binding.lnQuestionImageLayout.lnImage.visibility = View.VISIBLE
        binding.lnQuestionSoundLayout.lnSound.visibility = View.GONE
        binding.lnQuestionTextLayout.lnText.visibility = View.GONE
    }

    private fun initShowQuestionFormatSound() {
        binding.lnQuestionVideoLayout.cvQuestionVideo.visibility = View.GONE
        binding.lnQuestionSoundLayout.lnSound.visibility = View.VISIBLE
        binding.lnQuestionImageLayout.lnImage.visibility = View.GONE
        binding.lnQuestionTextLayout.lnText.visibility = View.GONE
    }

    private fun initShowQuestionFormatVideo() {
        binding.lnQuestionVideoLayout.cvQuestionVideo.visibility = View.VISIBLE
        binding.lnQuestionSoundLayout.lnSound.visibility = View.GONE
        binding.lnQuestionImageLayout.lnImage.visibility = View.GONE
        binding.lnQuestionTextLayout.lnText.visibility = View.GONE
    }

    private fun initAdapter() {
        binding.rcQuestion.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.rcQuestion.setHasFixedSize(true)
        binding.rcQuestion.adapter = answerAdapter
    }

    private fun initStateListFormat(answer: Answer) = when (answer.description.format) {
        FORMAT_TEXT -> initListFormatText(answer)
        FORMAT_VIDEO -> initListFormatVideo(answer)
        FORMAT_AUDIO -> initListFormatSound(answer)
        else -> initListFormatImage(answer)
    }

    private fun initShowAnswerFormatText() {
        binding.lnAnswerImageLayout.imgAnswer.visibility = View.GONE
        binding.lnAnswerVideoLayout.cvAnswerVideo.visibility = View.GONE
        binding.lnAnswerTextLayout.lnAnswerText.visibility = View.VISIBLE
        binding.lnAnswerSoundLayout.lnAnswerSound.visibility = View.GONE
    }

    private fun initShowAnswerFormatImage() {
        binding.lnAnswerImageLayout.lnAnswerImage.visibility = View.VISIBLE
        binding.lnAnswerVideoLayout.cvAnswerVideo.visibility = View.GONE
        binding.lnAnswerSoundLayout.lnAnswerSound.visibility = View.GONE
        binding.lnAnswerTextLayout.lnAnswerText.visibility = View.GONE
    }

    private fun initShowAnswerFormatSound() {
        binding.lnAnswerImageLayout.lnAnswerImage.visibility = View.GONE
        binding.lnAnswerVideoLayout.cvAnswerVideo.visibility = View.GONE
        binding.lnAnswerSoundLayout.lnAnswerSound.visibility = View.VISIBLE
        binding.lnAnswerTextLayout.lnAnswerText.visibility = View.GONE
    }

    private fun initShowAnswerFormatVideo() {
        binding.lnAnswerImageLayout.lnAnswerImage.visibility = View.GONE
        binding.lnAnswerVideoLayout.cvAnswerVideo.visibility = View.VISIBLE
        binding.lnAnswerSoundLayout.lnAnswerSound.visibility = View.GONE
        binding.lnAnswerTextLayout.lnAnswerText.visibility = View.GONE
    }

    private fun initListFormatText(answer: Answer) {
        initConvertHtml(answer)
        initShowAnswerFormatText()
    }

    private fun initConvertHtml(answer: Answer) {
        answer.description.content.let {
            if (!it.isNullOrEmpty()) {
                val plainText = Html.fromHtml(it).toString()
                binding.lnAnswerTextLayout.txtTextAnswer.text = plainText
            }
        }

    }

    private fun initListFormatVideo(answer: Answer) {
        initShowAnswerFormatVideo()
        initStopVideoQuestion()
        initVideoView(answer.uriPath)
    }

    private fun initVideoView(content: String) {
        binding.lnAnswerVideoLayout.videoView.setVideoPath(initFindFileInStorage(content)).player.start()
    }

    private fun initStopVideoQuestion() {
        try {
            if (binding.lnQuestionVideoLayout.viewVideoQuestion.player.isPlaying)
                binding.lnQuestionVideoLayout.viewVideoQuestion.player.onActivityPaused()
            if (binding.lnAnswerVideoLayout.videoView.player.isPlaying)
                binding.lnAnswerVideoLayout.videoView.player.onActivityPaused()
        } catch (e: Exception) {
            handelErrorTools.handelError(e)
        }
    }

    private fun initPauseVideo() = try {
        when (binding.lnAnswerVideoLayout.cvAnswerVideo.visibility) {
            View.VISIBLE -> initShowAnswerVideoPause()
            else -> initShowQuestionVideoPause()
        }
    } catch (e: Exception) {
        handelErrorTools.handelError(e)
    }

    private fun initShowQuestionVideoPause() {
        if (binding.lnQuestionVideoLayout.viewVideoQuestion.player.isPlaying)
            binding.lnQuestionVideoLayout.viewVideoQuestion.player.onActivityPaused()
    }

    private fun initShowAnswerVideoPause() {
        if (binding.lnAnswerVideoLayout.videoView.player.isPlaying)
            binding.lnAnswerVideoLayout.videoView.player.onActivityPaused()
    }

    private fun initListFormatSound(answer: Answer) {
        initShowAnswerFormatSound()
        initSoundAnswer(answer.uriPath)
    }

    private fun initListFormatImage(answer: Answer) {
        initShowAnswerFormatImage()
        glideTools.displayImageOriginal(
            binding.lnAnswerImageLayout.imgAnswer,
            answer.description.urlContent
        )
    }

    private fun initSoundAnswer(content: String) {
        releaseMPAnswer()
        try {
            mediaPlayerAnswer = MediaPlayer()
            mediaPlayerAnswer.setDataSource(
                initFindFileInStorage(content)
            )
            mediaPlayerAnswer.prepare()
        } catch (e: Exception) {
            handelErrorTools.handelError(e)
        }
    }


    private fun initOnBackPress() {
        requireActivity().onBackPressedDispatcher.addCallback(
            requireActivity(),
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() = initOnBackPressed()
            })
    }


    private fun initOnBackPressed() {
        when (requireActivity().requestedOrientation) {
            0 -> initFullScreen()
            1 -> initNormalScreen()
        }
    }

    private fun initFullScreen() {
        when (binding.lnAnswerVideoLayout.cvAnswerVideo.visibility) {
            View.VISIBLE -> initExitFullScreenAnswerVideo()
            else -> initExitFullScreenQuestionVideo()
        }
    }

    private fun initExitFullScreenQuestionVideo() {
        binding.lnQuestionVideoLayout.viewVideoQuestion.player.displayModel =
            GiraffePlayer.DISPLAY_NORMAL
    }

    private fun initExitFullScreenAnswerVideo() {
        binding.lnAnswerVideoLayout.videoView.player.displayModel = GiraffePlayer.DISPLAY_NORMAL
    }


    private fun initNormalScreen() {
        initPauseVideo()
        initStateAudio()
        initDestroy()
    }

    private fun initDestroy() {
        val itemQuestionsFragment: ItemQuestionsFragment? = (AppQuiz.activity as AppCompatActivity).supportFragmentManager.findFragmentByTag(ITEM_QUESTION) as ItemQuestionsFragment?
        if (itemQuestionsFragment != null && itemQuestionsFragment.isVisible) itemQuestionsFragment.dismiss() else  AppQuiz.activity.finish()
    }

    private fun initStateAudio() = when (binding.lnAnswerSoundLayout.lnAnswerSound.visibility) {
        View.VISIBLE -> releaseMPAnswer()
        else -> releaseMPQuestion()
    }

}