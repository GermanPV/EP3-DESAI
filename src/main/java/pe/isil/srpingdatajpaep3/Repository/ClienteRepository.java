package pe.isil.srpingdatajpaep3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.isil.srpingdatajpaep3.Entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
