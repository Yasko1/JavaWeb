-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: example
-- ------------------------------------------------------
-- Server version	5.7.26-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user` (
  `id_user` bigint(20) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) COLLATE utf8_bin DEFAULT NULL COMMENT 'First name of user.',
  `last_name` varchar(45) COLLATE utf8_bin DEFAULT NULL COMMENT 'Last name of user.',
  `username` varchar(45) COLLATE utf8_bin DEFAULT NULL COMMENT 'Username.',
  `email` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT 'Email of user.',
  `password` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT 'Password of user.',
  `role` enum('user','admin') COLLATE utf8_bin NOT NULL,
  `is_banned` tinyint(1) DEFAULT '0',
  `balance` decimal(10,2) DEFAULT '0.00',
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB AUTO_INCREMENT=108 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='user characteristics';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Hanna','Yasko','admin','hannayasko@gmail.com','admin','admin',0,0.00);
INSERT INTO `user` VALUES (101,'Alexander','Kursov','akursov','alex101@gmail.com','alex101','user',0,1000000.00);
INSERT INTO `user` VALUES (102,'Alexander','Shitzu','ashitzu','alex102@gmail.com','alex102','user',0,9000000.00);
INSERT INTO `user` VALUES (103,'Tatyana','Romanovskaya','ashitzu','alex102@gmail.com','tatyana103','user',0,100000.00);
INSERT INTO `user` VALUES (104,'Maria','Shantarenko','mshantarenko','maria104@gmail.com','maria104','user',0,9999.00);
INSERT INTO `user` VALUES (105,'Elena','Hall','ehall','ehall105@gmail.com','elena105','user',0,8888.00);
INSERT INTO `user` VALUES (106,'Sophia','Dorateya','sdorateya','sdorateya106@gmail.com','Sophia106','user',0,690000.00);
INSERT INTO `user` VALUES (107,'Angelina','Bennet','abennet','Angelina107@gmail.com','Angelina107','user',0,0.00);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-08-15  1:45:07
