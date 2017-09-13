package com.example.administrator.pandatv.model.biz;


import com.example.administrator.pandatv.net.HttpFactroy;
import com.example.administrator.pandatv.net.IHttp;

public interface BaseModel {
    public static IHttp iHttp = HttpFactroy.create();
}
