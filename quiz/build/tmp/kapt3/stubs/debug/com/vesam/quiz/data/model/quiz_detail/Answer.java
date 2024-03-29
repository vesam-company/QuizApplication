package com.vesam.quiz.data.model.quiz_detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\tH\u00c6\u0003J=\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010+\u001a\u00020\u00132\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020\u0005H\u00d6\u0001J\u0010\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\tH\u0002J\t\u00100\u001a\u00020\tH\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000eR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u00020\t8FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!\u00a8\u00061"}, d2 = {"Lcom/vesam/quiz/data/model/quiz_detail/Answer;", "", "description", "Lcom/vesam/quiz/data/model/quiz_detail/Description;", "id", "", "isCorrect", "sort", "title", "", "(Lcom/vesam/quiz/data/model/quiz_detail/Description;IIILjava/lang/String;)V", "getDescription", "()Lcom/vesam/quiz/data/model/quiz_detail/Description;", "getId", "()I", "isCheckLevel", "setCheckLevel", "(I)V", "isCorrectItem", "", "()Z", "setCorrectItem", "(Z)V", "isEnable", "setEnable", "isSelected", "setSelected", "isSuccess", "setSuccess", "getSort", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "uriPath", "getUriPath", "setUriPath", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "nameFileEncrypt", "filename", "toString", "quiz_debug"})
public final class Answer {
    private int isSuccess = 0;
    private int isCheckLevel = 0;
    private boolean isSelected = false;
    private boolean isEnable = false;
    private boolean isCorrectItem = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String uriPath = "";
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "description")
    private final com.vesam.quiz.data.model.quiz_detail.Description description = null;
    @com.google.gson.annotations.SerializedName(value = "id")
    private final int id = 0;
    @com.google.gson.annotations.SerializedName(value = "is_correct")
    private final int isCorrect = 0;
    @com.google.gson.annotations.SerializedName(value = "sort")
    private final int sort = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "title")
    private java.lang.String title;
    
    public final int isSuccess() {
        return 0;
    }
    
    public final void setSuccess(int p0) {
    }
    
    public final int isCheckLevel() {
        return 0;
    }
    
    public final void setCheckLevel(int p0) {
    }
    
    public final boolean isSelected() {
        return false;
    }
    
    public final void setSelected(boolean p0) {
    }
    
    public final boolean isEnable() {
        return false;
    }
    
    public final void setEnable(boolean p0) {
    }
    
    public final boolean isCorrectItem() {
        return false;
    }
    
    public final void setCorrectItem(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUriPath() {
        return null;
    }
    
    public final void setUriPath(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private final java.lang.String nameFileEncrypt(java.lang.String filename) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.vesam.quiz.data.model.quiz_detail.Description getDescription() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final int isCorrect() {
        return 0;
    }
    
    public final int getSort() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public Answer(@org.jetbrains.annotations.Nullable()
    com.vesam.quiz.data.model.quiz_detail.Description description, int id, int isCorrect, int sort, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.vesam.quiz.data.model.quiz_detail.Description component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vesam.quiz.data.model.quiz_detail.Answer copy(@org.jetbrains.annotations.Nullable()
    com.vesam.quiz.data.model.quiz_detail.Description description, int id, int isCorrect, int sort, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
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