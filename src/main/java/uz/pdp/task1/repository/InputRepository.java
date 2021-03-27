package uz.pdp.task1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task1.entity.Input;
import uz.pdp.task1.entity.User;
import uz.pdp.task1.projection.CustomInput;
import uz.pdp.task1.projection.CustomUser;

@RepositoryRestResource(path = "input",collectionResourceRel = "inputList", excerptProjection = CustomInput.class)
public interface InputRepository extends JpaRepository<Input, Integer> {


}
