package com.hello.mybatis.plus.service;

import com.hello.mybatis.plus.entity.MidDept;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 同步广阳岛组织中间表 服务类
 * </p>
 *
 * @author Liuyongtao
 * @since 2021-03-24
 */
public interface MidDeptService extends IService<MidDept> {
    List<MidDept> getAll();
}
