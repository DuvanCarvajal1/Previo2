import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class SistemaPensional {
    private List<Trabajador> trabajadores;

    public SistemaPensional() {
        this.trabajadores = new ArrayList<>();
    }

    //afiliar un nuevo trabajador
    public void afiliarTrabajador(String nombre, String identificacion, String tipoTrabajador, double salario, RegimenPensional regimen) {
        Trabajador nuevoTrabajador = new Trabajador(nombre, identificacion, tipoTrabajador, salario, regimen);
        trabajadores.add(nuevoTrabajador);
        System.out.println("Trabajador afiliado: " + nombre);
    }
    

    //calcular los aportes de todos los trabajadores
    public void calcularAportes() {
        for (Trabajador trabajador : trabajadores) {
            double aporte = trabajador.calcularAporte();
            trabajador.cotizarMes();
            System.out.println("Aporte mensual de " + trabajador.getNombre() + ": " + aporte);
        }
    }
    

    //simular la pensión futura
    public void simularPensiones() {
        for (Trabajador trabajador : trabajadores) {
            double pensionFutura = trabajador.proyectarPension();
            System.out.println("Pensión futura de " + trabajador.getNombre() + ": " + pensionFutura);
        }
    }

    
    
    //
    public static void main(String[] args) {
        SistemaPensional sistema = new SistemaPensional();
        
        RegimenPensional rpm = new RPM();
        RegimenPensional rais = new RAIS();
        
        
        
        sistema.calcularAportes();
        sistema.simularPensiones();
    }
}

