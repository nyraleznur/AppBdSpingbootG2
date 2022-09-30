$(document).ready(function(){
<<<<<<< HEAD
alert("Consultar cliente")
=======

consultarCliente();


>>>>>>> bf7518d (nuevo)
function consultarCliente(){
$.ajax({
url:"http://localhost:8080/cliente",
type:"GET",
datatype:"JSON",
success:function(respuesta){
console.log(respuesta)
mostrarTabla(respuesta)
}
});
}
<<<<<<< HEAD
consultarCliente()


function mostrarTabla(datos){
=======

/*function mostrarTabla(datos){
>>>>>>> bf7518d (nuevo)
let tabla="<table>";
for(i=0; i<datos.length; i++){
tabla+="<tr>";
tabla+="<td>" +datos[i].documento+"</td>"
tabla+="<td>"+datos[i].nombre+"</td>"
tabla+="<td>"+datos[i].apellido+"</td>"
tabla+="<td>"+datos[i].correo+"</td>"
tabla+="<td>"+datos[i].celular+"</td>"
tabla+="</tr>"
<<<<<<< HEAD
tabla+="</table>"
$("#contenedor").append(tabla);

}

=======

}

tabla+="</table>"
$("#contenedor").append(tabla);
}*/

function mostrarTabla(datos){
let tabla=document.getElementById('tabla');
console.log(tabla);
tabla.innerHTML='';
tabla.innerHTML=`<tr>
                  <th>Documento</th>
                  <th>Nombre</th>
                  <th>Apellido</th>
                  <th>Correo</th>
                  <th>Celular</th>
                 </tr>`;
                 for( i of datos ){
                  tabla.innerHTML+=`
                  <tr>
                  <td>${i.documento}</td>
                  <td>${i.nombre}</td>
                  <td>${i.apellido}</td>
                  <td>${i.correo}</td>
                  <td>${i.celular}</td>
                  </tr>`
                  }
>>>>>>> bf7518d (nuevo)



}




<<<<<<< HEAD
=======
function guardarCliente(){
let datos={
documento:$('#doc').val(),
nombre:$('#nom').val(),
apellido:$('#ape').val(),
correo:$('#cor').val(),
celular:$('#cel').val()
}

let enviodatos=JSON.stringify(datos);
$.ajax({
url:"http://localhost:8080/cliente",
type:"POST",
data:enviodatos,
contentType:"application/JSON",
datatype:"JSON",
success:function(respuesta){
 console.log(respuesta)
 if(respuesta!=null){

  alert("Datos guardados")
  consultarCliente()
 }
}
});

}



$('#btnregistrar').on('click',function(){
alert("Guardar")
  guardarCliente()

})

function actualizarCliente(){
let datos={
documento:$('#doc').val(),
nombre:$('#nom').val(),
apellido:$('#ape').val(),
correo:$('#cor').val(),
celular:$('#cel').val()
}

let enviodatos=JSON.stringify(datos);
$.ajax({
url:"http://localhost:8080/cliente",
type:"PUT",
data:enviodatos,
contentType:"application/JSON",
datatype:"JSON",
success:function(respuesta){
 console.log(respuesta)
 if(respuesta!=null){

  alert("Datos actualizados")
  consultarCliente()
 }
}
});

}

$('#btnactualizar').on('click',function(){
alert("Actualizar")
actualizarCliente();
})


function eliminar(){
let doc=$('#eliminar').val();
$.ajax({
url:"http://localhost:8080/cliente/"+doc,
type:"DELETE",
success:function(res){
if(res!=null){
alert("Mensaje eliminado")
consultarCliente()
}
}
})
}
$('#btneliminar').on('click',function(){
alert("Eliminar")
eliminar();
});


function consultarUnCliente(){
let doc=$('#buscar').val();
$.ajax({
url:"http://localhost:8080/cliente/"+doc,
type:"GET",
datatype:"JSON",
success:function(res){
console.log(res);
mostrarDatosUncliente(res);
}
})

}
function mostrarDatosUncliente(dato){
let dat="<form>";
dat+="<input type='text' id='doc' value="+dato.documento+">"
dat+="<input type='text' id='nom' value="+dato.nombre+">"
dat+="<input type='text' id='ape' value="+dato.apellido+">"
dat+="<input type='text' id='cor' value="+dato.correo+">"
dat+="<input type='text' id='cel' value="+dato.celular+">"
dat+="</form>"
$('#contenedorunregistro').append(dat);


}

$('#btnbuscar').on('click',function(){
alert("buscar");
consultarUnCliente();

});


});