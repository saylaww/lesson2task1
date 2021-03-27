package uz.pdp.task1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task1.entity.Measurement;
import uz.pdp.task1.entity.User;
import uz.pdp.task1.projection.CustomMeasurement;
import uz.pdp.task1.projection.CustomUser;

@RepositoryRestResource(path = "measurement",collectionResourceRel = "measurementList", excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {


}
