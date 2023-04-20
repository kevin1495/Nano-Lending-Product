package co.id.bca.spring.NanoLendingProduct.service;

import co.id.bca.spring.NanoLendingProduct.model.LendingProduct;

import java.util.List;

public interface ILendingProductService {

    LendingProduct insert(LendingProduct product);
    LendingProduct update(LendingProduct product);
    void delete(LendingProduct product);
    LendingProduct findProduct(LendingProduct product);
    List<LendingProduct> allProducts();
}
