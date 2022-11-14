package pe.isil.srpingdatajpaep3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.isil.srpingdatajpaep3.Entity.Ciudad;

import java.util.List;

@Repository
public interface CiudadRepository extends JpaRepository<Ciudad,Long> {
    Ciudad findCiudadByName(String ciudad);
    List<Ciudad>findCiudadById(String ciudad);
}





