package negocio.cliente;

import negocio.cuenta.Cuenta;
import negocio.cuentaFactory.iCuentaFactory;

public class Cliente {

    private Integer edad;
    private Boolean tienePension;
    private Boolean tieneNominaDomiciliaria;
    private Cuenta cuenta;

    public Cliente(Integer edad, Boolean tienePension, Boolean tieneNominaDomiciliaria) {
        this.edad = edad;
        this.tienePension = tienePension;
        this.tieneNominaDomiciliaria = tieneNominaDomiciliaria;
    }

    public Integer getEdad() {
        return edad;
    }

    public Boolean tienePension() {
        return tienePension;
    }

    public void setTienePension(Boolean tienePension) {
        this.tienePension = tienePension;
    }

    public Boolean tieneNominaDomiciliaria() {
        return tieneNominaDomiciliaria;
    }

    public void setTieneNominaDomiciliaria(Boolean tieneNominaDomiciliaria) {
        this.tieneNominaDomiciliaria = tieneNominaDomiciliaria;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
}
