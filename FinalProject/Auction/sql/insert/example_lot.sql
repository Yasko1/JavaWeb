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
-- Table structure for table `lot`
--

DROP TABLE IF EXISTS `lot`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `lot` (
  `id_lot` bigint(20) NOT NULL AUTO_INCREMENT,
  `price` decimal(10,2) DEFAULT NULL COMMENT 'Price of lot.',
  `owner_id` bigint(20) NOT NULL,
  `date_of_start` timestamp NULL DEFAULT NULL,
  `date_of_end` timestamp NULL DEFAULT NULL,
  `status` enum('processing','confirmed','refused','not-purchased','payment-waiting','paid') COLLATE utf8_bin DEFAULT 'processing',
  PRIMARY KEY (`id_lot`),
  KEY `fk_lot_user1_idx` (`owner_id`),
  CONSTRAINT `fk_lot_user1` FOREIGN KEY (`owner_id`) REFERENCES `user` (`id_user`)
) ENGINE=InnoDB AUTO_INCREMENT=1017 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='lot characteristics';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lot`
--

LOCK TABLES `lot` WRITE;
/*!40000 ALTER TABLE `lot` DISABLE KEYS */;
INSERT INTO `lot` VALUES (1001,2100.00,105,'2019-07-11 20:59:59','2020-01-11 20:59:59','confirmed');
INSERT INTO `lot` VALUES (1002,3700.00,1,'2019-07-11 20:59:59','2020-02-11 20:59:59','confirmed');
INSERT INTO `lot` VALUES (1003,7100.00,1,'2019-07-11 20:59:59','2020-03-11 20:59:59','confirmed');
INSERT INTO `lot` VALUES (1004,500.00,103,'2019-07-11 20:59:59','2020-04-11 20:59:59','confirmed');
INSERT INTO `lot` VALUES (1005,8820.99,105,'2019-07-11 20:59:59','2020-05-11 20:59:59','confirmed');
INSERT INTO `lot` VALUES (1006,700.00,105,'2019-07-11 20:59:59','2020-06-11 20:59:59','confirmed');
INSERT INTO `lot` VALUES (1007,1000.00,105,'2019-07-11 20:59:59','2020-07-11 20:59:59','processing');
INSERT INTO `lot` VALUES (1008,1000.10,107,'2019-07-11 20:59:59','2020-08-11 20:59:59','confirmed');
INSERT INTO `lot` VALUES (1009,1000.20,107,'2019-07-11 20:59:59','2020-09-11 20:59:59','processing');
INSERT INTO `lot` VALUES (1010,1000.30,107,'2019-07-11 20:59:59','2020-10-11 20:59:59','refused');
INSERT INTO `lot` VALUES (1011,1545.45,1,'2019-08-12 09:00:00','2020-11-11 17:20:20','confirmed');
INSERT INTO `lot` VALUES (1012,154.00,1,'2019-08-12 09:00:00','2019-08-17 17:21:21','confirmed');
INSERT INTO `lot` VALUES (1013,464.00,1,'2019-08-12 09:00:00','2019-09-14 21:00:00','confirmed');
INSERT INTO `lot` VALUES (1014,4101.00,1,'2019-08-12 09:00:00','2019-09-15 21:00:00','confirmed');
INSERT INTO `lot` VALUES (1015,545.45,1,'2019-08-12 09:00:00','2020-11-11 17:20:20','confirmed');
INSERT INTO `lot` VALUES (1016,145.05,1,'2019-08-12 09:00:00','2020-11-11 17:20:20','confirmed');
/*!40000 ALTER TABLE `lot` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-08-15  1:45:05
