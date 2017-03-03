package cn.codingstar.common.constant;

/**
 * Description: ResultType
 *
 * @author iCodingStar
 * @version 1.0
 *          Filename:    ResultType.java
 *          Create at:   2017/3/2
 *          <p>
 *          Copyright:   Copyright (c)2016
 *          <p>
 *          Modification History:
 *          Date                  Author         Version    Description
 *          ------------------------------------------------------------------
 *          2017/3/2           iCodingStar       1.0       1.0 Version
 */
public enum ResultType {
    SUCCESS(200, "请求成功"),
    FAIL(500, "未知错误"),
    LOGIN_SUCCESS(200, "登陆成功");

    private int code;

    private String message;

    ResultType() {
    }

    ResultType(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
