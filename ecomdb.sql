-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: ecom
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `cdecli`
--

DROP TABLE IF EXISTS `cdecli`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cdecli` (
  `numCde` int NOT NULL,
  `numcli` int NOT NULL,
  PRIMARY KEY (`numCde`,`numcli`),
  KEY `numcli_FK_idx` (`numcli`),
  CONSTRAINT `numcde_FK` FOREIGN KEY (`numCde`) REFERENCES `commande` (`numCde`),
  CONSTRAINT `numcli_FK` FOREIGN KEY (`numcli`) REFERENCES `client` (`numCli`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cdecli`
--

LOCK TABLES `cdecli` WRITE;
/*!40000 ALTER TABLE `cdecli` DISABLE KEYS */;
INSERT INTO `cdecli` VALUES (17,2),(18,2),(19,2),(20,2),(21,2),(22,2);
/*!40000 ALTER TABLE `cdecli` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `client` (
  `numCli` int NOT NULL AUTO_INCREMENT,
  `adrCli` varchar(100) DEFAULT NULL,
  `nomCli` varchar(40) DEFAULT NULL,
  `prenomCli` varchar(40) DEFAULT NULL,
  `pass` varchar(12) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `numtel` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`numCli`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client`
--

LOCK TABLES `client` WRITE;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` VALUES (1,'rabat','zarki','adam','adam2002','adam@gmail.com','060000000'),(2,'nador','elyoussfi','mohamed','2000','mohamed@gmail.com','0601000000'),(3,'rabat','elimami','aymane','1234','aymane@gmail.com','0601010000'),(4,'meknes','belhaj','amine','12345','amine@gmail.com','0601020000'),(7,'temara','ggg','eeeee','1234','eee@gmail.com','0601030000');
/*!40000 ALTER TABLE `client` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `commande`
--

DROP TABLE IF EXISTS `commande`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `commande` (
  `numCde` int NOT NULL AUTO_INCREMENT,
  `dateCde` date DEFAULT NULL,
  `nv` varchar(45) NOT NULL,
  PRIMARY KEY (`numCde`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `commande`
--

LOCK TABLES `commande` WRITE;
/*!40000 ALTER TABLE `commande` DISABLE KEYS */;
INSERT INTO `commande` VALUES (13,'2022-12-28','non valide'),(14,'2022-12-28','non valide'),(15,'2022-12-28','non valide'),(16,'2022-12-28','non valide'),(17,'2022-12-28','valide'),(18,'2022-12-29','valide'),(19,'2022-12-29','valide'),(20,'2022-12-29','valide'),(21,'2023-01-18','valide'),(22,'2023-01-19','non valide');
/*!40000 ALTER TABLE `commande` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `famille`
--

DROP TABLE IF EXISTS `famille`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `famille` (
  `nomFam` varchar(40) NOT NULL,
  `numFam` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`nomFam`),
  KEY `numFam` (`numFam`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `famille`
--

LOCK TABLES `famille` WRITE;
/*!40000 ALTER TABLE `famille` DISABLE KEYS */;
INSERT INTO `famille` VALUES ('laptop',1),('telephone',2),('pc poste',3);
/*!40000 ALTER TABLE `famille` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `procde`
--

DROP TABLE IF EXISTS `procde`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `procde` (
  `numpro` int NOT NULL,
  `numCde` int NOT NULL,
  `qte` int DEFAULT NULL,
  PRIMARY KEY (`numpro`,`numCde`),
  KEY `numcde_FK2_idx` (`numCde`),
  CONSTRAINT `numcde_FKK` FOREIGN KEY (`numCde`) REFERENCES `commande` (`numCde`),
  CONSTRAINT `numPro_FK` FOREIGN KEY (`numpro`) REFERENCES `produit` (`numPro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `procde`
--

LOCK TABLES `procde` WRITE;
/*!40000 ALTER TABLE `procde` DISABLE KEYS */;
INSERT INTO `procde` VALUES (2,19,2),(6,15,2),(6,16,3),(6,17,2),(6,18,4),(7,20,4),(7,21,2),(8,22,3);
/*!40000 ALTER TABLE `procde` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produit`
--

DROP TABLE IF EXISTS `produit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produit` (
  `numPro` int NOT NULL AUTO_INCREMENT,
  `puPro` decimal(10,0) DEFAULT NULL,
  `nomPro` varchar(50) DEFAULT NULL,
  `famPro` varchar(45) DEFAULT NULL,
  `photoP` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`numPro`),
  KEY `famPro_PK_idx` (`famPro`),
  CONSTRAINT `famPro_PK` FOREIGN KEY (`famPro`) REFERENCES `famille` (`nomFam`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produit`
--

LOCK TABLES `produit` WRITE;
/*!40000 ALTER TABLE `produit` DISABLE KEYS */;
INSERT INTO `produit` VALUES (2,10000,'asus','laptop','microsoft Surface.jpg'),(6,10000,'acer','laptop','microsoft Surface.jpg'),(7,14444,'microsoft','laptop','microsoft Surface.jpg'),(8,15000,'iphone 14','telephone','iphone14.jpg');
/*!40000 ALTER TABLE `produit` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-01-19  0:14:54
