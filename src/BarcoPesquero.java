public class BarcoPesquero extends Barco {
    private int pecesCapturados;
    private TipoPesquero tipoPesquero;

    public BarcoPesquero(TipoPesquero tipoPesquero) {
        super("PESQUERO");
        pecesCapturados = 0;
    }

    @Override
    public void agregarElemento() {
        pecesCapturados++;
    }

    @Override
    public double vaciarCobrar() {
        double total=pecesCapturados*tipoPesquero.price;
        pecesCapturados = 0;
        return total;
    }

    @Override
    public double precioElemento() {
        return tipoPesquero.price;
    }

    @Override
    public String toString() {
        return " Barco Pesquero: "+tipoPesquero+" Peces Capturados: "+pecesCapturados;
    }
}