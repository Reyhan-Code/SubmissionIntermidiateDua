package com.dicoding.subintermidiatesatu.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J#\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\tH\u0016\u00a2\u0006\u0002\u0010\nJ+\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/dicoding/subintermidiatesatu/data/StoriesPagingSource;", "Landroidx/paging/PagingSource;", "", "Lcom/dicoding/subintermidiatesatu/response/ListStoryItem;", "apiService", "Lcom/dicoding/subintermidiatesatu/data/room/ApiService;", "(Lcom/dicoding/subintermidiatesatu/data/room/ApiService;)V", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class StoriesPagingSource extends androidx.paging.PagingSource<java.lang.Integer, com.dicoding.subintermidiatesatu.response.ListStoryItem> {
    @org.jetbrains.annotations.NotNull
    private final com.dicoding.subintermidiatesatu.data.room.ApiService apiService = null;
    @java.lang.Deprecated
    public static final int INITIAL_PAGE_INDEX = 1;
    @org.jetbrains.annotations.NotNull
    private static final com.dicoding.subintermidiatesatu.data.StoriesPagingSource.Companion Companion = null;
    
    public StoriesPagingSource(@org.jetbrains.annotations.NotNull
    com.dicoding.subintermidiatesatu.data.room.ApiService apiService) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Integer getRefreshKey(@org.jetbrains.annotations.NotNull
    androidx.paging.PagingState<java.lang.Integer, com.dicoding.subintermidiatesatu.response.ListStoryItem> state) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object load(@org.jetbrains.annotations.NotNull
    androidx.paging.PagingSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.dicoding.subintermidiatesatu.response.ListStoryItem>> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/dicoding/subintermidiatesatu/data/StoriesPagingSource$Companion;", "", "()V", "INITIAL_PAGE_INDEX", "", "app_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}