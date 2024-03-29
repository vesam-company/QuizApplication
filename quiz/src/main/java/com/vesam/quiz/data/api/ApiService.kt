package com.vesam.quiz.data.api

import com.vesam.quiz.data.model.get_quiz_result.ResponseGetQuizResultModel
import com.vesam.quiz.data.model.quiz_detail.ResponseQuizDetailModel
import com.vesam.quiz.data.model.set_quiz_result.ResponseSetQuizResultModel
import com.vesam.quiz.utils.build_config.BuildConfig.Companion.GET_QUIZ_RESULT
import com.vesam.quiz.utils.build_config.BuildConfig.Companion.PERIOD_TIME
import com.vesam.quiz.utils.build_config.BuildConfig.Companion.QUIZ_DETAIL
import com.vesam.quiz.utils.build_config.BuildConfig.Companion.QUIZ_ID
import com.vesam.quiz.utils.build_config.BuildConfig.Companion.QUIZ_LIST
import com.vesam.quiz.utils.build_config.BuildConfig.Companion.SET_QUIZ_RESULT
import com.vesam.quiz.utils.build_config.BuildConfig.Companion.USER_ANSWERS
import com.vesam.quiz.utils.build_config.BuildConfig.Companion.USER_API_TOKEN
import com.vesam.quiz.utils.build_config.BuildConfig.Companion.USER_UUID
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.*

interface ApiService {

    //quiz -------------------------------

    @POST(QUIZ_DETAIL)
    @FormUrlEncoded
    suspend fun initQuizDetail(
        @Header(USER_UUID) userUuid: String,
        @Header(USER_API_TOKEN) userApiToken: String,
        @Field(QUIZ_ID) quizId: Int
    ): ResponseQuizDetailModel

    @POST(SET_QUIZ_RESULT)
    @FormUrlEncoded
    suspend fun initSetQuizResult(
        @Header(USER_UUID) userUuid: String,
        @Header(USER_API_TOKEN) userApiToken: String,
        @Field(QUIZ_ID) quizId: Int,
        @Field(USER_ANSWERS) userAnswer: String
    ): ResponseSetQuizResultModel

    @POST(GET_QUIZ_RESULT)
    suspend fun initGetQuizResult(
        @Header(USER_UUID) userUuid: String,
        @Header(USER_API_TOKEN) userApiToken: String,
        @Field(QUIZ_ID) quizId: Int
    ): ResponseGetQuizResultModel
}