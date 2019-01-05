# ding-appender
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.bpazy/ding-appender/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.bpazy/ding-appender)

logback ding ding appender

## Usage
### synchronous appender
```xml
<appender name="ding" class="com.github.bpazy.dingappender.DingAppender">
    <accessToken>your_dingding_bot_access_token</accessToken>
</appender>

<root level="ERROR">
    <appender-ref ref="ding"/>
</root>
```
### asynchronous appender
```xml
<appender name="ding" class="ch.qos.logback.classic.AsyncAppender">
    <appender-ref>
        <appender class="com.github.bpazy.dingappender.DingAppender">
            <accessToken>your_dingding_bot_access_token</accessToken>
        </appender>
    </appender-ref>
</appender>

<root level="ERROR">
    <appender-ref ref="ding"/>
</root>
```
