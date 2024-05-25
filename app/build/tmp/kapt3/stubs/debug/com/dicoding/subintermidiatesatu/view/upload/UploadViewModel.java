package com.dicoding.subintermidiatesatu.view.upload;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J?\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/dicoding/subintermidiatesatu/view/upload/UploadViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/dicoding/subintermidiatesatu/data/UserRepository;", "(Lcom/dicoding/subintermidiatesatu/data/UserRepository;)V", "uploadStory", "Landroidx/lifecycle/LiveData;", "Lcom/dicoding/subintermidiatesatu/data/Result;", "Lcom/dicoding/subintermidiatesatu/response/UploadResponse;", "file", "Ljava/io/File;", "description", "", "lat", "", "lon", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Landroidx/lifecycle/LiveData;", "app_debug"})
public final class UploadViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.dicoding.subintermidiatesatu.data.UserRepository repository = null;
    
    public UploadViewModel(@org.jetbrains.annotations.NotNull
    com.dicoding.subintermidiatesatu.data.UserRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.dicoding.subintermidiatesatu.data.Result<com.dicoding.subintermidiatesatu.response.UploadResponse>> uploadStory(@org.jetbrains.annotations.NotNull
    java.io.File file, @org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.lang.Double lat, @org.jetbrains.annotations.Nullable
    java.lang.Double lon) {
        return null;
    }
}