package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.util.Pusher;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 *@ClassName JobWorker
 *@Description TODO
 *@Author ydzhao
 *@Date 2022/8/2 16:00
 */
@Component
public class JobWorker {
    //要推送的用户openid
    private static String openId = "o1PzK524LCDNF8OpfluFGZoT2xN4";

//    @Scheduled(cron = "*/5 * * * * ?")  每隔五秒运行一次，测试使用。
    @Scheduled(cron = "0 30 7 * * ?")
    public void goodMorning(){
        Pusher.push(openId);
    }

}
