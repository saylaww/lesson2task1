package uz.pdp.task1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task1.entity.Output;
import uz.pdp.task1.entity.User;
import uz.pdp.task1.projection.CustomOutput;
import uz.pdp.task1.projection.CustomUser;

@RepositoryRestResource(path = "output",collectionResourceRel = "outputList", excerptProjection = CustomOutput.class)
public interface OutputRepository extends JpaRepository<Output, Integer> {


}
