CREATE TABLE `user` (
    `id` bigint(20) NOT NULL COMMENT '主键ID' primary key auto_increment,
    `name` varchar(30) DEFAULT NULL COMMENT '姓名',
    `age` int(11) DEFAULT NULL COMMENT '年龄',
    `email` varchar(50) DEFAULT NULL COMMENT '邮箱'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO user (id, name, age, email) VALUES (1, 'Jone', 18, 'test1@baomidou.com');
INSERT INTO user (id, name, age, email) VALUES (2, 'Jack', 20, 'test2@baomidou.com');
INSERT INTO user (id, name, age, email) VALUES (3, 'Tom', 28, 'test3@baomidou.com');
INSERT INTO user (id, name, age, email) VALUES (4, 'Sandy', 21, 'test4@baomidou.com');
INSERT INTO user (id, name, age, email) VALUES (5, 'Billie', 24, 'test5@baomidou.com');

CREATE TABLE `gyd_mid_dept` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `deleted` tinyint(1) DEFAULT '0' COMMENT '是否删除 1：删除；0：否',
    `oa_id` bigint(20) DEFAULT NULL COMMENT 'oa主键id',
    `oa_pid` bigint(20) DEFAULT NULL COMMENT 'oa父节点id',
    `code` varchar(256) DEFAULT '' COMMENT '部门编码',
    `name` varchar(256) DEFAULT '' COMMENT '部门名称',
    `pin_yin` varchar(256) DEFAULT '' COMMENT '拼音',
    `jian_pin` varchar(256) DEFAULT '' COMMENT '简拼',
    `short_name` varchar(128) DEFAULT '' COMMENT '简称',
    `full_id` varchar(1024) DEFAULT '' COMMENT '部门全Id',
    `full_code` varchar(1024) DEFAULT '' COMMENT '部门全编码',
    `full_name` varchar(1024) DEFAULT '' COMMENT '部门全名称',
    `node_level` decimal(10,0) DEFAULT '0' COMMENT '部门层级',
    `order_num` int(8) DEFAULT '0' COMMENT '排序',
    `is_leaf` tinyint(1) DEFAULT '0' COMMENT '是否叶子节点 1：是；0：否',
    `state` tinyint(1) DEFAULT '0' COMMENT '数据状态 1：正常；0：否',
    `version` int(16) DEFAULT '0' COMMENT '版本',
    `platform_dept_id` bigint(20) DEFAULT NULL COMMENT '平台部门id',
    `sync_type` int(2) DEFAULT '0' COMMENT '同步类型 1增加 2删除 3修改',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='同步广阳岛组织中间表';

CREATE TABLE `gyd_mid_user` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `oa_id` bigint(20) DEFAULT NULL COMMENT 'oa主键id',
    `oa_dept_id` bigint(20) DEFAULT NULL COMMENT 'oa部门id',
    `code` varchar(256) DEFAULT '' COMMENT '部门编码',
    `name` varchar(256) DEFAULT '' COMMENT '部门名称',
    `sex` varchar(2) DEFAULT '' COMMENT '1男，2女',
    `order_num` int(8) DEFAULT '0' COMMENT '排序',
    `pin_yin` varchar(256) DEFAULT '' COMMENT '拼音',
    `jian_pin` varchar(256) DEFAULT '' COMMENT '简拼',
    `documents_type` int(2) DEFAULT '0' COMMENT '证件类型',
    `id_number` varchar(32) DEFAULT '' COMMENT '证件号',
    `enterprise_email` varchar(256) DEFAULT '' COMMENT '企业邮箱',
    `personal_email` varchar(256) DEFAULT '' COMMENT '个人邮箱',
    `work_phone` varchar(256) DEFAULT '' COMMENT '工作电话',
    `mobile_phone` varchar(256) DEFAULT '' COMMENT '移动电话',
    `work_location` varchar(256) DEFAULT '' COMMENT '工作地点',
    `deleted` tinyint(1) DEFAULT '0' COMMENT '是否删除 1：删除；0：否',
    `version` int(16) DEFAULT '0' COMMENT '版本',
    `platform_user_id` bigint(20) DEFAULT NULL COMMENT '平台用户id',
    `sync_type` int(2) DEFAULT '0' COMMENT '同步类型 1增加 2删除 3修改',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='同步广阳岛人员中间表';