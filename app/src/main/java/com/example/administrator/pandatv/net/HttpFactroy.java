package com.example.administrator.pandatv.net;


public class HttpFactroy {
    public static IHttp create(){
        return OkHttpUtils.getInstance();
    }
}
