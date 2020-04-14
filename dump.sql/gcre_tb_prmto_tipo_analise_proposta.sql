CREATE DATABASE  IF NOT EXISTS `gcre` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `gcre`;
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: gcre
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_prmto_tipo_analise_proposta`
--

DROP TABLE IF EXISTS `tb_prmto_tipo_analise_proposta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_prmto_tipo_analise_proposta` (
  `CD_PRMTO_TIPO_ANALISE_PROPOSTA` int NOT NULL,
  `FL_EXECUCAO_PRE_ANALISE` varchar(1) NOT NULL,
  `FL_EXECUCAO_ANALISE_RESTRICAO` varchar(1) NOT NULL,
  `TP_ENTRADA_PRODUTO_PRE_ANALISE` int DEFAULT NULL,
  PRIMARY KEY (`CD_PRMTO_TIPO_ANALISE_PROPOSTA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_prmto_tipo_analise_proposta`
--

LOCK TABLES `tb_prmto_tipo_analise_proposta` WRITE;
/*!40000 ALTER TABLE `tb_prmto_tipo_analise_proposta` DISABLE KEYS */;
INSERT INTO `tb_prmto_tipo_analise_proposta` VALUES (202,'S','S',2),(203,'S','S',3),(204,'S','S',1),(205,'S','N',4),(206,'N','N',5),(207,'N','N',6),(208,'N','N',7),(209,'N','N',8),(210,'S','N',9),(211,'S','N',10),(212,'S','N',11),(213,'S','N',12),(214,'S','N',13),(215,'N','N',14),(216,'N','N',15),(217,'S','N',16),(218,'N','N',17),(219,'S','N',18),(220,'S','N',19),(221,'S','S',20),(222,'S','S',21),(262,'N','N',25),(282,'S','S',26),(341,'N','N',27),(361,'S','S',28),(366,'S','S',32),(367,'S','S',33),(368,'S','N',34),(369,'S','N',31);
/*!40000 ALTER TABLE `tb_prmto_tipo_analise_proposta` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-14 17:41:48
