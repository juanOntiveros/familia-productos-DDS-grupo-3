package negocio.cuentaFactory;

import negocio.cuenta.Cuenta;
import negocio.cuenta.CuentaJoven;
import negocio.cuenta.Regalo;
import negocio.tarjeta.TarjetaDeDebito;

public class CuentaJovenFactory implements iCuentaFactory{

    @Override
    public Cuenta crearCuenta(){
        return new CuentaJoven(0.02, new TarjetaDeDebito(0), Regalo.CD_MUSICA);
    }

}
