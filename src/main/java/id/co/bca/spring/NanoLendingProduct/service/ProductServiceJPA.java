package id.co.bca.spring.NanoLendingProduct.service;

import id.co.bca.spring.NanoLendingProduct.model.LendingProduct;
import id.co.bca.spring.NanoLendingProduct.repository.ILendingProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceJPA implements ILendingProductService {

    @Autowired
    ILendingProductRepo repository;

    @Override
    public LendingProduct insert(LendingProduct product) {
        return repository.save(product);
    }

    @Override
    public LendingProduct update(LendingProduct product) {
        return repository.save(product);
    }

    @Override
    public void delete(LendingProduct product) {
        repository.delete(product);
    }

    @Override
    public LendingProduct findProduct(LendingProduct product) {
        return repository.findLendingProductById(product.getId());
    }

    @Override
    public List<LendingProduct> allProducts() {
        return repository.findAllByOrderByProductName();
    }
}
