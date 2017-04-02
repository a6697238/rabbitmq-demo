package com.houlu.test.service;


/**
 * 类名称: DirectQueueService <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 7/10/16 10:49 PM
 */
public interface FanoutQueueService {
    void sendDataToQueue(String queueKey, Object object);
}
