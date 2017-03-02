package com.finger.appinfo.service;

import com.finger.appinfo.controller.Result;
import com.finger.appinfo.params.AppInfoSearchParams;
import com.finger.appinfo.pojo.AppInfo;

import java.util.List;

/**
 * Created by 古月随笔 on 2017/3/2.
 */
public interface IAppInfoService {

    /**
     * 根据Id获取app信息
     * @param id
     * @return
     */
    AppInfo getAppInfoById(long id);


    /**
     * 获取appInfo
     * @param id
     * @return
     */
    Result<AppInfo> getAppInfo(long id);


    /**
     * 添加app信息
     * @param appInfo
     * @return
     */
    Result addAppInfo(AppInfo appInfo);

    /**
     * 分页查询app信息
     */
    List<AppInfo> queryAppInfoListWithoutCondition(AppInfoSearchParams appInfoSearchParams);
}
