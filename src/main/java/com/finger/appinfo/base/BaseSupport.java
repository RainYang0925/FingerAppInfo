package com.finger.appinfo.base;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.sql.DataSource;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;



/**
 * Create by 古月随笔
 */
//@RunWith(Feeder.class)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/spring-jdbc.xml","classpath*:spring/spring-service.xml"})
public class BaseSupport {
    private static Log log = LogFactory.getLog(BaseSupport.class);

    @Autowired
    public JdbcTemplate jdbcClient;

    @Autowired
    public DataSource dataSource;

    public static DecimalFormat decimalFormat = new DecimalFormat("###");//格式化设置


    /**
     * 生成9位随机数
     *
     * @return 9位随机数
     */
    public static String generateNumberRandom() {
        return decimalFormat.format(Math.random() * 100000 + 100000);
    }

    /**
     * 生成11位电话号码
     *
     * @return 11位电话号码
     */
    protected static String generatePhoneNumber() {
        List<Long> frontPhone = new ArrayList<Long>();
        frontPhone.add(18000000000l);
        frontPhone.add(17000000000l);
        frontPhone.add(15000000000l);
        frontPhone.add(13000000000l);
        Random rand = new Random();

        return decimalFormat.format(Math.random() * 1000000000 + frontPhone.get(rand.nextInt(frontPhone.size())));
    }

    /**
     * 生成32位uuid
     *
     * @return
     */
    protected static String generateUUID() {
        return UUID.randomUUID().toString();
    }

}
