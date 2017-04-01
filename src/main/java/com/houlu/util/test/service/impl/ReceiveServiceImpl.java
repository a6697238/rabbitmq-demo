package com.houlu.util.test.service.impl;

import com.houlu.util.test.service.ReceiveService;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/**
 * 类名称: ReceiveServiceImpl <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 7/10/16 11:08 PM
 */
public class ReceiveServiceImpl implements ReceiveService,MessageListener {
    @Override
    public void onMessage(Message message) {
        System.out.println(message.getBody());
    }
}
