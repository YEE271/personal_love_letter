package com.tencent.wxcloudrun.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @ClassName JiNianRi
 * @Description TODO
 * @Author ydzhao
 * @Date 2022/8/2 17:32
 */
public class JiNianRi {
    /**
     * 恋爱
     */
    static String lianAi = "2022-05-20";

    /**
     * 生日
     */
    static String shengRi = "2022-12-14";

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * 距离date还有多少天
     * @param date
     * @return
     */
    public static int before(String date) {
        int day = 0;
        try {
            long time =System.currentTimeMillis() - simpleDateFormat.parse(date).getTime() ;
            day = (int) (time / 86400000L);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return day;
    }

    /**
     * 已经过去date多少天
     * @param date
     * @return
     */
    public static int after(String date) {
        int day = 0;
        try {
            long time = simpleDateFormat.parse(date).getTime()-System.currentTimeMillis()  ;
            day = (int) (time / 86400000L);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return day;
    }

//    public static int getJieHun() {
//        return before(jieHun);
//    }
//
//    public static int getLinZhen() {
//        return before(linZheng);
//    }

    public static int getLianAi() {
        return before(lianAi);
    }

    public static int getShengRi(){
        return after(shengRi);
    }

    public static int getNongLiShengRi() throws Exception {
        return after(CalendarUtil.lunarToSolar("1998-11-21", false));
    }

    public static void main(String[] args) throws Exception {

        System.out.println(getNongLiShengRi());
        System.out.println(getLianAi());

    }


}
