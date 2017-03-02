package cn.codingstar.common.result;

/**
 * Description: ApiResult api结果返回数据类
 *
 * @author iCodingStar
 * @version 1.0
 *          Filename:    ApiResult.java
 *          Create at:   2017/3/2
 *          <p>
 *          Copyright:   Copyright (c)2016
 *          <p>
 *          Modification History:
 *          Date                  Author         Version    Description
 *          ------------------------------------------------------------------
 *          2017/3/2           iCodingStar       1.0       1.0 Version
 */
public class ApiResult<T> {

    /*返回代码*/
    private Integer code;

    /*返回信息*/
    private String message;

    /*返回数据*/
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
