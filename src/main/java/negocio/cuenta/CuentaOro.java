package negocio.cuenta;

import negocio.tarjeta.TarjetaDeCredito;
import negocio.tarjeta.TarjetaDeDebito;

public class CuentaOro extends Cuenta {

    private TarjetaDeCredito tarjetaDeCredito;
    private Regalo regalo;

    public CuentaOro(double interes, TarjetaDeDebito tarjetaDeDebito,
                     Regalo regalo, TarjetaDeCredito tarjetaDeCredito) {
        super(interes, tarjetaDeDebito);
        this.tarjetaDeCredito = tarjetaDeCredito;
        this.regalo = regalo;
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }

    public Regalo getRegalo() {
        return regalo;
    }

}
