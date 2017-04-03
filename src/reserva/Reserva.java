
package reserva;

public abstract class Reserva implements Calcular {
    private int id;
    private String nombre;
    private int telefono;
    private int pasajeros;
    protected int numeroDeNoches;

    public Reserva(int id, String nombre, int telefono, int pasajeros, int numeroDeNoches) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.pasajeros = pasajeros;
        this.numeroDeNoches = numeroDeNoches;
    }

    public int getNumeroDeNoches() {
        return numeroDeNoches;
    }

    public void setNumeroDeNoches(int numeroDeNoches) {
        this.numeroDeNoches = numeroDeNoches;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        return "Reserva{" + "id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", pasajeros=" + pasajeros + ", numeroDeNoches=" + numeroDeNoches + '}';
    }

   
    
}
