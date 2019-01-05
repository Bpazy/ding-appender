package com.github.bpazy.dingappender;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author ziyuan
 */
@Slf4j
public class DingAppenderTest {
    @Test
    @SneakyThrows
    public void test() {
        log.debug("this is a log and level is debug");
        log.info("this is a log and level is info");
        log.warn("this is a log and level is warn");
        log.error("this is a log and level is error");
        Thread.sleep(1000);
    }
}