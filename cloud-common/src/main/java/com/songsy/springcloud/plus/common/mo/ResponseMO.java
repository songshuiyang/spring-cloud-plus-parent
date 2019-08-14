package com.songsy.springcloud.plus.common.mo;

import java.io.Serializable;

/**
 * 接口返回实体类
 *
 * @author songsy
 * @date 2019/8/14 18:09
 */
public class ResponseMO<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final int RESPONSE_CODE_SUCCESS = 0;
    public static final int RESPONSE_CODE_FAILURE = 1;
    public static final int RESPONSE_CODE_RESOURCE_NOT_EXIST = 2;
    public static final int RESPONSE_CODE_ANONYMOUS = 10;
    public static final int RESPONSE_CODE_ACCESS_DENIED = 20;
    public static final int RESPONSE_CODE_LOGIN_OFF = 100;

    /**
     * 返回码 成功为0,失败为1
     */
    private int code = RESPONSE_CODE_SUCCESS;
    /**
     * 返回消息
     */
    private String message = "";
    /**
     * 返回对象
     */
    private T data;
    /**
     * 调试信息
     */
    private String debugInfo;

    public ResponseMO() {
    }

    public boolean checkFailure() {
        boolean result = false;
        if (this.code == RESPONSE_CODE_FAILURE) {
            result = true;
        }
        return result;
    }

    public void setResponseCodeFailure() {
        this.code = RESPONSE_CODE_FAILURE;
    }

    public void setAnonymous() {
        this.code = RESPONSE_CODE_ANONYMOUS;
    }

    public boolean isSuccess() {
        return RESPONSE_CODE_SUCCESS == this.code ? true : false;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getDebugInfo() {
        return debugInfo;
    }

    public void setDebugInfo(String debugInfo) {
        this.debugInfo = debugInfo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResponseMO{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", debugInfo='" + debugInfo + '\'' +
                '}';
    }
}
