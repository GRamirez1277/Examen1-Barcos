import java.util.Calendar;

public abstract class Barco {
    private String nombre;
    private Calendar circulacion;
    
    public Barco(String name){
        this.nombre=name;
        circulacion=Calendar.getInstance();
    }

    public final String getNombre() {
        return nombre;
    }

    public final Calendar getCirculacion() {
        return circulacion;
    }
    
    public String toString(){
        return "Nombre del barco: "+nombre;
    }
    
    public abstract void agregarElemento();
    public abstract double vaciarCobrar();
    public abstract double precioElemento();
}
