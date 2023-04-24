/*
 Navicat Premium Data Transfer

 Source Server         : 47.106.103.111
 Source Server Type    : MySQL
 Source Server Version : 100513
 Source Host           : localhost:3306
 Source Schema         : Netflix

 Target Server Type    : MySQL
 Target Server Version : 100513
 File Encoding         : 65001

 Date: 23/04/2023 22:25:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for Movie
-- ----------------------------
DROP TABLE IF EXISTS `Movie`;
CREATE TABLE `Movie`  (
  `Movie_Name` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `Movie_Genre` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Movie_Length` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Movie_Director` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Movie_Year` int(11) NULL DEFAULT NULL,
  `Movie_Language` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Movie_CC` varchar(5) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`Movie_Name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of Movie
-- ----------------------------
INSERT INTO `Movie` VALUES ('Blade Runner 2049', 'Science Fiction', '2:43:49', 'Denis Villeneuve', 2017, 'English', 'Yes');
INSERT INTO `Movie` VALUES ('Dairy of a Wimpy Kid: Dog Days', 'Comedy', '1:33:53', 'David Bowers', 2012, 'English', 'Yes');
INSERT INTO `Movie` VALUES ('Despicable Me', 'Cartoon', '1:34:42', 'Chris Renaud', 2010, 'English', 'Yes');
INSERT INTO `Movie` VALUES ('Despicable Me 2', 'Cartoon', '1:38:01', 'Chris Renaud', 2013, 'English', 'Yes');
INSERT INTO `Movie` VALUES ('Ice Age: Continental Drift', 'Cartoon', '1:27:45', 'Steve Martino', 2012, 'English', 'Yes');
INSERT INTO `Movie` VALUES ('John Wick: Chapter 4', 'Action', '2:49:00', 'Chad Stahelski', 2023, 'English', 'Yes');
INSERT INTO `Movie` VALUES ('Johnny English Strikes Again', 'Adventure', '1:28:33', 'David Kerr', 2018, 'English', 'Yes');
INSERT INTO `Movie` VALUES ('Jumanji: Welcome to the Jungle', 'Action', '1:54:27', 'Jake Kasdan', 2017, 'English', 'Yes');
INSERT INTO `Movie` VALUES ('Rio', 'Cartoon', '1:35:55', 'Carlos Saldanha', 2011, 'English', 'Yes');
INSERT INTO `Movie` VALUES ('Top Gun: Maverick', 'Action', '2:10:00', 'Joseph Kosinski', 2022, 'English', 'Yes');

-- ----------------------------
-- Table structure for TV
-- ----------------------------
DROP TABLE IF EXISTS `TV`;
CREATE TABLE `TV`  (
  `TV_Name` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `TV_Genre` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `TV_Length` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `TV_Director` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `TV_Year` int(11) NULL DEFAULT NULL,
  `TV_Language` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `TV_CC` varchar(5) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`TV_Name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of TV
-- ----------------------------
INSERT INTO `TV` VALUES ('9-1-1 S1E1', 'Drama', '45:15', 'Ryan Murphy', 2018, 'English', 'Yes');
INSERT INTO `TV` VALUES ('9-1-1 S1E2', 'Drama', '44:02', 'Ryan Murphy', 2018, 'English', 'Yes');
INSERT INTO `TV` VALUES ('American Dad S1E1', 'Animation', '22:01', 'Seth MacFarlane', 2005, 'English', 'Yes');
INSERT INTO `TV` VALUES ('American Dad S1E2', 'Animation', '22:05', 'Seth MacFarlane', 2005, 'English', 'Yes');
INSERT INTO `TV` VALUES ('Modern Family S1E1', 'Comedy', '22:59', 'Christopher Lloyd', 2009, 'English', 'Yes');
INSERT INTO `TV` VALUES ('Modern Family S1E2', 'Comedy', '21:34', 'Christopher Lloyd', 2009, 'English', 'Yes');
INSERT INTO `TV` VALUES ('The Good Doctor S1E1', 'Medical', '43:22', 'David Shore', 2017, 'English', 'Yes');
INSERT INTO `TV` VALUES ('The Good Doctor S1E2', 'Medical', '42:49', 'David Shore', 2017, 'English', 'Yes');
INSERT INTO `TV` VALUES ('The Simpsons S34E1', 'Animation', '21:46', 'Bob Anderson', 2023, 'English', 'Yes');
INSERT INTO `TV` VALUES ('The Simpsons S34E2', 'Animation', '21:46', 'Bob Anderson', 2023, 'English', 'Yes');

-- ----------------------------
-- Table structure for User
-- ----------------------------
DROP TABLE IF EXISTS `User`;
CREATE TABLE `User`  (
  `User_ID` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `User_Email` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `User_Password` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `User_Name` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `Billing_Date` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `User_Plan` varchar(10) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`User_ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of User
-- ----------------------------
INSERT INTO `User` VALUES ('0001', 'jzt5526@psu.edu', 'JZT55260016', 'Jiulong Tang', '2024-03-31', 'Basic');
INSERT INTO `User` VALUES ('0002', 'jkh5864@psu.edu', 'JKH58640001', 'Jack Hsu', '2024-03-31', 'Basic');
INSERT INTO `User` VALUES ('0003', 'test999@psu.edu', 'TEST9999999', 'Test Account', '2024-03-31', 'Basic');

SET FOREIGN_KEY_CHECKS = 1;
