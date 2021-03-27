package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.*;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {

    Integer getId();

    Timestamp getDate();

    Warehouse getWarehouse();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();

    Client getClient();


}
