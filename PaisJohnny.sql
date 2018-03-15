CREATE SCHEMA IF NOT EXISTS `Pais` DEFAULT CHARACTER SET utf8 ;
USE `Pais` ;

-- -----------------------------------------------------
-- Table `vendas`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Pais (
  `id` INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `populacao` BIGINT(15) NOT NULL,
  `area` NUMERIC(15,2) NOT NULL,
  PRIMARY KEY (`id`));