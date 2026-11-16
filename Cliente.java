public class Cliente extends Persona {
  private String tipocliente;
  public Cliente(int id, String nombre, 
                 String ciudad, String tipocliente) {
    super(id, nombre, ciudad);
    this.tipocliente = tipocliente;
  }
  @Override
  public void mostrarInfo() {
    super.mostrarInfo();
    System.out,prinIn("Tipo Cliente: " +
                      tipocliente);
                      }
}
