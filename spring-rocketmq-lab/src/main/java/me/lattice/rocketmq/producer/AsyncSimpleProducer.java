package me.lattice.rocketmq.producer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.apache.rocketmq.remoting.protocol.RemotingCommand;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * @author: lattice
 * @date: 2022/8/21 13:19
 */
@Slf4j
public class AsyncSimpleProducer {

    public static void main(String[] args) throws MQClientException, MQBrokerException, RemotingException, InterruptedException, UnsupportedEncodingException {
        DefaultMQProducer producer = new DefaultMQProducer("simple_test_group");

        // 设置NameServer地址
        producer.setNamesrvAddr("192.168.2.246:9876");

        // 启动生产者
        producer.start();

        // 设置message信息
        Message message = new Message();
        message.setTopic("SIMPLE_TEST_TOPIC_01");
        message.setBody("SIMPLE_TEST_TOPIC_01 first rocketmq message".getBytes(RemotingHelper.DEFAULT_CHARSET));

        SendResult sendResult = producer.send(message);

        log.info("发送结果:{}", sendResult);

        // 关闭生产者
        producer.shutdown();

    }
}
