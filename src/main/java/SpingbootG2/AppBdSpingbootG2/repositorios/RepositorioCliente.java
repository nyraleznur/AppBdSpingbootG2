package SpingbootG2.AppBdSpingbootG2.repositorios;

import SpingbootG2.AppBdSpingbootG2.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCliente extends JpaRepository<Cliente,Integer> {


}
