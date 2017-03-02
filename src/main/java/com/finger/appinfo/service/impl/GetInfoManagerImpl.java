//package com.finger.appinfo.service.impl;
//
//import com.finger.appinfo.base.BaseSupport;
//import com.finger.appinfo.common.DateUtils;
//import com.finger.appinfo.mapper.AppInfoDaoMapper;
//import com.finger.appinfo.model.AppInfoDao;
//import com.finger.appinfo.service.IGetInfoManager;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.Date;
//import java.util.List;
//
///**
// * Created by 古月随笔 on 2017/3/2.
// */
//@Component
//public class GetInfoManagerImpl extends BaseSupport implements IGetInfoManager {
//
//    @Autowired
//    AppInfoDaoMapper appInfoDaoMapper;
//
////    public List<AppInfoDao> getHttpServletAppInfo(AppInfoDao appInfo){
////        String osName = appInfo.getOsName();
////        String config = appInfo.getConfig();
////        String version = appInfo.getVersions();
////        String appTime = DateUtils.dateToStrLong(appInfo.getAppTime());
////        boolean defaults = false;
////
////        if(osName == null || osName.equals("0")){
////            osName = "";
////        }
////        if(osName.equals("1")){
////            osName = "Android";
////        }
////        if(osName.equals("2")){
////            osName = "iOS";
////        }
////
////
////    }
//
//
//    public List<AppInfoDao> getAppInfo(int id){
//        AppInfoDao appInfoDao = new AppInfoDao();
//
//        try {
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//
//}
