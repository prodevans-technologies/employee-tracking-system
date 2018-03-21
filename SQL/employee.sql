/*
SQLyog - Free MySQL GUI v5.02
Host - 5.5.59 : Database - employeetracker
*********************************************************************
Server version : 5.5.59
*/


create database if not exists `employeetracker`;

USE `employeetracker`;

/*Table structure for table `login_table` */

DROP TABLE IF EXISTS `login_table`;

CREATE TABLE `login_table` (
  `employee_id` int(50) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `role` varchar(20) DEFAULT NULL,
  `user_cost` double(5,2) DEFAULT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `login_table` */

/*Table structure for table `work_table` */

DROP TABLE IF EXISTS `work_table`;

CREATE TABLE `work_table` (
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  `user` varchar(50) DEFAULT NULL,
  `activity` varchar(50) DEFAULT NULL,
  `project` varchar(50) DEFAULT NULL,
  `work_package` varchar(50) DEFAULT NULL,
  `jira_task` varchar(50) DEFAULT NULL,
  `type` varchar(100) DEFAULT NULL,
  `subject` tinytext,
  `hours` int(11) DEFAULT NULL,
  `comment` tinytext,
  `work_id` int(3) NOT NULL,
  PRIMARY KEY (`work_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `work_table` */
