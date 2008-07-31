# HeidiSQL Dump 
#
# --------------------------------------------------------
# Host:                 127.0.0.1
# Database:             objectway
# Server version:       5.0.27-community-nt
# Server OS:            Win32
# Target-Compatibility: Standard ANSI SQL
# HeidiSQL version:     3.2 Revision: 1129
# --------------------------------------------------------

/*!40100 SET CHARACTER SET latin1;*/
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ANSI';*/
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;*/


#
# Database structure for database 'objectway'
#

CREATE DATABASE /*!32312 IF NOT EXISTS*/ "objectway" /*!40100 DEFAULT CHARACTER SET latin1 */;

USE "objectway";


#
# Table structure for table 'orari'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "orari" (
  "ID" int(10) unsigned NOT NULL auto_increment,
  "DATA" date NOT NULL,
  "ORA_INGRESSO" varchar(2) NOT NULL,
  "MINUTO_INGRESSO" varchar(2) NOT NULL,
  "ORA_USCITA" varchar(2) NOT NULL,
  "MINUTO_USCITA" varchar(2) NOT NULL,
  "TIPOLOGIA" tinyint(3) NOT NULL,
  "NOTE" text,
  PRIMARY KEY  ("ID"),
  UNIQUE KEY "ID" ("ID"),
  KEY "ID_2" ("ID")
) /*!40100 DEFAULT CHARSET=latin1*/;



#
# Dumping data for table 'orari'
#

# (No data found.)



#
# Table structure for table 'tipologie_lavoro'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tipologie_lavoro" (
  "ID" tinyint(3) unsigned NOT NULL auto_increment,
  "DESCRIZIONE" varchar(50) NOT NULL,
  PRIMARY KEY  ("ID"),
  UNIQUE KEY "ID" ("ID"),
  KEY "ID_2" ("ID")
) /*!40100 DEFAULT CHARSET=latin1*/;



#
# Dumping data for table 'tipologie_lavoro'
#

LOCK TABLES "tipologie_lavoro" WRITE;
/*!40000 ALTER TABLE "tipologie_lavoro" DISABLE KEYS;*/
REPLACE INTO "tipologie_lavoro" ("ID", "DESCRIZIONE") VALUES
	(1,'Ordinaria');
REPLACE INTO "tipologie_lavoro" ("ID", "DESCRIZIONE") VALUES
	(2,'Ferie');
/*!40000 ALTER TABLE "tipologie_lavoro" ENABLE KEYS;*/
UNLOCK TABLES;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE;*/
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;*/
