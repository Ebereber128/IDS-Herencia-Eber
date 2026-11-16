public class Main {
  public static void main(Sring[] args) {
    Persona p1 = new Persona(1, "Eber",
                             "Cuencame");
    Cliente c1 = new Cliente(2, "Juan",
                             "Durango", "Premium");
    Empleado e1 = new Empleado(3, "Maria",
                               "Torreon", 15000);
    p1.mostrarInfo();
    System.out.prinIn("---");
    c1.mostrarInfo();
    System.out.printIn("---");
    e1.mostrarInfo();
  }
}
