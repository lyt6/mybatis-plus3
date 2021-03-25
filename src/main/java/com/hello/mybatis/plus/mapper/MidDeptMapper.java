package com.hello.mybatis.plus.mapper;

import com.hello.mybatis.plus.entity.MidDept;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 同步广阳岛组织中间表 Mapper 接口
 * </p>
 *
 * @author Liuyongtao
 * @since 2021-03-24
 */
public interface MidDeptMapper extends BaseMapper<MidDept> {

    List<MidDept> getAll();

}
