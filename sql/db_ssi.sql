DROP DATABASE if EXISTS db_ssi;
CREATE DATABASE db_ssi;

USE db_ssi;

DROP TABLE IF EXISTS db_ssi.user;
CREATE TABLE db_ssi.user(
  id  INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY ,
  username VARCHAR(255) NOT NULL ,
  password VARCHAR(255) NOT NULL ,
  role CHAR(1) COMMENT 'a-admin, u-user'
);



