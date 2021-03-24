package com.hello.mybatis.plus.entity;
import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import com.hello.mybatis.plus.enums.SyncTypeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;
/**
 * <p>
 * 同步广阳岛组织中间表
 * </p>
 *
 * @author Liuyongtao
 * @since 2021-03-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("gyd_mid_dept")
public class MidDept implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * oa主键id
     */
    private Long oaId;

    /**
     * oa父节点id
     */
    private Long oaPid;

    /**
     * 部门编码
     */
    private String code;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 拼音
     */
    private String pinYin;

    /**
     * 简拼
     */
    private String jianPin;

    /**
     * 简称
     */
    private String shortName;

    /**
     * 部门全Id
     */
    private String fullId;

    /**
     * 部门全编码
     */
    private String fullCode;

    /**
     * 部门全名称
     */
    private String fullName;

    /**
     * 部门层级
     */
    private BigDecimal nodeLevel;

    /**
     * 排序
     */
    private Integer orderNum;

    /**
     * 是否叶子节点 1：是；0：否
     */
    private Boolean isLeaf;

    /**
     * 数据状态 1：正常；0：否
     */
    private Boolean state;

    /**
     * 是否删除 1：删除；0：否
     */
    private Boolean deleted;

    /**
     * 版本
     */
    private Integer version;

    /**
     * 平台部门id
     */
    private Long platformDeptId;

    /**
     * 同步类型 1增加 2删除 3修改
     */
    private SyncTypeEnum syncType;

}
