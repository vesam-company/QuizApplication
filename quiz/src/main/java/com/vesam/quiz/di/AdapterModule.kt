package com.vesam.quiz.di

import com.vesam.quiz.ui.view.adapter.answer_quiz_list.AnswerAdapter
import com.vesam.quiz.ui.view.adapter.answer_quiz_result_list.AnswerResultAdapter
import com.vesam.quiz.ui.view.adapter.gallery.AdapterGalleryImage
import com.vesam.quiz.ui.view.adapter.gallery.AdapterSlidingImage
import com.vesam.quiz.ui.view.adapter.question_cloze_list.QuestionClozeAdapter
import org.koin.dsl.module

val adapterModule = module {
    single { return@single AnswerAdapter() }
    single { return@single AnswerResultAdapter(get()) }
    single { return@single AdapterGalleryImage(get(),get()) }
    single { return@single AdapterSlidingImage() }
    single { return@single QuestionClozeAdapter(get(),get()) }
}