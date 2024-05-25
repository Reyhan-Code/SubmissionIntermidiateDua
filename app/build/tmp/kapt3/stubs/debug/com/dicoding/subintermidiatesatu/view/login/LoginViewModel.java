package com.dicoding.subintermidiatesatu.view.login;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/dicoding/subintermidiatesatu/view/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/dicoding/subintermidiatesatu/data/UserRepository;", "(Lcom/dicoding/subintermidiatesatu/data/UserRepository;)V", "_loginResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/dicoding/subintermidiatesatu/data/Result;", "Lcom/dicoding/subintermidiatesatu/response/UserLoginResponse;", "loginResult", "Landroidx/lifecycle/LiveData;", "getLoginResult", "()Landroidx/lifecycle/LiveData;", "login", "", "email", "", "password", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.dicoding.subintermidiatesatu.data.UserRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.dicoding.subintermidiatesatu.data.Result<com.dicoding.subintermidiatesatu.response.UserLoginResponse>> _loginResult = null;
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull
    com.dicoding.subintermidiatesatu.data.UserRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.dicoding.subintermidiatesatu.data.Result<com.dicoding.subintermidiatesatu.response.UserLoginResponse>> getLoginResult() {
        return null;
    }
    
    public final void login(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
    }
}