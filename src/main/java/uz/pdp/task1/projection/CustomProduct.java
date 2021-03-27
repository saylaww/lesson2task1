package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.Attachment;
import uz.pdp.task1.entity.Category;
import uz.pdp.task1.entity.Measurement;
import uz.pdp.task1.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {

    Integer getId();

    String getName();

    Boolean getActive();

    Category getCategory();

    Attachment getPhoto();

    String getCode();

    Measurement getMeasurement();

}
