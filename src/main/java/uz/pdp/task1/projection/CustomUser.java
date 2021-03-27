package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.User;
import uz.pdp.task1.entity.Warehouse;

import java.util.Set;

@Projection(types = User.class)
public interface CustomUser {

    Integer getId();

    String getFirstName();

    String getLastName();

    String getPhoneNumber();

    String getCode();

    String getPassword();

    Boolean getActive();

    Set<Warehouse> getWarehouses();

}
