package com.mxh.mqdemo.mymq.v1.core;

public class MessageQueue {

    private KmqMessage<?>[] messages;

    int offset;

    public boolean send(KmqMessage message) {
        messages[offset++] = message;
        return true;
    }

    public KmqMessage poll() {
        return messages[offset--];
    }
}
