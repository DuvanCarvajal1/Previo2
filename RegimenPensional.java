public abstract class RegimenPensional {
    protected double porcentajeAporte;

    public RegimenPensional(double porcentajeAporte) {
        this.porcentajeAporte = porcentajeAporte;
    }

    //calcular el aporte
    public abstract double calcularAporte(double salario);

    //proyectar la pensión futura
    public abstract double proyectarPension(double aportesAcumulados, int mesesCotizados);

    // Get y Set
    public double getPorcentajeAporte() {
        return porcentajeAporte;
    }

    public void setPorcentajeAporte(double porcentajeAporte) {
        this.porcentajeAporte = porcentajeAporte;
    }
}
