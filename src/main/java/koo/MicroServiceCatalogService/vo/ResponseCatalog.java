package koo.MicroServiceCatalogService.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL) // null 값이 들어간 프로퍼티는 응답데이터에서 제외한다.
public class ResponseCatalog {

    private String productId;
    private String productName;
    private Integer unitPrice;
    private Integer totalPrice;
    private Integer stock;
    private Date createdAt;

}
