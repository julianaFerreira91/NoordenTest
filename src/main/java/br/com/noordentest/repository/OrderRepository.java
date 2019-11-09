package br.com.noordentest.repository;

import br.com.noordentest.models.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Orders, String> {
    
}
