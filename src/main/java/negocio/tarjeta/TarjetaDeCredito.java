package negocio.tarjeta;

public class TarjetaDeCredito extends Tarjeta {
    private double nomina;
    private double pension;

    public TarjetaDeCredito(int mantenimiento, double nomina, double pension) {
        super(mantenimiento);
        this.nomina = nomina;
        this.pension = pension;
    }

    public double getNomina() {
        return nomina;
    }

    public void setNomina(double nomina) {
        this.nomina = nomina;
    }

    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }
}
