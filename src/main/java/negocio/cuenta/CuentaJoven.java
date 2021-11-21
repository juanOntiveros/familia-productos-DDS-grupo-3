package negocio.cuenta;

import negocio.tarjeta.TarjetaDeDebito;

public class CuentaJoven extends Cuenta{

    private Regalo regalo;

    public CuentaJoven(double interes, TarjetaDeDebito tarjetaDeDebito, Regalo regalo) {
        super(interes, tarjetaDeDebito);
        this.regalo = regalo;
    }

    public Regalo getRegalo() {
        return regalo;
    }
}
