package com.tencent.wxcloudrun.controller;

/**
 * @ClassName PushController
 * @Description TODO
 * @Author ydzhao
 * @Date 2022/8/2 15:48
 */

import com.tencent.wxcloudrun.util.Pusher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PushController {
    //要推送的用户openid
    private static String mxp = "odbd-6b1RhzrGEPCRT4rmmLKwpas";
    private static String zyd = "odbd-6U6ygdSTCwldsJ6qs0kxXeA";
    private static String slt = "o1PzK524LCDNF8OpfluFGZoT2xN4";


    /**
     * 微信测试账号推送
     *
     */
    @GetMapping("/push")
    public void push() {
        Pusher.push(mxp);
    }

    /**
     * 微信测试账号推送
     * */
    @GetMapping("/push/zyd")
    public void pushZyd() {
        Pusher.push(zyd);
    }


    /**
     * 微信测试账号推送
     * */
    @GetMapping("/push/slt")
    public void pushId() {
        Pusher.push(slt);
    }

    /**
     * 微信测试账号推送
     * */
    @GetMapping("/push/{id}")
    public void pushId(@PathVariable("id") String id) {
        Pusher.push(id);
    }
}