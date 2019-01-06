# ding-appender
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.bpazy/ding-appender/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.bpazy/ding-appender)

Logback ding ding appender which send your log to your dingding group. Just like SMTPAppender send log to email.

## Usage
1. Create your group then add a bot and remember bot's access token.
2. Fill the logback.xml with the access token.
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
<appender name="ding" class="com.github.bpazy.dingappender.DingAppender">
    <accessToken>your_dingding_bot_access_token</accessToken>
</appender>

<appender name="asyncDing" class="ch.qos.logback.classic.AsyncAppender">
    <appender-ref ref="ding"/>
</appender>

<root level="ERROR">
    <appender-ref ref="asyncDing"/>
</root>
```
