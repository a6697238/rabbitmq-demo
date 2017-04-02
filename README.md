spring整合 rabbit的 配置例子

rabbitmq 的 典型用法参照官网 http://www.rabbitmq.com/getstarted.html
总共有六种

该例子实现了 2 种

1.直接消息队列发送

2.fanout交换机广播发送,在广播发送配置的过程中, queue name 不要穿,rabbitmq会自动 创建 匿名队列,然后 通过绑定的
  fanout交换机广播,consumer连接丢失以后自动销毁

