-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema example
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema example
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `example` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;
USE `example` ;

-- -----------------------------------------------------
-- Table `example`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `example`.`user` (
  `id_user` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NULL DEFAULT NULL COMMENT 'First name of user.',
  `last_name` VARCHAR(45) NULL DEFAULT NULL COMMENT 'Last name of user.',
  `username` VARCHAR(45) NULL DEFAULT NULL COMMENT 'Username.',
  `email` VARCHAR(50) NULL DEFAULT NULL COMMENT 'Email of user.',
  `password` VARCHAR(100) NULL DEFAULT NULL COMMENT 'Password of user.',
  `role` ENUM('user', 'admin') NOT NULL,
  `is_banned` TINYINT(1) NULL DEFAULT '0',
  `balance` DECIMAL(10,2) NULL DEFAULT '0.00',
  PRIMARY KEY (`id_user`))
ENGINE = InnoDB
AUTO_INCREMENT = 108
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin
COMMENT = 'user characteristics';


-- -----------------------------------------------------
-- Table `example`.`lot`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `example`.`lot` (
  `id_lot` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `price` DECIMAL(10,2) NULL DEFAULT NULL COMMENT 'Price of lot.',
  `owner_id` BIGINT(20) NOT NULL,
  `date_of_start` TIMESTAMP NULL DEFAULT NULL,
  `date_of_end` TIMESTAMP NULL DEFAULT NULL,
  `status` ENUM('processing', 'confirmed', 'refused', 'not-purchased', 'payment-waiting', 'paid') NULL DEFAULT 'processing',
  PRIMARY KEY (`id_lot`),
  INDEX `fk_lot_user1_idx` (`owner_id` ASC) VISIBLE,
  CONSTRAINT `fk_lot_user1`
    FOREIGN KEY (`owner_id`)
    REFERENCES `example`.`user` (`id_user`))
ENGINE = InnoDB
AUTO_INCREMENT = 1017
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin
COMMENT = 'lot characteristics';


-- -----------------------------------------------------
-- Table `example`.`bidder`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `example`.`bidder` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `lot_id_lot` BIGINT(20) NOT NULL,
  `user_id_user` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_lot_has_user_user1_idx` (`user_id_user` ASC) VISIBLE,
  INDEX `fk_lot_has_user_lot1_idx` (`lot_id_lot` ASC) VISIBLE,
  CONSTRAINT `fk_lot_has_user_lot1`
    FOREIGN KEY (`lot_id_lot`)
    REFERENCES `example`.`lot` (`id_lot`),
  CONSTRAINT `fk_lot_has_user_user1`
    FOREIGN KEY (`user_id_user`)
    REFERENCES `example`.`user` (`id_user`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;


-- -----------------------------------------------------
-- Table `example`.`lot_photo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `example`.`lot_photo` (
  `id_photo` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `photo_url` VARCHAR(45) NULL DEFAULT NULL COMMENT 'URL adress of photo of car',
  `lot_id_lot` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id_photo`),
  INDEX `fk_lot_photo_lot1` (`lot_id_lot` ASC) VISIBLE,
  CONSTRAINT `fk_lot_photo_lot1`
    FOREIGN KEY (`lot_id_lot`)
    REFERENCES `example`.`lot` (`id_lot`))
ENGINE = InnoDB
AUTO_INCREMENT = 1017
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin
COMMENT = ' photos of lot';


-- -----------------------------------------------------
-- Table `example`.`picture`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `example`.`picture` (
  `id_lot` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `year_of_painting` DATE NULL DEFAULT NULL,
  `painter` BIGINT(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id_lot`),
  INDEX `id_picture_UNIQUE` (`id_lot` ASC) VISIBLE,
  INDEX `painter_UNIQUE` (`painter` ASC) VISIBLE,
  CONSTRAINT `fk_lot_picture`
    FOREIGN KEY (`id_lot`)
    REFERENCES `example`.`lot` (`id_lot`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 1017
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;


-- -----------------------------------------------------
-- Table `example`.`painter`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `example`.`painter` (
  `id_painter` BIGINT(20) NOT NULL,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `surname` VARCHAR(45) NULL DEFAULT NULL,
  `nationality` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id_painter`),
  UNIQUE INDEX `id_painter_UNIQUE` (`id_painter` ASC) VISIBLE,
  INDEX `id_painter` (`id_painter` ASC) VISIBLE,
  CONSTRAINT `id_painter`
    FOREIGN KEY (`id_painter`)
    REFERENCES `example`.`picture` (`painter`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
