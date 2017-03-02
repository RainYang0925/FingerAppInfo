package com.finger.appinfo.service.impl;

import com.finger.appinfo.controller.Result;
import com.finger.appinfo.dao.AppInfoMapper;
import com.finger.appinfo.params.AppInfoSearchParams;
import com.finger.appinfo.pojo.AppInfo;
import com.finger.appinfo.service.IAppInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by treebear on 2017/3/2.
 */
@Service("appInfoService")
public class AppInfoServiceImpl implements IAppInfoService {

    private static final Logger logger = LoggerFactory.getLogger(AppInfoServiceImpl.class);

    @Resource
    private AppInfoMapper appInfoDao;

    /**
     * 分页查询所有记录
     * @return
     */
    public List<AppInfo> queryAppInfoListWithoutCondition(AppInfoSearchParams appInfoSearchParams){
        Map<String, Object> map = new HashMap<String, Object>();
        if(appInfoSearchParams == null){
            map.put("startNo", 0);
            map.put("pageSize", 20);
            return appInfoDao.queryAppInfoListWithoutCondition(map);
        }

        Integer startNo = appInfoSearchParams.getStartNo();
        Integer pageSize = appInfoSearchParams.getPageSize();
        if(startNo > -1 || startNo != null){
            map.put("startNo", startNo);
        }else {
            map.put("startNo", 0);
        }

        if(pageSize > -1 || pageSize != null) {
            map.put("pageSize", pageSize);
        }else {
            map.put("pageSize", 20);
        }
        return appInfoDao.queryAppInfoListWithoutCondition(map);
    }


    /**
     * 根据ID获取App信息
     * @param id
     * @return
     */
    public AppInfo getAppInfoById(long id){
        return this.appInfoDao.selectByPrimaryKey(id);
    }


    /**
     * POST请求，根据id获取app信息
     * @param id
     * @return
     */
    public Result<AppInfo> getAppInfo(long id){
        AppInfo appInfo = getAppInfoById(id);

        Result<AppInfo> resultList = new Result<AppInfo>();
        resultList.setCode(200);
        resultList.setBizCode(1);
        resultList.setMsg("success");
        resultList.setData(appInfo);
        return resultList;
    }

    /**
     * 添加app信息
     * @param appInfo
     * @return
     */
    public Result addAppInfo(AppInfo appInfo){
        Result result = new Result();
        try {
            appInfoDao.insertSelective(appInfo);
            result.setMsg("Add AppInfo Success");
            result.setCode(100);
            result.setBizCode(3);
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }

        result.setMsg("Add AppInfo Failed");
        result.setCode(404);
        result.setBizCode(3);
        return result;
    }
}
