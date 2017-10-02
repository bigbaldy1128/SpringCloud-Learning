package com.wjz.stream;

import com.wjz.stream.vo.TestVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StreamApplicationTests {
	@Autowired
	private SinkSender sinkSender;

	@Test
	public void test1() {
		TestVO testVO=new TestVO();
		testVO.setField1("字段1");
		testVO.setField2("字段2");
		sinkSender.output().send(MessageBuilder.withPayload(testVO).build());
	}

}
