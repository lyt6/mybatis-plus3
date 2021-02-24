package com.hello.mybatisplus.common;


import lombok.Data;


@Data
public class ResultVO<T>{

    private T data;
    private Integer code;
    private String msg;

    public ResultVO() {
    }
    public ResultVO(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public ResultVO(T data, Integer code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static ResultVO fail() {
        return new ResultVO<>(ResultCode.ERROR.getCode(), ResultCode.ERROR.getMessage());
    }
    public static ResultVO fail(Integer code, String msg) {
        return new ResultVO<>(code, msg);
    }

    public static ResultVO success() {
        return new ResultVO<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage());
    }
    public static <T> ResultVO<T> success(T data) {
        return new ResultVO<>(data,ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage());
    }

}
