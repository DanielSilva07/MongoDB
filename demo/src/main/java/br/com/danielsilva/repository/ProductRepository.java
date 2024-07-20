package br.com.danielsilva.repository;

import br.com.danielsilva.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product , String> {
}
