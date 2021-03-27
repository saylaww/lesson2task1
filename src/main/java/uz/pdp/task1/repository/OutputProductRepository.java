package uz.pdp.task1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task1.entity.OutputProduct;
import uz.pdp.task1.entity.User;
import uz.pdp.task1.projection.CustomOutputProduct;
import uz.pdp.task1.projection.CustomUser;

@RepositoryRestResource(path = "outputProduct",collectionResourceRel = "outputProductList", excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {


}
