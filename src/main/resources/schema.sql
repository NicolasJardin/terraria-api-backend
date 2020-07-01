

DROP TABLE IF EXISTS pet;

CREATE TABLE pet (
         id_pet BIGINT AUTO_INCREMENT NOT NULL,
         pet_name VARCHAR(255) NULL,
         item_name VARCHAR(255) NULL,
         tooltip VARCHAR(255) NULL,
         PRIMARY KEY (id_pet));


DROP TABLE IF EXISTS mount;

CREATE TABLE mount (
         id_mount BIGINT AUTO_INCREMENT NOT NULL,
         mount_name VARCHAR(255) NULL,
         item_name VARCHAR(255) NULL,
         description VARCHAR(255) NULL,
         mount_speed INT NULL,
         jump_height INT NULL,
         PRIMARY KEY (id_mount));