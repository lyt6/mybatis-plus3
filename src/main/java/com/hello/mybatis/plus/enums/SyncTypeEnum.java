package com.hello.mybatis.plus.enums;

import com.baomidou.mybatisplus.annotation.IEnum;

public enum SyncTypeEnum implements IEnum<Integer> {
    ADD(1, "新增"),
    DELETE(2, "修改"),
    UPDATE(3, "删除");

    private int value;
    private String desc;

    @Override
    public Integer getValue() {
        return this.value;
    }

    public String getDesc() {
        return desc;
    }

    SyncTypeEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

}