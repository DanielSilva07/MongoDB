package br.com.danielsilva.controller;
import br.com.danielsilva.model.Product;
import br.com.danielsilva.repository.ProductRepository;
import br.com.danielsilva.resource.ProductRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository){
        this.productRepository= productRepository;

    }

    @GetMapping("/product")
    public ResponseEntity<List<Product>> getAllProducts(){
        return ResponseEntity.ok(this.productRepository.findAll());
    }

//    @GetMapping("/product/{id}")
//    public ResponseEntity getAllProductsById(@PathVariable String id){
//
//        return ResponseEntity.ok(this.productRepository.findAll());
//    }


    @PostMapping("/product")
    public ResponseEntity<Product> creatProdutc(@RequestBody ProductRequest productRequest){

        Product product = new Product();
        product.setName(productRequest.getName());
        product.setDescription(productRequest.getDescription());

        return ResponseEntity.status(405).body(this.productRepository.save(product));


    }
}
