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
-- Table structure for table `picture`
--

DROP TABLE IF EXISTS `picture`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `picture` (
  `id_lot` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `year_of_painting` date DEFAULT NULL,
  `painter` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id_lot`),
  KEY `id_picture_UNIQUE` (`id_lot`),
  KEY `painter_UNIQUE` (`painter`),
  CONSTRAINT `fk_lot_picture` FOREIGN KEY (`id_lot`) REFERENCES `lot` (`id_lot`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=1017 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `picture`
--

LOCK TABLES `picture` WRITE;
/*!40000 ALTER TABLE `picture` DISABLE KEYS */;
INSERT INTO `picture` VALUES (1001,'Elephants','2001-03-03',10001);
INSERT INTO `picture` VALUES (1002,'Парень','2017-03-07',10002);
INSERT INTO `picture` VALUES (1003,'Moment','2013-01-01',10003);
INSERT INTO `picture` VALUES (1004,'The Village','2014-01-01',10001);
INSERT INTO `picture` VALUES (1005,'Погружение','2018-03-30',10001);
INSERT INTO `picture` VALUES (1006,'MERIGGIARE PALLIDO E ASSORTO','2019-04-03',10006);
INSERT INTO `picture` VALUES (1007,'Predel','2015-01-01',10007);
INSERT INTO `picture` VALUES (1008,'M','2008-01-01',10017);
INSERT INTO `picture` VALUES (1009,'Somewhere','2009-01-01',10007);
INSERT INTO `picture` VALUES (1010,'Sunset','2010-01-01',10007);
INSERT INTO `picture` VALUES (1011,'На краю','2011-01-01',10002);
INSERT INTO `picture` VALUES (1012,'Heel','2002-01-01',10004);
INSERT INTO `picture` VALUES (1013,'Eight','2013-01-01',10004);
INSERT INTO `picture` VALUES (1014,'Adónde vas','2014-01-01',10005);
INSERT INTO `picture` VALUES (1015,'Realidad','2005-01-01',10005);
INSERT INTO `picture` VALUES (1016,'En un mundo paralelo','2006-01-01',10005);
/*!40000 ALTER TABLE `picture` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-08-15  1:45:03
