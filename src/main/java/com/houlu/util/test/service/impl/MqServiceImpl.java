package com.houlu.util.test.service.impl;

import com.houlu.util.test.service.MqService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 类名称: MqServiceImpl <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 7/10/16 10:49 PM
 */
@Component
public class MqServiceImpl implements MqService{

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Override
    public void sendDataToQueue(String queueKey, Object object) {
        try {
            amqpTemplate.convertAndSend(queueKey, object);
        } catch (Exception e) {
        }
    }
}
