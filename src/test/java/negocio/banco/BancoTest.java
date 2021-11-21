package negocio.banco;

import negocio.cliente.Cliente;
import negocio.cuenta.*;
import negocio.tarjeta.TarjetaDeDebito;
import org.junit.Assert;
import org.junit.Test;

public class BancoTest {

    static Banco banco;
    static Cliente cliente;

    @Test
    public void testAlAgregarUnClienteJovenSuCuentaEsJoven(){
        banco = new Banco();
        cliente = new Cliente(18, false, false);

        banco.agregarCliente(cliente);

        CuentaJoven cuentaJoven = (CuentaJoven) cliente.getCuenta();

        Assert.assertEquals(Regalo.CD_MUSICA, cuentaJoven.getRegalo());
    }

    @Test
    public void testAlAgregarUnCliente10SuCuentaEs10(){
        banco = new Banco();
        cliente = new Cliente(26, false, true);

        banco.agregarCliente(cliente);

        Cuenta10 cuenta10 = (Cuenta10) cliente.getCuenta();

        Assert.assertEquals(Regalo.REPRODUCTOR_CD, cuenta10.getRegalo());
    }

    @Test
    public void testAlAgregarUnClienteDeOroSuCuentaEsOro(){
        banco = new Banco();
        cliente = new Cliente(66, true, true);

        banco.agregarCliente(cliente);

        CuentaOro cuenta10 = (CuentaOro) cliente.getCuenta();

        Assert.assertEquals(Regalo.SEGURO, cuenta10.getRegalo());
    }

    @Test
    public void testAlAgregarUnClienteDe26AniosSinNominaSuCuentaEsEstandar(){
        banco = new Banco();
        cliente = new Cliente(26, false, false);

        banco.agregarCliente(cliente);

        Cuenta cuentaEstandar = cliente.getCuenta();

        TarjetaDeDebito tarjetaDeDebito = cuentaEstandar.getTarjetaDeDebito();

        Assert.assertEquals(50, tarjetaDeDebito.getMantenimiento());
    }

    @Test
    public void testAlAgregarUnClienteDe66AniosSinPensionSuCuentaEsEstandar(){
        banco = new Banco();
        cliente = new Cliente(66, false, true);

        banco.agregarCliente(cliente);

        Cuenta cuentaEstandar = cliente.getCuenta();

        TarjetaDeDebito tarjetaDeDebito = cuentaEstandar.getTarjetaDeDebito();

        Assert.assertEquals(50, tarjetaDeDebito.getMantenimiento());
    }

}
