package com.houlu.test.service;



import com.houlu.test.service.bean.Message;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 类名称: TestClient <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 7/10/16 11:14 PM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring-core.xml" })
public class TestClient {

    @Autowired
    DirectQueueService directQueueService;
    @Autowired
    FanoutQueueService fanoutQueueService;

    @Test
    public void main() throws InterruptedException {
        while (true){
//            Message message =new Message();
//            message.setMessageContent("ceshi");
//            message.setMessageId("01");
//            message.setMessageType("direcet");
//            fanoutQueueService.sendDataToQueue(RabbitMqConstant.DIRECT_QUEUE,message);
            Thread.sleep(3000);
        }
    }
}
