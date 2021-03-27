package uz.pdp.task1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task1.entity.Currency;
import uz.pdp.task1.entity.User;
import uz.pdp.task1.projection.CustomCurrency;
import uz.pdp.task1.projection.CustomUser;

@RepositoryRestResource(path = "currency",collectionResourceRel = "currencyList", excerptProjection = CustomCurrency.class)
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {


}
