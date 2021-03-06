DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order`
(
  `id`        bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `order_id`  varchar(32) DEFAULT NULL COMMENT '顺序编号',
  `user_id`   varchar(32) DEFAULT NULL COMMENT '用户编号',
  `userName`  varchar(32) DEFAULT NULL COMMENT '用户名',
  `passWord`  varchar(32) DEFAULT NULL COMMENT '密码',
  `user_sex`  varchar(32) DEFAULT NULL,
  `nick_name` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE = InnoDB  AUTO_INCREMENT = 28  DEFAULT CHARSET = utf8;