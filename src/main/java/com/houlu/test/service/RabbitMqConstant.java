package com.houlu.test.service;

/**
 * 类名称: RabbitMqConstant <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/4/2 上午10:25
 */
public class RabbitMqConstant {

    public final static String time = String.valueOf(System.currentTimeMillis());

    public final static String DIRECT_QUEUE = "directQueue";
    public final static String DIRECT_EXCHANGE = "direct_exchange";
    public final static String FANOUT_EXCHANGE = "fanout_exchange";
    public final static String DIRECT_TEMPLATE = "directTemplateBean";
    public final static String FANOUT_TEMPLATE = "fanoutTemplateBean";



}
