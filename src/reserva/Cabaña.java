
package reserva;

public  class Cabaña extends Reserva {
    private int idCabaña;
    private String tipo;


    public Cabaña(int idCabaña, String tipo, int id, String nombre, int telefono, int pasajeros, int numeroDeNoches) {
        super(id, nombre, telefono, pasajeros, numeroDeNoches);
        this.idCabaña = idCabaña;
        this.tipo = tipo;
    }
   
    public int getIdCabaña() {
        return idCabaña;
    }

    public void setIdCabaña(int idCabaña) {
        this.idCabaña = idCabaña;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+"Caba\u00f1a{" + "idCaba\u00f1a=" + idCabaña + ", tipo=" + tipo + '}';
    }
    
    @Override
    public int calcularPago() {
        int pago=precioBaseCabaña*numeroDeNoches;
        return pago;
    }
    
    
}
