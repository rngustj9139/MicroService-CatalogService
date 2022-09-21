package koo.MicroServiceCatalogService.service;

import koo.MicroServiceCatalogService.entity.CatalogEntity;

public interface CatalogService {

    Iterable<CatalogEntity> getAllCatalogs();

}
