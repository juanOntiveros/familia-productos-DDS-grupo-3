package negocio.cuenta;

import negocio.tarjeta.TarjetaDeCredito;
import negocio.tarjeta.TarjetaDeDebito;

public class Cuenta10 extends Cuenta{

    private Regalo regalo;
    private TarjetaDeCredito tarjetaDeCredito;
    private double descubierto;

    public Cuenta10(double interes, TarjetaDeDebito tarjetaDeDebito, Regalo regalo,
                    TarjetaDeCredito tarjetaDeCredito, double descubierto) {
        super(interes, tarjetaDeDebito);
        this.regalo = regalo;
        this.tarjetaDeCredito = tarjetaDeCredito;
        this.descubierto = descubierto;
    }

    public Regalo getRegalo() {
        return regalo;
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }

    public double getDescubierto() {
        return descubierto;
    }

}
