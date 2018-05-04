-- MySQL dump 10.16  Distrib 10.2.14-MariaDB, for osx10.12 (x86_64)
--
-- Host: 127.0.0.1    Database: library
-- ------------------------------------------------------
-- Server version	10.2.14-MariaDB

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
-- Table structure for table `Books`
--

DROP TABLE IF EXISTS `Books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Books` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` text NOT NULL,
  `author` text NOT NULL,
  `isbn` int(11) NOT NULL,
  `availible` tinyint(1) NOT NULL DEFAULT 1,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Books`
--

LOCK TABLES `Books` WRITE;
/*!40000 ALTER TABLE `Books` DISABLE KEYS */;
INSERT INTO `Books` VALUES (1,'Inverse interactive hierarchy','Lonny Nicolas',215893,1),(2,'Distributed reciprocal challenge','Myrtie Emmerich',98458141,1),(3,'Ergonomic 24hour database','Lukas Cole',33837703,1),(4,'Universal scalable array','Lacy Hoppe II',62588300,1),(5,'Synchronised clear-thinking hub','Andy Hilll',33977775,1),(6,'Profit-focused multi-state workforce','Creola Little',42861478,1),(7,'Team-oriented background policy','Marcelino Leffler',77047618,1),(8,'Decentralized explicit toolset','Deshaun Moen',61366282,1),(9,'Customizable mission-critical complexity','Westley Carter',9328891,1),(10,'Grass-roots bifurcated approach','Camron Dicki IV',68037505,1),(11,'Configurable object-oriented function','Dr. Seamus Emmerich',30406292,1),(12,'Upgradable real-time budgetarymanagement','Zita Keebler Sr.',55576604,1),(13,'Managed stable alliance','Ms. Albina Connelly',57584607,1),(14,'Expanded zerodefect throughput','Jeffrey Sipes Sr.',48951029,1),(15,'Up-sized uniform pricingstructure','Edwardo Miller DVM',62431651,1),(16,'Re-contextualized 3rdgeneration groupware','Prof. Mervin Zboncak DVM',37804756,1),(17,'Realigned actuating access','Jordi Anderson',35208945,1),(18,'Automated foreground definition','Prof. Kristopher Will',38568206,1),(19,'Multi-tiered empowering algorithm','Ms. Adela McKenzie',60220448,1),(20,'Grass-roots explicit migration','Enid Ebert',6239350,1),(29,'A Tale Of Two Cities ','Charles Dickens',567823,1),(30,'To Kill a Mockingbird ','Harper Lee',60935464,1);
/*!40000 ALTER TABLE `Books` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `UserBooks`
--

DROP TABLE IF EXISTS `UserBooks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `UserBooks` (
  `bookID` int(11) DEFAULT NULL,
  `userID` int(11) DEFAULT NULL,
  `dateCheckedOut` datetime NOT NULL,
  `dateReturned` datetime DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UserBooks_id_uindex` (`id`),
  KEY `UserBooks_Books_id_fk` (`bookID`),
  KEY `UserBooks_Users_id_fk` (`userID`),
  CONSTRAINT `UserBooks_Books_id_fk` FOREIGN KEY (`bookID`) REFERENCES `Books` (`id`),
  CONSTRAINT `UserBooks_Users_id_fk` FOREIGN KEY (`userID`) REFERENCES `Users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `UserBooks`
--

LOCK TABLES `UserBooks` WRITE;
/*!40000 ALTER TABLE `UserBooks` DISABLE KEYS */;
INSERT INTO `UserBooks` VALUES (6,2,'2018-05-03 23:51:17','2018-05-03 23:53:23',12),(1,20,'2018-05-03 23:52:03','2018-05-04 00:21:19',13),(15,23,'2018-05-03 23:52:55','2018-05-04 00:21:33',15),(19,35,'2018-05-04 00:10:04','2018-05-04 00:10:27',16),(29,23,'2018-05-04 15:04:49','2018-05-04 16:08:23',17);
/*!40000 ALTER TABLE `UserBooks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Users`
--

DROP TABLE IF EXISTS `Users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstName` text NOT NULL,
  `lastName` text NOT NULL,
  `timeCreated` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Users`
--

LOCK TABLES `Users` WRITE;
/*!40000 ALTER TABLE `Users` DISABLE KEYS */;
INSERT INTO `Users` VALUES (1,'Marcelino','Schulist','2017-11-26 06:11:07'),(2,'Jeremy','Bayer','1985-09-04 07:27:08'),(3,'Charity','Rippin','1984-04-09 02:58:56'),(4,'Marley','Bernier','1993-06-04 01:00:27'),(5,'Mckayla','Pacocha','2012-08-01 09:36:22'),(6,'Rasheed','Cole','1984-03-17 13:24:17'),(7,'Eden','Rempel','2014-10-27 10:28:55'),(8,'Danyka','Prosacco','1977-10-09 04:54:47'),(9,'Ralph','Weissnat','1996-11-15 15:42:35'),(10,'Marguerite','Kling','1984-11-16 01:08:00'),(11,'Orval','Crist','1991-06-14 15:09:09'),(12,'Tavares','Stehr','2005-06-26 00:49:47'),(13,'Savannah','Abbott','1986-06-30 09:28:01'),(14,'Adolf','King','1979-04-14 16:32:15'),(15,'Brandy','Brown','1994-01-21 04:47:59'),(16,'Janessa','Kunde','1974-03-24 23:52:10'),(17,'Antoinette','Gulgowski','2011-10-09 20:09:56'),(18,'Lindsay','Raynor','2015-02-26 12:23:49'),(19,'Jovany','Robel','1994-09-24 20:50:28'),(20,'Corine','Lockman','1989-08-06 16:12:23'),(23,'Maria','Molloy','2018-05-03 16:06:05'),(24,'Tori','Spychalski','2018-05-03 16:09:01'),(35,'William','Kluge','2018-05-04 00:09:32'),(36,'Kim','Kardashian','2018-05-04 14:59:34');
/*!40000 ALTER TABLE `Users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-05-04 17:08:58
