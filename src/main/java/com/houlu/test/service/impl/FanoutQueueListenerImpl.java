package com.houlu.test.service.impl;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

import java.io.UnsupportedEncodingException;

/**
 * 类名称: DirectQueueListenerImpl <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 7/10/16 11:08 PM
 */
public class FanoutQueueListenerImpl implements MessageListener {
    @Override
    public void onMessage(Message message) {
        try {
            Object obj = new String(message.getBody(), "UTF-8");
            System.out.println("fanout queue listen" +obj);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
