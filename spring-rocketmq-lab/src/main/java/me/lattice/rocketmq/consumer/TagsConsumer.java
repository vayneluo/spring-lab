package me.lattice.rocketmq.consumer;

import lombok.extern.slf4j.Slf4j;
import me.lattice.rocketmq.constants.UserMqConstants;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageQueue;

/**
 * 包含标签过滤的消费者
 * @author: lattice
 * @date: 2022/8/27 8:22
 */
@Slf4j
public class TagsConsumer {

    public static void main(String[] args) throws MQClientException {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("CONSUMER_DEMO_GROUP_01_01");
        consumer.setNamesrvAddr(UserMqConstants.NAMESERVER_ADDR);
        // 单个tag过滤
        // consumer.subscribe("TOPIC_DEMO_01", "TAG-1");
        // 多个tag过滤
        // consumer.subscribe("TOPIC_DEMO_01", "TAG-0||TAG-1");
        // 不进行tag过滤
        consumer.subscribe("TOPIC_DEMO_01", "*");

        // 添加消息监听器，打印收到的消息
        consumer.setMessageListener((MessageListenerConcurrently) (msgList, context) -> {
            msgList.forEach(msgExt -> log.info(msgExt.toString()));
            return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
        });
        consumer.start();

    }
}
