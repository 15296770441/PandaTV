package com.example.administrator.pandatv.model.biz;


import com.example.administrator.pandatv.model.entity.PandaLiveBean;
import com.example.administrator.pandatv.net.callback.MyNetWorkCallback;

public interface IPandaLiveModel extends BaseModel{

    void getPadDaLive(MyNetWorkCallback<PandaLiveBean> callback);
}
