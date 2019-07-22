-- CREATE DATABASES
CREATE DATABASE db_default CHARACTER SET UTF8 COLLATE utf8_bin;
CREATE DATABASE db_orgtest1 CHARACTER SET UTF8 COLLATE utf8_bin;
CREATE DATABASE db_orgtest2 CHARACTER SET UTF8 COLLATE utf8_bin;

-- CREATE TABLES in every DATABASE
CREATE TABLE `organizations` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) DEFAULT NULL,
  `address` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `persons` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) DEFAULT NULL,
  `birth_date` date DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `first_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `home_phone` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `mobile` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `social_security_number` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `organization_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKo2vbi1eb1prs40y2x6f0btf6m` (`organization_id`),
  CONSTRAINT `FKo2vbi1eb1prs40y2x6f0btf6m` FOREIGN KEY (`organization_id`) REFERENCES `organizations` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;


-- CREATE TABLES in db_default only
CREATE TABLE `user_tenants` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) DEFAULT NULL,
  `tenant` int(11) DEFAULT NULL,
  `user_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;


-- DATA insertion
-- Database: db_orgtest1
INSERT INTO `organizations` VALUES (NULL, 1, 'DHK, BD', 'Org_DB1@test.com', 'Organization_BD_1');
INSERT INTO `organizations` VALUES (NULL, 1, 'SYD, AUS', 'Org_AUS1@test.com', 'Organization_AUS_1');
INSERT INTO `organizations` VALUES (NULL, 1, 'STK, SE', 'Org_SE1@test.com', 'Organization_SE_1');
INSERT INTO `organizations` VALUES (NULL, 1, 'NY, USA', 'Org_USA1@test.com', 'Organization_USA_1');

INSERT INTO `persons` VALUES (NULL, 1, '1992-01-20', 'john1@test.com', 'John1','086568500','Arthur1','01245800085','AB45865900',1);
INSERT INTO `persons` VALUES (NULL, 1, '1993-06-12', 'arif1@test.com', 'Arif1','085568500','Rana1','01245845000','AB45865000',2);
INSERT INTO `persons` VALUES (NULL, 1, '1994-09-24', 'martin1@test.com', 'Martin1','086560046','Jr1','01245895700','AB65865959',3);
INSERT INTO `persons` VALUES (NULL, 1, '1995-10-27', 'mikhael1@test.com', 'Mikhael1','086563998','Jr1','01245812700','AB45869004',4);

-- Database: db_orgtest2
INSERT INTO `organizations` VALUES (NULL, 1, 'DHK, BD', 'Org_DB2@test.com', 'Organization_BD_2');
INSERT INTO `organizations` VALUES (NULL, 1, 'SYD, AUS', 'Org_AUS2@test.com', 'Organization_AUS_2');
INSERT INTO `organizations` VALUES (NULL, 1, 'STK, SE', 'Org_SE2@test.com', 'Organization_SE_2');
INSERT INTO `organizations` VALUES (NULL, 1, 'NY, USA', 'Org_USA2@test.com', 'Organization_USA_2');

INSERT INTO `persons` VALUES (NULL, 1, '1997-10-22', 'john2@test.com', 'John2','086568511','Arthur2','01245811185','AB45865111',1);
INSERT INTO `persons` VALUES (NULL, 1, '1995-01-17', 'arif2@test.com', 'Arif2','085568511','Rana2','01245845111','AB45865111',2);
INSERT INTO `persons` VALUES (NULL, 1, '1996-12-28', 'martin2@test.com', 'Martin2','086560116','Jr2','01245895711','AB65865111',3);
INSERT INTO `persons` VALUES (NULL, 1, '1996-11-29', 'mikhael2@test.com', 'Mikhael2','086563118','Jr2','01245812711','AB45869111',4);

-- Database: db_default
INSERT INTO `organizations` VALUES (NULL, 1, 'DHK, BD', 'Org_DB_default@test.com', 'Organization_BD_default');
INSERT INTO `organizations` VALUES (NULL, 1, 'SYD, AUS', 'Org_AUS_default@test.com', 'Organization_AUS_default');
INSERT INTO `organizations` VALUES (NULL, 1, 'STK, SE', 'Org_SE_default@test.com', 'Organization_SE_default');
INSERT INTO `organizations` VALUES (NULL, 1, 'NY, USA', 'Org_USA_default@test.com', 'Organization_USA_default');

INSERT INTO `persons` VALUES (NULL, 1, '1993-10-12', 'john@test.com', 'John','086568545','Arthur','01245865785','AB45865954', 1);
INSERT INTO `persons` VALUES (NULL, 1, '1999-02-28', 'arif@test.com', 'Arif','085568558','Rana','01245845785','AB45865594', 2);
INSERT INTO `persons` VALUES (NULL, 1, '1990-08-25', 'martin@test.com', 'Martin','086568546','Jr','01245895785','AB65875954', 3);
INSERT INTO `persons` VALUES (NULL, 1, '1991-04-20', 'mikhael@test.com', 'Mikhael','086568598','Jr','01245812785','AB45860004', 4);

INSERT INTO `db_default`.`user_tenants` VALUES
(NULL, 1, 1, 'john@test.com' ),
(NULL, 1, 1, 'arif@test.com' ),
(NULL, 1, 1, 'martin@test.com' ),
(NULL, 1, 1, 'mikhael@test.com' ),
(NULL, 1, 2, 'john1@test.com' ),
(NULL, 1, 2, 'arif1@test.com' ),
(NULL, 1, 2, 'martin1@test.com' ),
(NULL, 1, 2, 'mikhael1@test.com' ),
(NULL, 1, 3, 'john2@test.com' ),
(NULL, 1, 3, 'arif2@test.com' ),
(NULL, 1, 3, 'martin2@test.com' ),
(NULL, 1, 3, 'mikhael2@test.com' );