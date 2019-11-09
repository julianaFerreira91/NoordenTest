package br.com.noordentest.repository;

import br.com.noordentest.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String>{
    Product findById(int id);
}
