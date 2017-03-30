/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.ai.aip.face;

import com.baidu.ai.aip.utils.Base64Util;
import com.baidu.ai.aip.utils.FileUtil;
import com.baidu.ai.aip.utils.HttpUtil;

import java.net.URLEncoder;

/**
 * 人脸查找——认证
 */
public class Verify {

    public static void main(String[] args) {
        // 人脸查找——认证url （已知用户ID，根据人脸图片来验证）
        String verifyUrl = "https://aip.baidubce.com/rest/2.0/faceverify/v1/verify";
        // 请求参数
        // 用户ID
        String uid = "test_user_1";
        // 返回匹配得分top数，默认为1
        String topNum = "1";
        // 本地文件路径
        String filePath1 = "#####本地文件路径#####";
        String filePath2 = "#####本地文件路径#####";
        try {
            byte[] imgData1 = FileUtil.readFileByBytes(filePath1);
            byte[] imgData2 = FileUtil.readFileByBytes(filePath2);
            String imgStr1 = Base64Util.encode(imgData1);
            String imgStr2 = Base64Util.encode(imgData2);

            String params = "uid=" + uid + "&top_num=" + topNum + "&" + URLEncoder.encode("images", "UTF-8") + "="
                    + URLEncoder.encode(imgStr1 + "," + imgStr2, "UTF-8");
            /**
             * 线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
             */
            String accessToken = "#####调用鉴权接口获取的token#####";
            String result = HttpUtil.post(verifyUrl, accessToken, params);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
