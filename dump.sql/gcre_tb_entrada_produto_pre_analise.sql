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
-- Table structure for table `tb_entrada_produto_pre_analise`
--

DROP TABLE IF EXISTS `tb_entrada_produto_pre_analise`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_entrada_produto_pre_analise` (
  `CD_ENTRADA_PRODUTO_PRE_ANALISE` int NOT NULL,
  `NM_ENTRADA_PRODUTO_PRE_ANALISE` varchar(50) NOT NULL,
  `DS_ENTRADA_PRODUTO_PRE_ANALISE` varchar(100) NOT NULL,
  `DS_IDNTR_PROGRAMA_PRE_ANALISE` varchar(50) NOT NULL,
  `CD_ENTRADA_PRDTO_PRE_ANLSE_RFN` int DEFAULT NULL,
  `DS_LOGIN` varchar(150) NOT NULL,
  `FL_ATIVO` varchar(1) NOT NULL,
  `DT_INCLUSAO` date NOT NULL,
  `DT_ALTERACAO` date DEFAULT NULL,
  PRIMARY KEY (`CD_ENTRADA_PRODUTO_PRE_ANALISE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_entrada_produto_pre_analise`
--

LOCK TABLES `tb_entrada_produto_pre_analise` WRITE;
/*!40000 ALTER TABLE `tb_entrada_produto_pre_analise` DISABLE KEYS */;
INSERT INTO `tb_entrada_produto_pre_analise` VALUES (1,'AUTOMOVEL','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','1',20,'SISTEMAS','S','2019-06-04',NULL),(2,'MOTOS','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','2',NULL,'SISTEMAS','S','2019-06-04',NULL),(3,'Veículos Pesados Refin','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','3',21,'SISTEMAS','S','2019-06-04',NULL),(4,'Cp Online','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','4',NULL,'SISTEMAS','S','2019-06-04',NULL),(5,'Equipamento Fotovoltaico','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','4',NULL,'SISTEMAS','S','2019-06-04',NULL),(6,'CP','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','4',NULL,'SISTEMAS','S','2019-06-04',NULL),(7,'Cp Coban','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','4',NULL,'SISTEMAS','S','2019-06-04',NULL),(8,'Consignado','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','10',NULL,'SISTEMAS','S','2019-06-04',NULL),(9,'Neon Cartoes','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','9',NULL,'SISTEMAS','S','2019-06-04',NULL),(10,'Cartao_Funcionario','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','6',NULL,'SISTEMAS','S','2019-06-04',NULL),(11,'Cartao_Internet_PA','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','6',NULL,'SISTEMAS','S','2019-06-04',NULL),(12,'Cartao_Internet','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','6',NULL,'SISTEMAS','S','2019-06-04',NULL),(13,'Cartao_Pre_Aprovado','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','6',NULL,'SISTEMAS','S','2019-06-04',NULL),(14,'PROCEDIMENTOS MEDICOS','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','0',NULL,'SISTEMAS','S','2019-06-04',NULL),(15,'PACOTE DE VIAGENS','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','0',NULL,'SISTEMAS','S','2019-06-04',NULL),(16,'ARTIGOS PARA CASA','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','0',NULL,'SISTEMAS','S','2019-06-04',NULL),(17,'CARTAO CONSIGNADO','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','0',NULL,'SISTEMAS','S','2019-06-04',NULL),(18,'Cp Online Neon','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','4',NULL,'SISTEMAS','S','2019-06-04',NULL),(19,'Cp Online Rachae Neon','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','4',NULL,'SISTEMAS','S','2019-06-04',NULL),(20,'Veículos Leves Refin','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','7',NULL,'SISTEMAS','N','2019-06-04',NULL),(21,'Veículos Pesados Refin','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','8',NULL,'SISTEMAS','N','2019-06-04',NULL),(22,'REFINCONSIGNADO','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','0',NULL,'SISTEMAS','S','2019-08-09',NULL),(24,'ELETRONICOS','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','0',NULL,'SISTEMAS','S','2019-08-07',NULL),(25,'CP Condições','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','0',NULL,'SISTEMAS','S','2019-08-14',NULL),(26,'Cartão Parcerias','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','6',NULL,'SISTEMAS','S','2019-10-04',NULL),(27,'ECRED','ECRED','7',NULL,'SISTEMAS','S','2019-10-14',NULL),(28,'Cartão Adicional','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','6',NULL,'SISTEMAS','S','2019-11-14',NULL),(31,'Cartao Lookalike','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','5',NULL,'SISTEMAS','S','2020-01-16',NULL),(32,'CVG Guia Bolso Veiculos Leves','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','7',NULL,'SISTEMAS','S','2020-01-16',NULL),(33,'CVG Area Logada Veiculos Leves','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','7',NULL,'SISTEMAS','S','2020-01-16',NULL),(34,'Cartao Veiculos','Informação referente APRO_SIMU.TB_GRUPO_CATEGORIA_VEICULO. Elas tabelas devem ter o mesmo conteúdo','5',NULL,'SISTEMAS','S','2020-02-13',NULL);
/*!40000 ALTER TABLE `tb_entrada_produto_pre_analise` ENABLE KEYS */;
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
