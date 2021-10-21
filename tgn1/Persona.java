package tgn1;

public abstract class Persona {
  private String nombre;
  private Integer edad;

  public Persona(String nombre, Integer edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Integer getEdad() {
    return edad;
  }

  public void setEdad(Integer edad) {
    this.edad = edad;
  }

  public abstract String getTipo();

  @Override
  public String toString() {
    return "Persona [edad=" + edad + ", nombre=" + nombre + "]";
  }

}
