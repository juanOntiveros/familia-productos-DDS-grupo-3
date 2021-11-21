package negocio.cuentaFactory;

import negocio.cuenta.Cuenta;
import negocio.tarjeta.TarjetaDeDebito;

public class CuentaEstandarFactory implements iCuentaFactory{
    @Override
    public Cuenta crearCuenta() {
        return new Cuenta(0.005, new TarjetaDeDebito(50));
    }
}
