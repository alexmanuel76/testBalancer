USE `my_db`;
CREATE TABLE `balancer`(
    `id` int NOT NULL AUTO_INCREMENT,
    `servidor` varchar(30) DEFAULT NULL,
    `hora` date DEFAULT NULL,
    `comentario` varchar(100) DEFAULT NULL,
    PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;