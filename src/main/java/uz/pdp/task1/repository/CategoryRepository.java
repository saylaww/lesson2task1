package uz.pdp.task1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task1.entity.Category;
import uz.pdp.task1.entity.User;
import uz.pdp.task1.projection.CustomCategory;
import uz.pdp.task1.projection.CustomUser;

@RepositoryRestResource(path = "category",collectionResourceRel = "categoryList", excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {


}
