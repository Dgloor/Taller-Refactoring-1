package modelos;

public class Materia {
    public String codigo;
    public String nombre;
    public String facultad;
    public double notaInicial;
    public double notaFinal;
    public double notaTotal;


    public void setNotaTotal(){
         this.notaTotal = (this.notaInicial+this.notaFinal)/2;

    }

    public double getNotaTotal(){
        return notaTotal;
    }

}
