package com.wjz.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface SinkSender {

    @Output("input")
    MessageChannel output();
}
