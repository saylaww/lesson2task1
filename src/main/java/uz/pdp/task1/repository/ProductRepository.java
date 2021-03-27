package uz.pdp.task1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task1.entity.Product;
import uz.pdp.task1.entity.User;
import uz.pdp.task1.projection.CustomProduct;
import uz.pdp.task1.projection.CustomUser;

@RepositoryRestResource(path = "product",collectionResourceRel = "productList", excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {


}
