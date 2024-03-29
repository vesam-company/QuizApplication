package com.vesam.quiz.data.model.quiz_detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\'\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u0013J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0007H\u00c6\u0003J\t\u0010-\u001a\u00020\u0007H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0007H\u00c6\u0003J\t\u00100\u001a\u00020\fH\u00c6\u0003J\t\u00101\u001a\u00020\u0007H\u00c6\u0003J\u0097\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\fH\u00c6\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00106\u001a\u00020\u0007H\u00d6\u0001J\t\u00107\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001bR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0016\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0016\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015\u00a8\u00068"}, d2 = {"Lcom/vesam/quiz/data/model/quiz_detail/Details;", "", "createdAt", "", "description", "howDisplayCorrectAnswer", "id", "", "isActive", "jalaliCreatedAt", "periodTime", "questionDescription", "Lcom/vesam/quiz/data/model/quiz_detail/Description;", "passCondition", "slideImage", "sort", "title", "type", "descriptionAnswer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILcom/vesam/quiz/data/model/quiz_detail/Description;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/vesam/quiz/data/model/quiz_detail/Description;)V", "getCreatedAt", "()Ljava/lang/String;", "getDescription", "getDescriptionAnswer", "()Lcom/vesam/quiz/data/model/quiz_detail/Description;", "getHowDisplayCorrectAnswer", "getId", "()I", "getJalaliCreatedAt", "getPassCondition", "getPeriodTime", "getQuestionDescription", "getSlideImage", "getSort", "getTitle", "getType", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "quiz_debug"})
public final class Details {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "created_at")
    @com.google.gson.annotations.SerializedName(value = "created_at")
    private final java.lang.String createdAt = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "description")
    @com.google.gson.annotations.SerializedName(value = "description")
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "how_display_correct_answer")
    @com.google.gson.annotations.SerializedName(value = "how_display_correct_answer")
    private final java.lang.String howDisplayCorrectAnswer = null;
    @com.google.gson.annotations.SerializedName(value = "id")
    private final int id = 0;
    @androidx.room.ColumnInfo(name = "is_active")
    @com.google.gson.annotations.SerializedName(value = "is_active")
    private final int isActive = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "jalali_created_at")
    @com.google.gson.annotations.SerializedName(value = "jalali_created_at")
    private final java.lang.String jalaliCreatedAt = null;
    @androidx.room.ColumnInfo(name = "period_time")
    @com.google.gson.annotations.SerializedName(value = "period_time")
    private final int periodTime = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "question_description")
    @com.google.gson.annotations.SerializedName(value = "question_description")
    private final com.vesam.quiz.data.model.quiz_detail.Description questionDescription = null;
    @androidx.room.ColumnInfo(name = "pass_condition")
    @com.google.gson.annotations.SerializedName(value = "pass_condition")
    private final int passCondition = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "slide_image")
    @com.google.gson.annotations.SerializedName(value = "slide_image")
    private final java.lang.String slideImage = null;
    @androidx.room.ColumnInfo(name = "sort")
    @com.google.gson.annotations.SerializedName(value = "sort")
    private final int sort = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "title")
    @com.google.gson.annotations.SerializedName(value = "title")
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "type")
    @com.google.gson.annotations.SerializedName(value = "type")
    private final java.lang.String type = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "description_answer")
    private final com.vesam.quiz.data.model.quiz_detail.Description descriptionAnswer = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHowDisplayCorrectAnswer() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final int isActive() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getJalaliCreatedAt() {
        return null;
    }
    
    public final int getPeriodTime() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vesam.quiz.data.model.quiz_detail.Description getQuestionDescription() {
        return null;
    }
    
    public final int getPassCondition() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSlideImage() {
        return null;
    }
    
    public final int getSort() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.vesam.quiz.data.model.quiz_detail.Description getDescriptionAnswer() {
        return null;
    }
    
    public Details(@org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String howDisplayCorrectAnswer, int id, int isActive, @org.jetbrains.annotations.NotNull()
    java.lang.String jalaliCreatedAt, int periodTime, @org.jetbrains.annotations.NotNull()
    com.vesam.quiz.data.model.quiz_detail.Description questionDescription, int passCondition, @org.jetbrains.annotations.NotNull()
    java.lang.String slideImage, int sort, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    com.vesam.quiz.data.model.quiz_detail.Description descriptionAnswer) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vesam.quiz.data.model.quiz_detail.Description component8() {
        return null;
    }
    
    public final int component9() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.vesam.quiz.data.model.quiz_detail.Description component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vesam.quiz.data.model.quiz_detail.Details copy(@org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String howDisplayCorrectAnswer, int id, int isActive, @org.jetbrains.annotations.NotNull()
    java.lang.String jalaliCreatedAt, int periodTime, @org.jetbrains.annotations.NotNull()
    com.vesam.quiz.data.model.quiz_detail.Description questionDescription, int passCondition, @org.jetbrains.annotations.NotNull()
    java.lang.String slideImage, int sort, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    com.vesam.quiz.data.model.quiz_detail.Description descriptionAnswer) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}