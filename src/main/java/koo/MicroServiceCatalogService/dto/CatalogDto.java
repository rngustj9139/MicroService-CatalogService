package koo.MicroServiceCatalogService.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CatalogDto implements Serializable {

    private String productId;
    private Integer qty; // 수량
    private Integer unitPrice;
    private Integer totalPrice;

    // 주문시 정보
    private String orderId;
    private String userId;

}
