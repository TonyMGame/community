/*
package com.individual.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;
import javax.jms.Topic;

@RestController
//@RequestMapping("/publish")
public class MQ {
    @Autowired
    private JmsMessagingTemplate jms;
    @Autowired
    private Queue queue;
    @Autowired
    private Topic topic;

    @JmsListener(destination = "out.queue")
    public void consumerMsg(String msg) {
        System.out.println("订阅消息为"+msg);
    }

    @RequestMapping("/topic")
    @ResponseBody
    public String topic() {
        jms.convertAndSend(topic, "topic666666");
        return "topic 发送成功";
    }

    @JmsListener(destination = "AAAAA")
    public void consumerMsgA(String msg) {
        System.out.println(msg);
    }

    @RequestMapping("/queue")
    public String queue() {
        for (int i = 0; i < 10; i++) {
            jms.convertAndSend(queue, "queue" + i);
        }
        return "queue 发送成功";
    }
}
*/
