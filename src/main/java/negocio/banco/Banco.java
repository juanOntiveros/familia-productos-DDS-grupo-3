package negocio.banco;

import negocio.cliente.Cliente;
import negocio.cuentaFactory.Cuenta10Factory;
import negocio.cuentaFactory.CuentaEstandarFactory;
import negocio.cuentaFactory.CuentaJovenFactory;
import negocio.cuentaFactory.CuentaOroFactory;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Cliente> clientes;

    public Banco() {
        this.clientes = new ArrayList<Cliente>();
    }

    public void asignarCuenta(Cliente cliente) {
        if (cliente.getEdad() <= 25){
            cliente.setCuenta(new CuentaJovenFactory().crearCuenta());
        } else if (cliente.getEdad() > 25 && cliente.getEdad()<= 65 && cliente.tieneNominaDomiciliaria()) {
            cliente.setCuenta(new Cuenta10Factory().crearCuenta());
        } else if (cliente.getEdad() > 65 && cliente.tienePension()){
            cliente.setCuenta(new CuentaOroFactory().crearCuenta());
        } else {
            cliente.setCuenta(new CuentaEstandarFactory().crearCuenta());
        }
    }

    public void agregarCliente(Cliente cliente){
        this.asignarCuenta(cliente);
        this.clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}
