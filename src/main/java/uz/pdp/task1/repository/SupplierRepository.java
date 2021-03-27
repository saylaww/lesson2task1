package uz.pdp.task1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task1.entity.Supplier;
import uz.pdp.task1.entity.User;
import uz.pdp.task1.projection.CustomSupplier;
import uz.pdp.task1.projection.CustomUser;

@RepositoryRestResource(path = "supplier",collectionResourceRel = "supplierList", excerptProjection = CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {


}
