public class Estudiante {

    String nombre;
    int calificacion;

    public void mostrarNombre() {
        System.out.println("Hola soy un alumno y se decir mi nombre");

    }

    public Estudiante(int calificacion) {
        this.calificacion = calificacion;
    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
