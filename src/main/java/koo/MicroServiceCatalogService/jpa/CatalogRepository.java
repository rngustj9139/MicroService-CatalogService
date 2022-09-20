package koo.MicroServiceCatalogService.jpa;

import koo.MicroServiceCatalogService.entity.CatalogEntity;
import org.springframework.data.repository.CrudRepository;

public interface CatalogRepository extends CrudRepository<CatalogEntity, Long> {

    CatalogEntity findByProductId(String productId);

}
