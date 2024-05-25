package com.dicoding.subintermidiatesatu.data.pref;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0015\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0011\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/dicoding/subintermidiatesatu/data/pref/UserPreference;", "", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "(Landroidx/datastore/core/DataStore;)V", "getSession", "Lkotlinx/coroutines/flow/Flow;", "Lcom/dicoding/subintermidiatesatu/data/pref/UserModel;", "logout", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveSession", "user", "(Lcom/dicoding/subintermidiatesatu/data/pref/UserModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class UserPreference {
    @org.jetbrains.annotations.NotNull
    private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore = null;
    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private static volatile com.dicoding.subintermidiatesatu.data.pref.UserPreference INSTANCE;
    @org.jetbrains.annotations.NotNull
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> NAME_KEY = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> EMAIL_KEY = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> TOKEN_KEY = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> IS_LOGIN_KEY = null;
    @org.jetbrains.annotations.NotNull
    public static final com.dicoding.subintermidiatesatu.data.pref.UserPreference.Companion Companion = null;
    
    private UserPreference(androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveSession(@org.jetbrains.annotations.NotNull
    com.dicoding.subintermidiatesatu.data.pref.UserModel user, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\f\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/dicoding/subintermidiatesatu/data/pref/UserPreference$Companion;", "", "()V", "EMAIL_KEY", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "INSTANCE", "Lcom/dicoding/subintermidiatesatu/data/pref/UserPreference;", "IS_LOGIN_KEY", "", "NAME_KEY", "TOKEN_KEY", "getInstance", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.dicoding.subintermidiatesatu.data.pref.UserPreference getInstance(@org.jetbrains.annotations.NotNull
        androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore) {
            return null;
        }
    }
}