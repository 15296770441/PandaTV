package com.example.administrator.pandatv.net;


import com.example.administrator.pandatv.net.callback.MyNetWorkCallback;

import java.util.Map;




public interface IHttp {

    <T> void get(String url, Map<String, String> params, MyNetWorkCallback<T> callback);
    <T> void post(String url, Map<String, String> params, MyNetWorkCallback<T> callback);
    void upload();
    void download();
    void loadImage();

}
