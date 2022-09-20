package koo.MicroServiceCatalogService.entity;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "catalog")
public class Catalog implements Serializable { // https://devlog-wjdrbs96.tistory.com/268 에서 직렬화(Serializable) 개념 참고

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 120, unique = true)
    private String productId;

    @Column(nullable = false)
    private String productName;

    @Column(nullable = false)
    private Integer stock;

    @Column(nullable = false)
    private Integer unitPrice;

    @Column(nullable = false, updatable = false, insertable = false)
    @ColumnDefault(value = "CURRENT_TIMESTAMP") // CURRENT_TIMESTAMP는 h2 db에서 현재 시간을 가져오는 함수를 의미한다.
    private Date createdAt;

}
