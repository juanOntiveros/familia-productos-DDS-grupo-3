package negocio.cuenta;

import negocio.tarjeta.TarjetaDeDebito;

public class Cuenta {

    private double interes;
    private TarjetaDeDebito tarjetaDeDebito;

    public Cuenta(double interes, TarjetaDeDebito tarjetaDeDebito) {
        this.interes = interes;
        this.tarjetaDeDebito = tarjetaDeDebito;
    }

    public double getInteres() {
        return interes;
    }

    public TarjetaDeDebito getTarjetaDeDebito() {
        return tarjetaDeDebito;
    }
}
