package com.wjz.stream;

import com.wjz.stream.vo.TestVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;

@Slf4j
@EnableBinding({Sink.class,SinkSender.class})
public class SinkReceiver {

    @StreamListener(Sink.INPUT)
    public void receive(Message<TestVO> message){
        log.info(message.getPayload().toString());
    }
}
