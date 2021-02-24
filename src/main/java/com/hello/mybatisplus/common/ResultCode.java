package com.hello.mybatisplus.common;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum ResultCode {

    SUCCESS(1, "响应成功"),
    USER_NOT_LOGIN(2, "用户未登录"),
    SIGN_ERROR(3, "签名错误"),
    TOKEN_ERROR(4, "没有权限"),
    NO_PERMISSION(5, "没有访问权限"),
    PARAM_ERROR(6, "参数错误"),
    DATA_NOT_EXIST(7, "数据不存在"),
    CAPTCHA_ERROR(8, "验证码错误"),
    LOGIN_ERROR(9, "登录错误"),
    DATA_EXIST(10, "数据已存在"),

    APPLICATION_ERROR(9000, "应用级错误"),
    VALIDATE_ERROR(9001, "参数验证错误"),
    SERVICE_ERROR(9002, "业务逻辑验证错误"),
    CACHE_ERROR(9003, "缓存访问错误"),
    DAO_ERROR(9004, "数据访问错误"),
    ERROR(9999, "未知错误"),

    INVOKE_ERROR(8000, "调用第三方系统异常"),
    RETURN_UNEXPECT_RESULT(8001, "调用第三方系统,返回非预期结果");

    private Integer code;
    private String message;

}
