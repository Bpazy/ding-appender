package com.github.bpazy.dingappender;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;

/**
 * @author ziyuan
 */
public class DingAppender extends AppenderBase<ILoggingEvent> {
    private Gson gson = new Gson();
    private HttpClient client = HttpClients.createDefault();

    private String url = "https://oapi.dingtalk.com/robot/send?access_token=";
    @Getter
    @Setter
    private String accessToken;

    @Override
    public void start() {
        super.start();
        url += accessToken;
    }

    @Override
    @SneakyThrows
    protected void append(ILoggingEvent eventObject) {
        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("Content-type", "application/json");
        httpPost.setEntity(new StringEntity(gson.toJson(DingMessage.defaultMessage(eventObject.getFormattedMessage())), "UTF8"));
        client.execute(httpPost);
    }
}
