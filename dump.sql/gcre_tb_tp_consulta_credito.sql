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
-- Table structure for table `tb_tp_consulta_credito`
--

DROP TABLE IF EXISTS `tb_tp_consulta_credito`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_tp_consulta_credito` (
  `CD_TIPO_CONSULTA_CREDITO` int NOT NULL,
  `NM_TIPO_CONSULTA_CREDITO` varchar(50) NOT NULL,
  PRIMARY KEY (`CD_TIPO_CONSULTA_CREDITO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_tp_consulta_credito`
--

LOCK TABLES `tb_tp_consulta_credito` WRITE;
/*!40000 ALTER TABLE `tb_tp_consulta_credito` DISABLE KEYS */;
INSERT INTO `tb_tp_consulta_credito` VALUES (1,'Impedidos de operar'),(2,'Behavior'),(3,'Black white List'),(4,'FullService'),(5,'Atraso Interno'),(6,'PrÃ©-aprovado'),(7,'Score Serasa'),(8,'FullService Cheques'),(9,'SCPC Restritivo'),(10,'BV MULTISCORE APROVOMETRO'),(11,'Alerta Fraude'),(12,'PEP'),(13,'Restricao Juridica STJUR'),(14,'Neurotech BigData'),(15,'BV Plataforma de decisão - cálculo score'),(16,'Bolsa de Valores'),(17,'BV Plataforma de decisão - fluxo decisão'),(18,'Bureau Vivo'),(19,'BV Plataforma de decisão - Veículos Leves');
/*!40000 ALTER TABLE `tb_tp_consulta_credito` ENABLE KEYS */;
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
