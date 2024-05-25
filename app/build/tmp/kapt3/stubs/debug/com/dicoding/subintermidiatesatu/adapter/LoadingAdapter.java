package com.dicoding.subintermidiatesatu.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/dicoding/subintermidiatesatu/adapter/LoadingAdapter;", "Landroidx/paging/LoadStateAdapter;", "Lcom/dicoding/subintermidiatesatu/adapter/LoadingAdapter$LoadingStateViewHolder;", "retry", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "onBindViewHolder", "holder", "loadState", "Landroidx/paging/LoadState;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "LoadingStateViewHolder", "app_debug"})
public final class LoadingAdapter extends androidx.paging.LoadStateAdapter<com.dicoding.subintermidiatesatu.adapter.LoadingAdapter.LoadingStateViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function0<kotlin.Unit> retry = null;
    
    public LoadingAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> retry) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.dicoding.subintermidiatesatu.adapter.LoadingAdapter.LoadingStateViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull
    androidx.paging.LoadState loadState) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.dicoding.subintermidiatesatu.adapter.LoadingAdapter.LoadingStateViewHolder holder, @org.jetbrains.annotations.NotNull
    androidx.paging.LoadState loadState) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/dicoding/subintermidiatesatu/adapter/LoadingAdapter$LoadingStateViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/dicoding/subintermidiatesatu/databinding/LoadingBinding;", "retry", "Lkotlin/Function0;", "", "(Lcom/dicoding/subintermidiatesatu/databinding/LoadingBinding;Lkotlin/jvm/functions/Function0;)V", "bind", "loadState", "Landroidx/paging/LoadState;", "app_debug"})
    public static final class LoadingStateViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.dicoding.subintermidiatesatu.databinding.LoadingBinding binding = null;
        
        public LoadingStateViewHolder(@org.jetbrains.annotations.NotNull
        com.dicoding.subintermidiatesatu.databinding.LoadingBinding binding, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function0<kotlin.Unit> retry) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        androidx.paging.LoadState loadState) {
        }
    }
}