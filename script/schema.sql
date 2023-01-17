CREATE DATABASE product
DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

CREATE TABLE `product` (
  `seq` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `productId` bigint(20) NOT NULL, /* 상품 아이디 */
  `name` varchar(100) NOT NULL DEFAULT '', /* 상품명 */
  `price` int(11) NOT NULL DEFAULT '0', /* 상품 가격 */
  `stock` int(11) NOT NULL DEFAULT '0', /* 상품 재고 */
  `imagePath` varchar(1000) NOT NULL DEFAULT '',/* 상품 이미지 파일 경로 */
  `description` text, /* 상품 설명 */
  `created_at` datetime NOT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;