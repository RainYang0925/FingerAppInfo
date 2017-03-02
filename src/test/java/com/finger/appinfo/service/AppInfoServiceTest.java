package com.finger.appinfo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by treebear on 2017/3/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/*.xml"})
public class AppInfoServiceTest {

    @Autowired
    private IAppInfoService appInfoService;

    @Test
    public void test1(){

//        appInfoService.addAppInfo()
    }

}
