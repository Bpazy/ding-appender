package com.github.bpazy.dingappender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author ziyuan
 */
@Data
public class DingMessage {
    private String msgtype = "text";
    private Text text;
    private At at;

    public static DingMessage defaultMessage(String content) {
        DingMessage message = new DingMessage();

        message.setText(new Text(content));
        return message;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    private static class Text {
        private String content;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    private static class At {
        private List<String> atMobiles;
        private boolean isAtAll;
    }
}
