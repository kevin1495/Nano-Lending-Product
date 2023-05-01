package id.co.bca.spring.NanoLendingProduct.controller;

import id.co.bca.spring.NanoLendingProduct.model.LendingProduct;
import id.co.bca.spring.NanoLendingProduct.service.ILendingProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("lending/product")
public class LendingProductController {

    @Autowired
    ILendingProductService iProductService;

    @GetMapping("")
    public List<LendingProduct> findAllProduct() {
        return iProductService.allProducts();
    }

    @GetMapping("{id}")
    public LendingProduct findProductById(@PathVariable("id") Integer productId) {
        LendingProduct request = new LendingProduct();
        request.setId(productId);
        return iProductService.findProduct(request);
    }

    @PostMapping("")
    public LendingProduct createProduct(@RequestBody LendingProduct product) {
        return iProductService.insert(product);
    }

    @PutMapping("{id}")
    public LendingProduct updateProductById(@PathVariable("id") Integer productId, @RequestBody LendingProduct product) {
        product.setId(productId);
        return  iProductService.update(product);
    }

    @DeleteMapping("{id}")
    public void deleteProductByID(@PathVariable("id") Integer productId) {
        LendingProduct request = new LendingProduct();
        request.setId(productId);
        iProductService.delete(request);
    }
}
