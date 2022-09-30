package SpingbootG2.AppBdSpingbootG2.servicios;

import SpingbootG2.AppBdSpingbootG2.entidades.Cliente;
import SpingbootG2.AppBdSpingbootG2.repositorios.RepositorioCliente;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosCliente {
    @Autowired
    private RepositorioCliente rc;


    public List<Cliente> listasClientes(){
        return rc.findAll();
    }

    public Cliente guardarCliente(Cliente cliente){

        return  rc.save(cliente);
    }

    public Cliente actualizarCliente(Cliente cliente){
        return  rc.save(cliente);

    }

    public void eliminarCliente(Cliente cliente){
         rc.delete(cliente);
    }

    public Cliente consultarClientePorId(Integer documento){

        return rc.findById(documento).get();
    }

    public Cliente consultarclientePorDocumento(Integer documento){
        return  rc.findById(documento).get();

    }
    public void eliminarClientePorDocumento(Integer documento){
        rc.deleteById(documento);
    }









}
