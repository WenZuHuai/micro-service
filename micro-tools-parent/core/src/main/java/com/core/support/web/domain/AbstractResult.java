/**
 * Project Name:mspjcore
 * File Name:AbstractResult.java
 * Package Name:com.mspj.framework.core.domain
 * Date:2016年6月3日下午4:51:35
 * Copyright (c) 2016, 蚂上配件 Ltd. All Rights Reserved.
 */
package com.core.support.web.domain;

import lombok.Data;

/**
 * ClassName: AbstractResult <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 *
 * @author 半轴
 * @date: 2016年6月3日 下午4:51:35 <br/>
 * @version
 * @since JDK 1.8
 */
@Data
public class AbstractResult {
    /**
     * @fields status 状态信息，正确返回OK，否则返回 ERROR，如果返回ERROR则需要填写Message信息
     */
    // private Status status;
    /** 1表示成功 0表示失敗 */
    private int flag;
    /**
     * @fields record 消息对象
     */
    // private Object message;
    private String msg;

    public AbstractResult() {
    }

    public AbstractResult(int flag) {
        this.flag = flag;
    }

    public AbstractResult(int flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }


}
