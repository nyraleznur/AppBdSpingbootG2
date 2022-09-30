package SpingbootG2.AppBdSpingbootG2.repositorios;

import SpingbootG2.AppBdSpingbootG2.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



   

public interface RepositorioCliente extends JpaRepository<Cliente,Integer> {
Cliente findByNombre(String cliente);

@Query("Select c  from Cliente  c where c.nombre=:nombre ")
   public  Cliente buscarpornombre(String nombre);



}
