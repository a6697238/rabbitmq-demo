package com.houlu.util.test.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 类名称: com.houlu.util.test.service.TestClient <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 7/10/16 11:14 PM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/struggle-notifier-core-spring/core.xml" })
public class TestClient {

    @Autowired
    MqService mqService;

    @Test
    public void main() throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/struggle-notifier-core-spring/core.xml");
        MqService m = (MqService) context.getBean("mqServiceImpl");
        while (true){
            m.sendDataToQueue("aa","aa");

            Thread.sleep(100);
        }
      //  MqService mqService = (MqService) context.getBean("mqService");
     //   com.houlu.util.test.service.TestClient t = new TestClient();
//        System.out.println(m);
    }
}
