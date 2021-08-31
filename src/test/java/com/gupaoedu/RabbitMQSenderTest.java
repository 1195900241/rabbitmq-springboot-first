package com.gupaoedu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author Mike
 * @date 2021/8/31 0031 16:55
 */
@RunWith(SpringRunner.class)
@WebAppConfiguration
@SpringBootTest
public class RabbitMQSenderTest {
    @Autowired
    private Sender sender;

    @Test
    public void hello() throws Exception {
        sender.send();
    }
}
