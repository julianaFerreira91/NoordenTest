package br.com.noordentest.repository;

import br.com.noordentest.models.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, String> {
    Client findById(int id);
}
