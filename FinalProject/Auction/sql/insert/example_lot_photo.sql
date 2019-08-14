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
-- Table structure for table `lot_photo`
--

DROP TABLE IF EXISTS `lot_photo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `lot_photo` (
  `id_photo` bigint(20) NOT NULL AUTO_INCREMENT,
  `photo_url` varchar(45) COLLATE utf8_bin DEFAULT NULL COMMENT 'URL adress of photo of car',
  `lot_id_lot` bigint(20) NOT NULL,
  PRIMARY KEY (`id_photo`),
  KEY `fk_lot_photo_lot1` (`lot_id_lot`),
  CONSTRAINT `fk_lot_photo_lot1` FOREIGN KEY (`lot_id_lot`) REFERENCES `lot` (`id_lot`)
) ENGINE=InnoDB AUTO_INCREMENT=1017 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT=' photos of lot';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lot_photo`
--

LOCK TABLES `lot_photo` WRITE;
/*!40000 ALTER TABLE `lot_photo` DISABLE KEYS */;
INSERT INTO `lot_photo` VALUES (1001,'pict1001.jpeg',1001);
INSERT INTO `lot_photo` VALUES (1002,'pict1002.jpg',1002);
INSERT INTO `lot_photo` VALUES (1003,'pict1003.jpg',1003);
INSERT INTO `lot_photo` VALUES (1004,'pict1004.JPG',1004);
INSERT INTO `lot_photo` VALUES (1005,'pict1005.jpg',1005);
INSERT INTO `lot_photo` VALUES (1006,'pict1006.jpg',1006);
INSERT INTO `lot_photo` VALUES (1007,'pict1007.jpg',1007);
INSERT INTO `lot_photo` VALUES (1008,'pict1008.jpg',1008);
INSERT INTO `lot_photo` VALUES (1009,'pict1009.jpg',1009);
INSERT INTO `lot_photo` VALUES (1010,'pict1010.jpg',1010);
INSERT INTO `lot_photo` VALUES (1011,'pict1011.jpg',1011);
INSERT INTO `lot_photo` VALUES (1012,'pict1012.jpg',1012);
INSERT INTO `lot_photo` VALUES (1013,'pict1013.jpg',1013);
INSERT INTO `lot_photo` VALUES (1014,'pict1014.jpg',1014);
INSERT INTO `lot_photo` VALUES (1015,'pict1015.jpg',1015);
INSERT INTO `lot_photo` VALUES (1016,'pict1016.jpg',1016);
/*!40000 ALTER TABLE `lot_photo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-08-15  1:45:04
