package com.core.support.web.domain;

import com.alibaba.fastjson.JSON;
import com.core.exception.ErrorHolder;
import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: ApiResult <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 *
 * @author 半轴
 * @date: 2016年5月31日 下午12:44:20 <br/>
 * @since JDK 1.8
 */
@Data
public class DefaultResult<T> implements Serializable {

    private static final long serialVersionUID = -1514168386299353908L;
    private T data;
    private String code = ErrorHolder.CodeTemp.SUCCESS.getCode();
    private String message;

    public DefaultResult() {
        super();
    }

    public DefaultResult(String message, String code) {
        this.code = code;
        this.message = message;
    }

    public DefaultResult(String msg, String code, T data) {
        this(msg, code);
        this.data = data;
    }

    public DefaultResult(T data) {
        this.setData(data);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
