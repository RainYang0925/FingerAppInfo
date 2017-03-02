package com.finger.appinfo.service;


import com.finger.appinfo.pojo.AppInfo;

import java.util.List;

/**
 * Created by 古月随笔 on 2017/3/2.
 */
public interface IGetInfoManager {

    List<AppInfo> getHttpServletAppInfo(AppInfo appInfo);

    List<AppInfo> getAppInfo(int id);//获取app信息
}
