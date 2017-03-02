package com.finger.appinfo.controller;

import com.finger.appinfo.params.AppInfoSearchParams;
import com.finger.appinfo.pojo.AppInfo;
import com.finger.appinfo.service.IAppInfoService;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

/**
 * restful 风格的请求
 * Created by treebear on 2017/3/2.
 */
@Controller
@RequestMapping("/finger/appinfo")
public class AppInfoController {
    private static final Logger logger = LoggerFactory.getLogger(AppInfoController.class);

    @Autowired
    private IAppInfoService appInfoService;

    /**
     * 根据id获取app信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/getAppInfo",method = RequestMethod.POST)
    @ResponseBody
    public Result<AppInfo> getAppInfo(@RequestParam long id){
        return appInfoService.getAppInfo(id);
    }


    @RequestMapping(value = "/addAppInfo",method = RequestMethod.POST,produces = MediaType.ALL_VALUE)
    @ResponseBody
    public Result addAppInfo(@RequestBody AppInfo appInfo){
        return appInfoService.addAppInfo(appInfo);
    }

    /**
     * 根据id获取app信息
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("/showAppInfo")
    public String toIndex(HttpServletRequest request, Model model){
        long appId = Long.parseLong(request.getParameter("id"));
        AppInfo appInfo = this.appInfoService.getAppInfoById(appId);
        model.addAttribute("appInfo",JSONObject.fromObject(appInfo).toString());
        return "showAppInfo";
    }

    /**
     * 分页获取app信息
     */
    @RequestMapping(value = "/getAppInfoList",method = RequestMethod.POST)
    @ResponseBody
    public Result<List<AppInfo>> getAppInfoList(@Valid AppInfoSearchParams appInfoSearchParams){
        List<AppInfo> appInfoList = this.appInfoService.queryAppInfoListWithoutCondition(appInfoSearchParams);
        Result result = new Result();
        if(appInfoList.size() == 0){
            result.setBizCode(4);
            result.setCode(404);
            result.setMsg("fail");
            return result;
        }
        result.setBizCode(4);
        result.setCode(200);
        result.setMsg("success");
        result.setData(appInfoList);
        return result;
    }

}
