package negocio.cuentaFactory;

import negocio.cuenta.Cuenta;
import negocio.cuenta.CuentaOro;
import negocio.cuenta.Regalo;
import negocio.tarjeta.TarjetaDeCredito;
import negocio.tarjeta.TarjetaDeDebito;

public class CuentaOroFactory implements iCuentaFactory{

    @Override
    public Cuenta crearCuenta() {
        return new CuentaOro(0.015, new TarjetaDeDebito(0), Regalo.SEGURO,
                new TarjetaDeCredito(0, 0.00, 0.60));
    }
}
