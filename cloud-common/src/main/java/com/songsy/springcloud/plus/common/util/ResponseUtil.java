package com.songsy.springcloud.plus.common.util;

import com.songsy.springcloud.plus.common.mo.ResponseMO;

/**
 * @author songsy
 * @date 2019/8/14 18:59
 */
public class ResponseUtil {

    public static ResponseMO response(int code, String msg, Object data, String debugInfo) {
        ResponseMO responseMO = new ResponseMO();
        responseMO.setCode(code);
        responseMO.setMessage(msg);
        responseMO.setData(data);
        responseMO.setDebugInfo(debugInfo);
        return responseMO;
    }

    public static ResponseMO response(int code, String msg, Object data) {
        return response(code, msg, data, null);
    }

    public static ResponseMO response(int code, String msg) {
        return response(code, msg, null, null);
    }

    public static ResponseMO success(String msg) {
        return response(ResponseMO.RESPONSE_CODE_SUCCESS, msg, null, null);
    }

    public static ResponseMO success() {
        return response(ResponseMO.RESPONSE_CODE_SUCCESS, null, null, null);
    }

    public static ResponseMO successWithData(Object data) {
        return response(ResponseMO.RESPONSE_CODE_SUCCESS, "操作成功", data, null);
    }

    public static ResponseMO successWithData(String msg, Object data) {
        return response(ResponseMO.RESPONSE_CODE_SUCCESS, msg, data, null);
    }

    public static ResponseMO error(int code, String message) {
        return response(code, message);
    }

    public static ResponseMO error(String message, String debugInfo) {
        return response(ResponseMO.RESPONSE_CODE_FAILURE, message, null, debugInfo);
    }

    public static ResponseMO error(String message) {
        return error(ResponseMO.RESPONSE_CODE_FAILURE, message);
    }

    public static ResponseMO errorWithData(String message, Object data) {
        return response(ResponseMO.RESPONSE_CODE_FAILURE, message, data, null);
    }

}
