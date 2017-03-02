package com.finger.appinfo.dao;

import com.finger.appinfo.pojo.AppInfo;

import java.util.List;
import java.util.Map;

public interface AppInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AppInfo record);

    int insertSelective(AppInfo record);

    AppInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AppInfo record);

    int updateByPrimaryKey(AppInfo record);

    //分页查询appInfo
    List<AppInfo> queryAppInfoListWithoutCondition(Map<String, Object> queryMap);
}