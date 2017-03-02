package com.finger.appinfo;

import com.finger.appinfo.service.IAppInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by treebear on 2017/3/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/*.xml"})
public class DBTest {

    @Resource
    private IAppInfoService appInfoService;

    @Test
    public void test1(){
        long id = 1;
        System.out.println(appInfoService.getAppInfoById(1).getAppName());
    }

    @Test
    public void test2(){
        int startNo = 0;
        int pageSize = 20;
        System.out.println(appInfoService.queryAppInfoListWithoutCondition(startNo,pageSize).get(1).getAppName());
    }
}
