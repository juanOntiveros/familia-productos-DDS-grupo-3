package negocio.tarjeta;

public class TarjetaDeDebito extends Tarjeta {
    private double monto;

    public TarjetaDeDebito(int mantenimiento) {
        super(mantenimiento);
        this.monto = 0.00;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
