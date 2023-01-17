package com.shop.product.model;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.text.DecimalFormat;
import java.time.LocalDateTime;

@Entity
@Table(name = "product")
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = { "id" })
@NoArgsConstructor
public class Product {

    /** 상품 아이디 */
    @Id
    private Long id;

    /** 상품 명 */
    private String name;

    /** 상품 가격 */
    private int price;

    /** 상품 수량 */
    private int stock;

    /**  상품 이미지 경로 */
    private String imagePath;

    /** 상품 설명 */
    private String description;

    /** 상품 등록일시 */
    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable =false)
    private LocalDateTime createdAt;

    /** 상품정보 수정일시 */
    @LastModifiedDate
    private LocalDateTime updatedAt;

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Product(String name, int price, String imagePath) {
        this.name = name;
        this.price = price;
        this.imagePath = imagePath;
    }

    public String getFormatPrice() {
        DecimalFormat df = new DecimalFormat("#,##0");
        return df.format(this.price);
    }

}
