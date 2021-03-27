package uz.pdp.task1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task1.entity.InputProduct;
import uz.pdp.task1.entity.User;
import uz.pdp.task1.projection.CustomInputProduct;
import uz.pdp.task1.projection.CustomUser;

@RepositoryRestResource(path = "inputProduct",collectionResourceRel = "inputProductList", excerptProjection = CustomInputProduct.class)
public interface InputProductRepository extends JpaRepository<InputProduct, Integer> {


}
