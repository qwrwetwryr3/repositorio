
package reserva;
import java.util.*;
public class GestionarReservas {
    
    static ArrayList<Reserva>reservas;
    public GestionarReservas(){
        reservas=new ArrayList<Reserva>();
    }
    public static boolean agregarReserva(Reserva nuevaReserva){
        if(verificarReserva(nuevaReserva.getId())==false){
            reservas.add(nuevaReserva);
            return true;
        }else{
            return false;
        }
    }
    public static boolean verificarReserva(int id){
        boolean valida=false;
        for(Reserva temporalReserva:reservas){
            if(temporalReserva.getId()==id){
                valida=true;
                break;
            }
        }
        return valida;
    }
    public static boolean eliminarReserva(int id){
        boolean valida=false;
        for(int i=0;i<reservas.size();i++){
            if(reservas.get(i).getId()==id){
                reservas.remove(i);
                valida=true;
                break;
            }
        }
        return valida;
    }
    public static String listarReservas(){//DEBE SER void();
        String datos="";
        for(Reserva temporalReserva:reservas){
            datos=datos+temporalReserva.toString()+"\n";
                    
        }
        return datos;
    }
    public static int facturarReserva(int id){
        int facturar=0;
        for(Reserva temporalReserva:reservas){
            if(id==temporalReserva.getId()){
                facturar=((int) ((temporalReserva.calcularPago()*(1+Reserva.IVA))));
            }
           
        }
        return facturar;
    }
    public static boolean validarNombre(String nombre){
        return (nombre.length()>0);
    }
    public static boolean validarTelefono(int telefono){
        return (telefono>=0);
    }
    public static boolean validarPasajeros(int pasajeros){
        return (pasajeros>=1);
    }
    public static boolean validarNumeroDeNoches(int numeroDeNoches){
        return (numeroDeNoches>=1);
    }
    
}
