public class RAIS extends RegimenPensional {

    public RAIS() {
        super(0.16); // Porcentaje de aporte del 16%
    }

    @Override
    public double calcularAporte(double salario) {
        return salario * porcentajeAporte;
    }

    @Override
    public double proyectarPension(double aportesAcumulados, int mesesCotizados) {
        return (aportesAcumulados / mesesCotizados) * 0.5;
    }
}

