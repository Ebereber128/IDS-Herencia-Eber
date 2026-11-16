public class Persona {
  protected int id;
  protected String nombre;
  protected String ciudad;
}
public Persona (int id, String nombre,
                String ciudad){
  this.id = id;
  this.nombre = nombre;
  this.ciudad = ciudad;
}
public void mostrarInfo(){
  System.out.println("ID: " + id + " ]
Nombre: " + nombre + [ ciudad: " + ciudad);
}
public String getNombre() {
  return nombre;
 }
}
