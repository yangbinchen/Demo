/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.ai.aip.face;

import com.baidu.ai.aip.utils.HttpUtil;

/**
 * 人脸查找——删除
 */
public class Delete {

    public static void main(String[] args) {
        // 人脸查找——删除 url
        String deleteUrl = "https://aip.baidubce.com/rest/2.0/faceverify/v1/faceset/user/delete";
        try {
            // 请求参数
            // 用户ID
            String uid = "test_user_5";
            String params = "uid=" + uid;
            /**
             * 线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
             */
            String accessToken = "#####调用鉴权接口获取的token#####";
            String result = HttpUtil.post(deleteUrl, accessToken, params);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
