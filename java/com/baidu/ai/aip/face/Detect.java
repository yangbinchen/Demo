/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.ai.aip.face;

import com.baidu.ai.aip.utils.Base64Util;
import com.baidu.ai.aip.utils.FileUtil;
import com.baidu.ai.aip.utils.HttpUtil;

import java.net.URLEncoder;

/**
 * 人脸探测
 */
public class Detect {

    public static void main(String[] args) {
        // 人脸检测 url
        String detectUrl = "https://aip.baidubce.com/rest/2.0/face/v1/detect";
        // 本地文件路径
        String filePath = "#####本地文件路径#####";
        try {
            byte[] imgData = FileUtil.readFileByBytes(filePath);
            String imgStr = Base64Util.encode(imgData);
            System.out.println("imgStr:" + imgStr);
            // face_fields 自定之指定返回的人脸特征值
            String params =
                    "max_face_num=5&face_fields=age,beauty,expression,faceshape,gender,glasses,landmark,race,qualities&"
                            + URLEncoder.encode("image", "UTF-8") + "=" + URLEncoder.encode(imgStr, "UTF-8");
            /**
             * 线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
             */
            String accessToken = "#####调用鉴权接口获取的token#####";
            String result = HttpUtil.post(detectUrl, accessToken, params);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
