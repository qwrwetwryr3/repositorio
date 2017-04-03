package reserva;

public class Sitio extends Reserva {

    private String idSitio;
    private boolean conQuincho;

    public Sitio(String idSitio, boolean conQuincho, int id, String nombre, int telefono, int pasajeros, int numeroDeNoches) {
        super(id, nombre, telefono, pasajeros, numeroDeNoches);
        this.idSitio = idSitio;
        this.conQuincho = conQuincho;
    }

    public String getIdSitio() {
        return idSitio;
    }

    public void setIdSitio(String idSitio) {
        this.idSitio = idSitio;
    }

    public boolean isConQuincho() {
        return conQuincho;
    }

    public void setConQuincho(boolean conQuincho) {
        this.conQuincho = conQuincho;
    }

    @Override
    public String toString() {
        return super.toString()+"Sitio{" + "idSitio=" + idSitio + ", conQuincho=" + conQuincho + '}';
    }

    @Override
    public int calcularPago() {
        int pago=precioBaseSitio*numeroDeNoches;
        return pago;  
    }

}
