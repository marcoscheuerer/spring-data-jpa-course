CREATE TABLE `ecommerce`.`products` (
    `id` BIGINT NOT NULL,
    `active` BIT(1) NOT NULL,
    `date_created` DATETIME DEFAULT NULL,
    `description` VARCHAR(255) DEFAULT NULL,
    `image_url` VARCHAR(255) DEFAULT NULL,
    `last_updated` DATETIME DEFAULT NULL,
    `name` VARCHAR(255) NOT NULL,
    `price` DECIMAL(19,2) DEFAULT NULL,
    `stock_keeping_unit` VARCHAR(255) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `sku_unique` (`stock_keeping_unit`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
