package com.system.domain.response.user;/**
 * Created by maven on 2017/3/9.
 */

import lombok.Data;

import java.io.Serializable;

/**
 * @author Maven
 *         <pre>
 *                                                             _oo0oo_
 *                                                            o8888888o
 *                                                            88" . "88
 *                                                            (| -_- |)
 *                                                            0\  =  /0
 *                                                          ___/`---'\___
 *                                                        .' \\|     |// '.
 *                                                       / \\|||  :  |||// \
 *                                                      / _||||| -:- |||||- \
 *                                                     |   | \\\  -  /// |   |
 *                                                     | \_|  ''\---/''  |_/ |
 *                                                     \  .-\__  '-'  ___/-. /
 *                                                   ___'. .'  /--.--\  `. .'___
 *                                                ."" '<  `.___\_<|>_/___.' >' "".
 *                                               | | :  `- \`.;`\ _ /`;.`/ - ` : | |
 *                                               \  \ `_.   \_ __\ /__ _/   .-` /  /
 *                                           =====`-.____`.___ \_____/___.-`___.-'=====
 *                                                             `=---='
 *                                           ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *                                                     佛祖开光         永无BUG
 *                                         </pre>
 */
@Data
public class UserResult implements Serializable {
    private static final long serialVersionUID = 667365946500074309L;
    private Integer staffId;
    private String code;
    private String pwd;
    private String staffRoster;
    private String staffName;
    private Integer departId;
    private String staffPost;
    private String staffPhone;
    private String staffEmail;
    private String insTm;
    private Byte leader;
    private Byte status;
    private String createTime;
    private String updateTime;
    private String departName;
}
