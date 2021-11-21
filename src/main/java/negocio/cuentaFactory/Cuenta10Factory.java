package negocio.cuentaFactory;

import negocio.cuenta.Cuenta;
import negocio.cuenta.Cuenta10;
import negocio.cuenta.Regalo;
import negocio.tarjeta.TarjetaDeCredito;
import negocio.tarjeta.TarjetaDeDebito;

public class Cuenta10Factory implements iCuentaFactory{

    @Override
    public Cuenta crearCuenta() {
        return new Cuenta10(0.01, new TarjetaDeDebito(0),
                Regalo.REPRODUCTOR_CD, new TarjetaDeCredito(180, 0.60, 0.00),
                0.50);
    }
}
