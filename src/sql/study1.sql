CREATE USER 'spring'@'localhost' IDENTIFIED BY 'spring123';
GRANT SELECT,INSERT,DELETE,UPDATE,CREATE ON study.* TO 'spring'@'localhost';

CREATE DATABASE study;

CREATE TABLE `user_info` (
 `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
 `user_id` VARCHAR(32) NOT NULL COMMENT '用户id',
 `user_account` VARCHAR(20) NOT NULL COMMENT '用户账号',
 `user_pwd` VARCHAR(100) NOT NULL COMMENT '用户密码，md5加密',
 `user_type` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '用户类型：0基本用户；1管理员',
 `user_status` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '用户状态：0生效；1失效',
 `remark`	VARCHAR(100) NOT NULL DEFAULT '' COMMENT '备注',
 `sys_ctime` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录创建时间',
 `sys_utime` DATEtIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '记录修改时间',
 `is_delete` TINYINT(4) NOT NULL DEFAULT '0' COMMENT '删除标志位 0未删除；1已删除',
 PRIMARY KEY(`id`),
 UNIQUE KEY `key_user_id` (`user_id`),
 UNIQUE KEY `key_user_account` (`user_account`)
)
COMMENT='系统用户表'
DEFAULT CHARSET=utf8
ENGINE=InnoDB
;


INSERT INTO user_info(user_id,user_account,user_pwd,remark) VALUES
('test1','xiaoming',MD5(123),'测试'),
('test2','xiaoli',MD5(123),'测试'),
('test3','zhangliang',MD5(123),'测试'),
('test4','liyunlong',MD5(123),'测试'),
('test5','xiexiaoli',MD5(123),'测试');