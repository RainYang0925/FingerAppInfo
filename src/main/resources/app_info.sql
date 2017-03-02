/*
Navicat MySQL Data Transfer

Source Server         : 本机
Source Server Version : 50634
Source Host           : 127.0.0.1:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50634
File Encoding         : 65001

Date: 2017-03-02 18:12:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for app_info
-- ----------------------------
DROP TABLE IF EXISTS `app_info`;
CREATE TABLE `app_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `app_name` varchar(150) DEFAULT NULL COMMENT '安装包名称',
  `os_name` varchar(50) DEFAULT NULL COMMENT '手机系统（Android, IOS）',
  `config` varchar(50) DEFAULT NULL COMMENT '环境（测试-1，仿真-2，线上-3）',
  `versions` varchar(50) DEFAULT NULL COMMENT '版本号',
  `app_path` varchar(200) DEFAULT NULL COMMENT '安装包地址',
  `qrcode_path` varchar(150) DEFAULT NULL COMMENT '二维码图片地址',
  `app_time` datetime DEFAULT NULL COMMENT '安装包生成时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1624 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
