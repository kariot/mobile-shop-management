/*
SQLyog Community Edition- MySQL GUI v8.03 
MySQL - 5.0.51a-community-nt : Database - project
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`project` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `project`;

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `id` int(10) NOT NULL auto_increment,
  `name` varchar(50) NOT NULL,
  `cnumber` int(15) NOT NULL,
  `address` varchar(200) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

/*Data for the table `customer` */

insert  into `customer`(`id`,`name`,`cnumber`,`address`) values (9,'sreerag pr',456,'puthiyoth'),(11,'asdasdsadsa',1234567,'dasdsadsa');

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `id` int(10) NOT NULL auto_increment,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `type` varchar(20) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=61 DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert  into `login`(`id`,`username`,`password`,`type`) values (59,'1','2','Owner'),(1,'3','4','Sales'),(13,'5','6','Service');

/*Table structure for table `sales` */

DROP TABLE IF EXISTS `sales`;

CREATE TABLE `sales` (
  `id` int(10) NOT NULL auto_increment,
  `customer` varchar(30) NOT NULL,
  `brand` varchar(30) default NULL,
  `model` varchar(30) default NULL,
  `product` varchar(30) NOT NULL,
  `quantity` int(10) NOT NULL,
  `amount` int(10) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

/*Data for the table `sales` */

insert  into `sales`(`id`,`customer`,`brand`,`model`,`product`,`quantity`,`amount`) values (4,'Sreehari','Sony','Xperia XA','Headser',3,2111),(3,'Sreehari','Sony','Xperia XA','Headser',1,200),(5,'Sree','dsd','g','g',0,1998),(6,'Sreehari','nokia','1100','nk',2,100),(7,'Shamla Beevi A','nokia','1100','nk',1,100),(8,'Shamla Beevi A','nokia','1100','nk',0,16000),(9,'sreerag pr','nokia','1100','nk',1,4000);

/*Table structure for table `salesbooking` */

DROP TABLE IF EXISTS `salesbooking`;

CREATE TABLE `salesbooking` (
  `id` int(10) NOT NULL auto_increment,
  `customer` varchar(30) default NULL,
  `brand` varchar(30) default NULL,
  `model` varchar(30) default NULL,
  `product` varchar(30) default NULL,
  `remarks` varchar(200) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

/*Data for the table `salesbooking` */

insert  into `salesbooking`(`id`,`customer`,`brand`,`model`,`product`,`remarks`) values (4,'Sreehari','ss','ss','ss','sss'),(5,'Sree','1','1','1','1'),(6,NULL,'apple','i5','plus','hblh'),(7,'Sreehari','df','vdvd','vd','dv'),(8,'Shamla Beevi A','sony','xperia','xa','gold'),(9,'Sreehari','','','',''),(10,'sreerag pr','','','',''),(11,'sreerag pr','s','s','ss','s');

/*Table structure for table `salesmessage` */

DROP TABLE IF EXISTS `salesmessage`;

CREATE TABLE `salesmessage` (
  `id` int(10) NOT NULL auto_increment,
  `Message` varchar(200) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `salesmessage` */

insert  into `salesmessage`(`id`,`Message`) values (1,'z'),(2,'zxcvbnm,.'),(3,'');

/*Table structure for table `salesstock` */

DROP TABLE IF EXISTS `salesstock`;

CREATE TABLE `salesstock` (
  `id` int(10) NOT NULL auto_increment,
  `brand` varchar(30) NOT NULL,
  `model` varchar(30) NOT NULL,
  `productname` varchar(30) default NULL,
  `quantity` int(15) NOT NULL,
  `price` int(15) NOT NULL,
  `remarks` varchar(200) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=22 DEFAULT CHARSET=latin1;

/*Data for the table `salesstock` */

insert  into `salesstock`(`id`,`brand`,`model`,`productname`,`quantity`,`price`,`remarks`) values (11,'nokia','1100','nk',20,5100,'XXX'),(10,'Sony','Xperia','XA',1,15500,'Gold'),(9,'Coolpad','mega 2.5D','Screen Guard',10,100,''),(12,'Sony','Xperia ','Xa',5,16000,'One Year Warrenty\nGold Color'),(13,'Sony','Xperia ','Xa',5,16000,'One Year Warrenty\nGold Color'),(18,'apple','iphone','i5',10,45000,'One Year Warrenty\nGold Color'),(19,'apple','iphone','i5',5,45000,'black	'),(20,'Edp','ip','ca',10,19,'kknxcmnx		'),(21,'lenova','note','k2',6,15000,'black');

/*Table structure for table `service` */

DROP TABLE IF EXISTS `service`;

CREATE TABLE `service` (
  `id` int(10) NOT NULL auto_increment,
  `date` date NOT NULL,
  `customer` varchar(30) NOT NULL,
  `product` varchar(50) NOT NULL,
  `brand` varchar(50) default NULL,
  `model` varchar(50) default NULL,
  `complaint` varchar(50) NOT NULL,
  `estimatecost` int(10) default NULL,
  `eddate` date default NULL,
  `status` varchar(30) NOT NULL,
  `remarks` varchar(200) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

/*Data for the table `service` */

insert  into `service`(`id`,`date`,`customer`,`product`,`brand`,`model`,`complaint`,`estimatecost`,`eddate`,`status`,`remarks`) values (7,'2017-10-02','asdfghjkl;','sdfghjkl;\'','fghjkl;','sdfghjkl;','sdfghjkl;',2365478,'2017-10-02','Returned','');

/*Table structure for table `servicebooking` */

DROP TABLE IF EXISTS `servicebooking`;

CREATE TABLE `servicebooking` (
  `id` int(10) NOT NULL auto_increment,
  `customer` varchar(50) NOT NULL,
  `brand` varchar(30) NOT NULL,
  `model` varchar(30) NOT NULL,
  `product` varchar(30) NOT NULL,
  `remarks` varchar(200) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*Data for the table `servicebooking` */

insert  into `servicebooking`(`id`,`customer`,`brand`,`model`,`product`,`remarks`) values (1,'Sreehari','sdds','ddssd','dssdd','dsdsds'),(2,'Sree','q','q','q','q'),(3,'Sreehari','Sony','Nte Sony','Xperoa XA','mlkxnmvjdfnjn kakakkakakakak'),(4,'Shamla Beevi A','','','',''),(5,'Shamla Beevi A','','','',''),(6,'asdasdsadsa','asdfgh','sdfghjkl','120','ssss'),(7,'sreerag pr','sony','xperia','xa','headset');

/*Table structure for table `servicemessage` */

DROP TABLE IF EXISTS `servicemessage`;

CREATE TABLE `servicemessage` (
  `id` int(10) NOT NULL auto_increment,
  `message` varchar(500) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `servicemessage` */

insert  into `servicemessage`(`id`,`message`) values (1,'demo'),(2,'df'),(3,'booking'),(4,'asdfghjkl');

/*Table structure for table `servicestock` */

DROP TABLE IF EXISTS `servicestock`;

CREATE TABLE `servicestock` (
  `id` int(10) NOT NULL auto_increment,
  `brand` varchar(30) NOT NULL,
  `model` varchar(30) NOT NULL,
  `productname` varchar(30) default NULL,
  `quantity` int(15) NOT NULL,
  `price` int(15) NOT NULL,
  `remarks` varchar(200) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

/*Data for the table `servicestock` */

insert  into `servicestock`(`id`,`brand`,`model`,`productname`,`quantity`,`price`,`remarks`) values (8,'nokia','1100','nk',20,5100,'x'),(7,'MI','2s Prime','Glass',1,100,'grpaicji'),(5,'Coolpad','Mega 2.5D','Screen Guard',10,100,''),(6,'sx','sccs','cs',1,11,'sdcsd'),(9,'Edp','ip','ca',10,19,'kknxcmnx		');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
