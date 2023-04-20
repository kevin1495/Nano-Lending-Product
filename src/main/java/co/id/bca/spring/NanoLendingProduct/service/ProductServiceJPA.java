package co.id.bca.spring.NanoLendingProduct.service;

import co.id.bca.spring.NanoLendingProduct.model.LendingProduct;
import co.id.bca.spring.NanoLendingProduct.repository.ILendingProductRepo;
import co.id.bca.spring.NanoLendingProduct.service.ILendingProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceJPA implements ILendingProductService {

    @Autowired
    ILendingProductRepo repository;

    @Override
    public LendingProduct insert(LendingProduct product) {
        return null;
    }

    @Override
    public LendingProduct update(LendingProduct product) {
        return null;
    }

    @Override
    public void delete(LendingProduct product) {

    }

    @Override
    public LendingProduct findProduct(LendingProduct product) {
        return null;
    }

    @Override
    public List<LendingProduct> allProducts() {
        return null;
    }
}
