package me.lattice.rocketmq.producer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.io.UnsupportedEncodingException;

/**
 * 包含标签过滤的生产者
 * @author: lattice
 * @date: 2022/8/27 8:12
 */
@Slf4j
public class TagsProducer {

    public static void main(String[] args) throws MQClientException, UnsupportedEncodingException, MQBrokerException, RemotingException, InterruptedException {
        DefaultMQProducer mqProducer = new DefaultMQProducer("TOPIC_DEMO_GROUP_01");
        mqProducer.setNamesrvAddr("node1:9876");
        mqProducer.start();

        // 生产带标签的消息，供消费端根据标签过滤
        for (int i = 0; i < 100; i++) {
            Message message = new Message("TOPIC_DEMO_01",
                    "TAG-" + (i % 3),
                    ("Demo Message " + i).getBytes(RemotingHelper.DEFAULT_CHARSET));
            SendResult sendResult = mqProducer.send(message);
            log.info(sendResult.getSendStatus().toString());
        }
        Thread.sleep(3_000);
    }
}
