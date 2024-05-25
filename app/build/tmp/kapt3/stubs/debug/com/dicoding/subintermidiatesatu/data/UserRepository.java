package com.dicoding.subintermidiatesatu.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u0000 *2\u00020\u0001:\u0001*B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bJ\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00100\u000f0\u000bJ\'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J/\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000f2\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J;\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u000f0\u000b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010(\u001a\u0004\u0018\u00010\'\u00a2\u0006\u0002\u0010)R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006+"}, d2 = {"Lcom/dicoding/subintermidiatesatu/data/UserRepository;", "", "apiService", "Lcom/dicoding/subintermidiatesatu/data/room/ApiService;", "userPreference", "Lcom/dicoding/subintermidiatesatu/data/pref/UserPreference;", "(Lcom/dicoding/subintermidiatesatu/data/room/ApiService;Lcom/dicoding/subintermidiatesatu/data/pref/UserPreference;)V", "getSession", "Lkotlinx/coroutines/flow/Flow;", "Lcom/dicoding/subintermidiatesatu/data/pref/UserModel;", "getStories", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "Lcom/dicoding/subintermidiatesatu/response/ListStoryItem;", "getStoriesWithLocation", "Lcom/dicoding/subintermidiatesatu/data/Result;", "", "login", "Lcom/dicoding/subintermidiatesatu/response/UserLoginResponse;", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "register", "Lcom/dicoding/subintermidiatesatu/response/UserRegisterResponse;", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveSession", "user", "(Lcom/dicoding/subintermidiatesatu/data/pref/UserModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadStories", "Lcom/dicoding/subintermidiatesatu/response/UploadResponse;", "imageFile", "Ljava/io/File;", "description", "lat", "", "lon", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Landroidx/lifecycle/LiveData;", "Companion", "app_debug"})
public final class UserRepository {
    @org.jetbrains.annotations.NotNull
    private final com.dicoding.subintermidiatesatu.data.room.ApiService apiService = null;
    @org.jetbrains.annotations.NotNull
    private final com.dicoding.subintermidiatesatu.data.pref.UserPreference userPreference = null;
    @org.jetbrains.annotations.NotNull
    public static final com.dicoding.subintermidiatesatu.data.UserRepository.Companion Companion = null;
    
    private UserRepository(com.dicoding.subintermidiatesatu.data.room.ApiService apiService, com.dicoding.subintermidiatesatu.data.pref.UserPreference userPreference) {
        super();
    }
    
    private final java.lang.Object saveSession(com.dicoding.subintermidiatesatu.data.pref.UserModel user, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.dicoding.subintermidiatesatu.data.pref.UserModel> getSession() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object logout(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object register(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.dicoding.subintermidiatesatu.data.Result<com.dicoding.subintermidiatesatu.response.UserRegisterResponse>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object login(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.dicoding.subintermidiatesatu.data.Result<com.dicoding.subintermidiatesatu.response.UserLoginResponse>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<androidx.paging.PagingData<com.dicoding.subintermidiatesatu.response.ListStoryItem>> getStories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.dicoding.subintermidiatesatu.data.Result<com.dicoding.subintermidiatesatu.response.UploadResponse>> uploadStories(@org.jetbrains.annotations.NotNull
    java.io.File imageFile, @org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.lang.Double lat, @org.jetbrains.annotations.Nullable
    java.lang.Double lon) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.dicoding.subintermidiatesatu.data.Result<java.util.List<com.dicoding.subintermidiatesatu.response.ListStoryItem>>> getStoriesWithLocation() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/dicoding/subintermidiatesatu/data/UserRepository$Companion;", "", "()V", "getInstance", "Lcom/dicoding/subintermidiatesatu/data/UserRepository;", "apiService", "Lcom/dicoding/subintermidiatesatu/data/room/ApiService;", "userPreference", "Lcom/dicoding/subintermidiatesatu/data/pref/UserPreference;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.dicoding.subintermidiatesatu.data.UserRepository getInstance(@org.jetbrains.annotations.NotNull
        com.dicoding.subintermidiatesatu.data.room.ApiService apiService, @org.jetbrains.annotations.NotNull
        com.dicoding.subintermidiatesatu.data.pref.UserPreference userPreference) {
            return null;
        }
    }
}