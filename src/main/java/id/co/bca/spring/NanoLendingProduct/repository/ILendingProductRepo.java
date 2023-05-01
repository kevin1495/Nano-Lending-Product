package id.co.bca.spring.NanoLendingProduct.repository;

import id.co.bca.spring.NanoLendingProduct.model.LendingProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ILendingProductRepo extends JpaRepository<LendingProduct,Integer> {

    LendingProduct findLendingProductById(Integer id);
    List<LendingProduct> findAllByOrderByProductName();
    Integer removeById(Integer id);
}
