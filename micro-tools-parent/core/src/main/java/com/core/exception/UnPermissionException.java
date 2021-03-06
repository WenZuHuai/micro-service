/**
 * Project Name:mspj-shop-api
 * File Name:IllegalRequestException.java
 * Package Name:com.mspj.shop.api.common.exception
 * Date:2016年5月31日上午10:39:22
 * Copyright (c) 2016, 蚂上配件 Ltd. All Rights Reserved.
 */
package com.core.exception;

/**
 * ClassName: IllegalRequestException <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 *
 * @author 半轴
 * @date: 2016年5月31日 上午10:39:22 <br/>
 * @since JDK 1.8
 */
public class UnPermissionException extends MicroException {

    public UnPermissionException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     */
    public UnPermissionException(String message) {
        super(ErrorHolder.getMessage(ErrorHolder.CodeTemp.NO_PERMISSION, message));
        this.setErrorCode(ErrorHolder.getCode(ErrorHolder.CodeTemp.NO_PERMISSION));
    }

    /**
     * @param message
     * @param errorCode
     */
    public UnPermissionException(String message, String errorCode) {
        super(message, errorCode);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param message
     * @param errorCode
     * @param cause
     */
    public UnPermissionException(String message, String errorCode, Throwable cause) {
        super(message, errorCode, cause);
        // TODO Auto-generated constructor stub
    }
}
