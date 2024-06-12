public class RPM extends RegimenPensional {

    public RPM() {
        super(0.16);
    }

    @Override
    public double calcularAporte(double salario) {
        return salario * porcentajeAporte;
    }

    //calcular el IBL 
    private double calcularIBL(Trabajador trabajador) {
        return trabajador.getSalario();
    }

    //calcular el porcentaje de pensión 
    private double calcularPorcentajePension(int semanasCotizadas) {
        if (semanasCotizadas < 1300) {
            return 0.65;
        } else {
            int semanasExtra = semanasCotizadas - 1300;
            int bloquesAdicionales = semanasExtra / 50;
            double porcentajeExtra = bloquesAdicionales * 0.015;
            return Math.min(0.65 + porcentajeExtra, 0.80);
        }
    }

    @Override
    public double proyectarPension(double aportesAcumulados, int mesesCotizados) {
        //pasar meses a semanas
        int semanasCotizadas = mesesCotizados * 4;
        
        // calcular IBL
        Trabajador trabajador = agregarTrabajador();
        //trabajor iob1 = new trabajor(){}
        double IBL = calcularIBL(trabajador);
        
        
        // Calcular P (Porcentaje de Pensión)
        double porcentajePension = calcularPorcentajePension(semanasCotizadas);
        
        // Calcular y devolver la pensión
        return IBL * porcentajePension;
    }
}



