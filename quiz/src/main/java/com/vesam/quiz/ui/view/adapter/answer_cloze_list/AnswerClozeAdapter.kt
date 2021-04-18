package com.vesam.quiz.ui.view.adapter.answer_cloze_list

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vesam.quiz.R
import com.vesam.quiz.data.model.quiz_detail.Answer
import com.vesam.quiz.data.model.quiz_detail.Question
import com.vesam.quiz.interfaces.OnClickListenerAny
import com.vesam.quiz.ui.view.adapter.answer_quiz_list.ViewHolderAnswer
import com.vesam.quiz.utils.extention.checkPersianCharacter
import java.util.*

@Suppress("DEPRECATION")
class AnswerClozeAdapter(private val context: Context) : RecyclerView.Adapter<ViewHolderAnswerCloze>() {

    private lateinit var onClickListenerAny: OnClickListenerAny
    private val list: ArrayList<Answer> = ArrayList()

    fun setOnItemClickListener(onClickListenerAny: OnClickListenerAny) {
        this.onClickListenerAny = onClickListenerAny
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderAnswerCloze =
        ViewHolderAnswerCloze(getViewHolder(parent))

    private fun getViewHolder(parent: ViewGroup): View = LayoutInflater.from(parent.context)
        .inflate(R.layout.item_answer_cloze, parent, false)

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(viewHolderAnswerCloze: ViewHolderAnswerCloze, position: Int) {
        val answer = list[position]
        viewHolderAnswerCloze.txtTitle.text = answer.title
        initStateCheckLevel(viewHolderAnswerCloze,answer)
        viewHolderAnswerCloze.lnParent.setOnClickListener { onClickListenerAny.onClickListener(answer) }
    }

    override fun getItemCount(): Int = list.size

    private fun initStateCheckLevel(viewHolderAnswerCloze: ViewHolderAnswerCloze, answer: Answer) {
        when (answer.isSelected) {
            true -> answerSelectQuestionItem(viewHolderAnswerCloze)
            false -> answerUnSelectQuestionItem(viewHolderAnswerCloze)
        }
    }

    private fun answerUnSelectQuestionItem(viewHolderAnswerCloze: ViewHolderAnswerCloze) {
        viewHolderAnswerCloze.txtTitle.setTextColor(context.resources.getColor(R.color.color_grey_text_answer))
        viewHolderAnswerCloze.lnParent.setBackgroundResource(R.drawable.rounded_white_shape)
    }

    private fun answerSelectQuestionItem(viewHolderAnswerCloze: ViewHolderAnswerCloze) {
        viewHolderAnswerCloze.txtTitle.setTextColor(context.resources.getColor(R.color.black))
        viewHolderAnswerCloze.lnParent.setBackgroundResource(R.drawable.rounded_blue_item_answer_cloze_shape)
    }

    fun updateList(listAnswer: List<Answer>) {
        list.clear()
        list.addAll(listAnswer)
        notifyDataSetChanged()
    }
}