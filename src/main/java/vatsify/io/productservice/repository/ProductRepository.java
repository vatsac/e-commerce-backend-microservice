package vatsify.io.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import vatsify.io.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
