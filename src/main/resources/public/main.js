$(document).ready(function(){
alert("Consultar cliente")
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
consultarCliente()


function mostrarTabla(datos){
let tabla="<table>";
for(i=0; i<datos.length; i++){
tabla+="<tr>";
tabla+="<td>" +datos[i].documento+"</td>"
tabla+="<td>"+datos[i].nombre+"</td>"
tabla+="<td>"+datos[i].apellido+"</td>"
tabla+="<td>"+datos[i].correo+"</td>"
tabla+="<td>"+datos[i].celular+"</td>"
tabla+="</tr>"
tabla+="</table>"
$("#contenedor").append(tabla);

}




}





});