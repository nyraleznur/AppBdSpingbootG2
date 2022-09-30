package SpingbootG2.AppBdSpingbootG2.controladores;

import SpingbootG2.AppBdSpingbootG2.entidades.Cliente;
import SpingbootG2.AppBdSpingbootG2.servicios.ServiciosCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ControladorCliente {
    @Autowired
    private ServiciosCliente sc;
   @GetMapping
    public List<Cliente> consultaClienter(){


       return sc.listasClientes();




   }

   @GetMapping("/{doc}")
   public Cliente consultarPorDocumento(@PathVariable("doc") Integer doc){
       return sc.consultarclientePorDocumento(doc);
   }


   @GetMapping("buscarnombre/{nom}")
   public Cliente consultarPorNombre(@PathVariable("nom") String nom){

       return  sc.consultarPorNombre(nom);
   }

   @GetMapping("buscardos/{nombre}")
   public  Cliente buscranombre(@PathVariable("nombre") String nombre){
       return  sc.buscarpornombre(nombre);
   }



   @PostMapping
    public Cliente insertarClientes(@RequestBody Cliente cliente){

       return sc.guardarCliente(cliente);
   }





   @PutMapping
    public Cliente actualizarCliente(@RequestBody Cliente cliente){

       return  sc.actualizarCliente(cliente);
   }
   @DeleteMapping
    public void eliminarCliente(@RequestBody Cliente cliente){

       sc.eliminarCliente(cliente);
   }

   @DeleteMapping("/{doc}")
    public void eliminarPorDocumento(@PathVariable("doc") Integer doc){

       sc.eliminarClientePorDocumento(doc);

   }



}
