package com.meowrockweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

//以下为和服务器交互的代码
//发起一个Http服务请求只需要调用sendOkHttpRequest()方法
//传入请求地址,并注册一个回调来处理服务器响应即可
public class HttpUtil {
    public static void sendOkHttpRequest(String	address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
