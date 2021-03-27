package uz.pdp.task1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task1.entity.Client;
import uz.pdp.task1.entity.User;
import uz.pdp.task1.projection.CustomClient;
import uz.pdp.task1.projection.CustomUser;

@RepositoryRestResource(path = "client",collectionResourceRel = "clientList", excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client, Integer> {


}
