# ding-appender
![Maven](https://img.shields.io/maven-central/v/com.github.bpazy/ding-appender.svg)
[![Build Status](https://travis-ci.com/Bpazy/ding-appender.svg?branch=master)](https://travis-ci.com/Bpazy/ding-appender)
[![codecov](https://codecov.io/gh/Bpazy/ding-appender/branch/master/graph/badge.svg)](https://codecov.io/gh/Bpazy/ding-appender)

Logback ding ding appender which send your log to your dingding group. Just like SMTPAppender send log to email.

## Usage
1. Create your group then add a bot and remember bot's access token.
2. Add maven dependency `ding-appender` to your project.
3. Fill the logback.xml with the access token.
### synchronous appender
```xml
<configuration>
    <appender name="ding" class="com.github.bpazy.dingappender.DingAppender">
        <accessToken>your_dingding_bot_access_token</accessToken>
    </appender>
    
    <root level="ERROR">
        <appender-ref ref="ding"/>
    </root>
</configuration>
```
### asynchronous appender
```xml
<configuration>
    <appender name="ding" class="com.github.bpazy.dingappender.DingAppender">
        <accessToken>your_dingding_bot_access_token</accessToken>
    </appender>
    
    <appender name="asyncDing" class="ch.qos.logback.classic.AsyncAppender">
        <appender-ref ref="ding"/>
    </appender>
    
    <root level="ERROR">
        <appender-ref ref="asyncDing"/>
    </root>
</configuration>
```
