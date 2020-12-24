package modelos;

public class InformacionAdicionalProfesor {
    public int añosdeTrabajo;
    public String facultad;
    public double BonoFijo;

    public double calcularSueldo(){
        return añosdeTrabajo * 600 + BonoFijo;
    } 
    
}
