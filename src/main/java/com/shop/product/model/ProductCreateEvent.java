package com.shop.product.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Getter
public class ProductCreateEvent {

    /** 상품 명 */
    private String name;
    /** 상품 가격 */
    private int price;
    /** 상품 수량 */
    private int stock;
    /** 상품 이미지 경로 */
    private String imagePath;
    /** 상품 설명 */
    private String description;
}
