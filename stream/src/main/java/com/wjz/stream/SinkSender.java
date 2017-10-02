package com.wjz.stream;

import com.wjz.stream.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

public interface SinkSender {

    @Output("input")
    MessageChannel output();
}
