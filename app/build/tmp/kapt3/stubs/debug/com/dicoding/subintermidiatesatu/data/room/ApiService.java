package com.dicoding.subintermidiatesatu.data.room;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ%\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J/\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J=\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u0019\u001a\u00020\u001a2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u001aH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/dicoding/subintermidiatesatu/data/room/ApiService;", "", "getStories", "Lcom/dicoding/subintermidiatesatu/response/StoryResponse;", "page", "", "size", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStoriesWithLocation", "location", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "Lcom/dicoding/subintermidiatesatu/response/UserLoginResponse;", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "register", "Lcom/dicoding/subintermidiatesatu/response/UserRegisterResponse;", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadImage", "Lcom/dicoding/subintermidiatesatu/response/UploadResponse;", "file", "Lokhttp3/MultipartBody$Part;", "description", "Lokhttp3/RequestBody;", "lat", "lon", "(Lokhttp3/MultipartBody$Part;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiService {
    
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST(value = "register")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object register(@retrofit2.http.Field(value = "name")
    @org.jetbrains.annotations.NotNull
    java.lang.String name, @retrofit2.http.Field(value = "email")
    @org.jetbrains.annotations.NotNull
    java.lang.String email, @retrofit2.http.Field(value = "password")
    @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.dicoding.subintermidiatesatu.response.UserRegisterResponse> $completion);
    
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST(value = "login")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object login(@retrofit2.http.Field(value = "email")
    @org.jetbrains.annotations.NotNull
    java.lang.String email, @retrofit2.http.Field(value = "password")
    @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.dicoding.subintermidiatesatu.response.UserLoginResponse> $completion);
    
    @retrofit2.http.Multipart
    @retrofit2.http.POST(value = "stories")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object uploadImage(@retrofit2.http.Part
    @org.jetbrains.annotations.NotNull
    okhttp3.MultipartBody.Part file, @retrofit2.http.Part(value = "description")
    @org.jetbrains.annotations.NotNull
    okhttp3.RequestBody description, @retrofit2.http.Part(value = "lat")
    @org.jetbrains.annotations.Nullable
    okhttp3.RequestBody lat, @retrofit2.http.Part(value = "lon")
    @org.jetbrains.annotations.Nullable
    okhttp3.RequestBody lon, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.dicoding.subintermidiatesatu.response.UploadResponse> $completion);
    
    @retrofit2.http.GET(value = "stories")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getStoriesWithLocation(@retrofit2.http.Query(value = "location")
    int location, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.dicoding.subintermidiatesatu.response.StoryResponse> $completion);
    
    @retrofit2.http.GET(value = "stories")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getStories(@retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "size")
    int size, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.dicoding.subintermidiatesatu.response.StoryResponse> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}