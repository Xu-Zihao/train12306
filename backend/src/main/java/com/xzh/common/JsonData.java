package com.xzh.common;

import lombok.Data;

import javax.json.Json;

@Data
public class JsonData {

    private final static int SYSTEM_ERROR=1;
    private boolean ret;

    private String msg;

    private  Object data;

    private int code=0; //0表示成功

    public JsonData(boolean ret){
        this.ret=ret;
    }

    public static JsonData success(){
        return new JsonData(true);
    }

    public static JsonData success(Object data){
        JsonData jsonData = new JsonData(true);
        jsonData.data=data;
        return jsonData;
    }

    public static JsonData success(Object data, String msg){
        JsonData jsonData = new JsonData(true);
        jsonData.data=data;
        jsonData.msg=msg;
        return jsonData;
    }

    public static JsonData fail(String msg){
        JsonData jsonData = new JsonData(false);
        jsonData.code = SYSTEM_ERROR;
        jsonData.msg=msg;
        return jsonData;
    }

    public static JsonData fail(int code, String msg){
        JsonData jsonData = new JsonData(false);
        jsonData.code = code;
        jsonData.msg=msg;
        return jsonData;
    }
}
