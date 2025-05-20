package mx.unam.aragon.te.tiendaRopamvc.Servicios;

import mx.unam.aragon.te.tiendaRopamvc.Models.Ropa;
import mx.unam.aragon.te.tiendaRopamvc.Repositorios.RopaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ArtistaService {
    @Autowired
    private RopaRepositorio ropaRepositorio;

 public boolean guardarRopa(Ropa ropa){
Ropa r = ropaRepositorio.save(ropa);
return r!=null;
 }
 public Ropa obtenerRopa(int id){
     return ropaRepositorio.findById(id).get();
 }
}
