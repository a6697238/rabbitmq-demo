package com.houlu.test.service.impl;

import com.houlu.test.service.DirectQueueService;
import com.houlu.test.service.FanoutQueueService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 类名称: MqServiceImpl <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 7/10/16 10:49 PM
 */
@Component
public class DirectQueueServiceImpl implements DirectQueueService {

    @Resource(name = "directTemplate")
    private AmqpTemplate directTemplate;

    @Override
    public void sendDataToQueue(String queueKey, Object object) {
        try {
            directTemplate.convertAndSend(queueKey, object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
