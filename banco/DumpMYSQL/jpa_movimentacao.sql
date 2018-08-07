-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: jpa
-- ------------------------------------------------------
-- Server version	5.5.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `movimentacao`
--

DROP TABLE IF EXISTS `movimentacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movimentacao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `data` datetime DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `valor` decimal(19,2) DEFAULT NULL,
  `conta_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK4vva08mumff8f1th92o4rneyn` (`conta_id`),
  CONSTRAINT `FK4vva08mumff8f1th92o4rneyn` FOREIGN KEY (`conta_id`) REFERENCES `conta` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movimentacao`
--

LOCK TABLES `movimentacao` WRITE;
/*!40000 ALTER TABLE `movimentacao` DISABLE KEYS */;
INSERT INTO `movimentacao` VALUES (2,'2018-08-06 13:33:49','Churrascaria','SAIDA',200.00,7),(4,'2018-08-06 13:44:46','Churrascaria','SAIDA',200.00,8),(5,'2018-08-06 14:05:14','Churrascaria','SAIDA',200.00,1),(6,'2018-08-07 09:46:51','Churrascaria','SAIDA',200.00,1),(7,'2018-08-07 09:50:38','Viagem à SP','SAIDA',100.00,2),(8,'2018-08-07 09:50:38','Viagem à RJ','SAIDA',100.00,2);
/*!40000 ALTER TABLE `movimentacao` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-07 13:24:50
