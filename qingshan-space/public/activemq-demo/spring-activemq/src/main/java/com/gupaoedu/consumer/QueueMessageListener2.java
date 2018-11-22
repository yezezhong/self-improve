package com.gupaoedu.consumer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class QueueMessageListener2 implements MessageListener {
    @Override
    public void onMessage(Message message) {
        TextMessage tm = (TextMessage) message;
        try {
            System.out.println("QueueMessageListener2 received msg : " + tm.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
