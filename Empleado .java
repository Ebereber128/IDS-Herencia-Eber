public class Empleado extends Persona {
  private double salario;
  public Empleado(int id, String nombre,
                  String ciudad, double salario) {
    super(id, nombre, ciudad);
    this.salario = salario;
  }
  @Override
  public void mostrarInfo() {
    super.mostrarInfo();
    System.out.print1n("salario: " +
                       salario);
  }
}
