public class Trabajador extends Persona {
    private double salario;
    private RegimenPensional regimenPensional;
    private double aportesAcumulados;
    private int mesesCotizados;
    
    

    public Trabajador(String nombre, String identificacion, String tipoTrabajador, double salario, RegimenPensional regimenPensional) {
        super(nombre, identificacion, tipoTrabajador);
        this.salario = salario;
        this.regimenPensional = regimenPensional;
        this.aportesAcumulados = 0.0;
        this.mesesCotizados = 0;
    }

    // Get y Set
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public RegimenPensional getRegimenPensional() {
        return regimenPensional;
    }

    public void setRegimenPensional(RegimenPensional regimenPensional) {
        this.regimenPensional = regimenPensional;
    }

    public double getAportesAcumulados() {
        return aportesAcumulados;
    }

    public void setAportesAcumulados(double aportesAcumulados) {
        this.aportesAcumulados = aportesAcumulados;
    }

    public int getMesesCotizados() {
        return mesesCotizados;
    }

    public void setMesesCotizados(int mesesCotizados) {
        this.mesesCotizados = mesesCotizados;
    }
    
    public void agregarTrabajador(){
        
    }
    
    //calcular los aportes mensuales
    public double calcularAporte() {
        return salario * 0.16;
    }

    //cotizar mes
    public void cotizarMes() {
        double aporteMensual = calcularAporte();
        aportesAcumulados += aporteMensual;
        mesesCotizados++;
    }

    // proyectar la pensión futura
    public double proyectarPension() {
        return regimenPensional.proyectarPension(aportesAcumulados, mesesCotizados);
    }
}
