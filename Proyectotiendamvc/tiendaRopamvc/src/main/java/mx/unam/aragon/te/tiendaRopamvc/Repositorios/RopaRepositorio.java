package mx.unam.aragon.te.tiendaRopamvc.Repositorios;

import mx.unam.aragon.te.tiendaRopamvc.Models.Ropa;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RopaRepositorio  extends JpaRepository<Ropa, Integer> {


}
