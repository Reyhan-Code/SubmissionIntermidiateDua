package com.dicoding.subintermidiatesatu.view.main;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/dicoding/subintermidiatesatu/view/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/dicoding/subintermidiatesatu/data/UserRepository;", "(Lcom/dicoding/subintermidiatesatu/data/UserRepository;)V", "dataStory", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "Lcom/dicoding/subintermidiatesatu/response/ListStoryItem;", "getDataStory", "()Landroidx/lifecycle/LiveData;", "listStory", "Landroidx/lifecycle/MutableLiveData;", "getListStory", "()Landroidx/lifecycle/MutableLiveData;", "getSession", "Lcom/dicoding/subintermidiatesatu/data/pref/UserModel;", "getStories", "", "logout", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.dicoding.subintermidiatesatu.data.UserRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<androidx.paging.PagingData<com.dicoding.subintermidiatesatu.response.ListStoryItem>> listStory = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<androidx.paging.PagingData<com.dicoding.subintermidiatesatu.response.ListStoryItem>> dataStory = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull
    com.dicoding.subintermidiatesatu.data.UserRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.dicoding.subintermidiatesatu.data.pref.UserModel> getSession() {
        return null;
    }
    
    public final void logout() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<androidx.paging.PagingData<com.dicoding.subintermidiatesatu.response.ListStoryItem>> getListStory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<androidx.paging.PagingData<com.dicoding.subintermidiatesatu.response.ListStoryItem>> getDataStory() {
        return null;
    }
    
    public final void getStories() {
    }
}