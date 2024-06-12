public class Persona {
    private String nombre;
    private String identificacion;
    private String tipoTrabajador;

    public Persona(String nombre, String identificacion, String tipoTrabajador) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.tipoTrabajador = tipoTrabajador;
    }


//Start GetterSetterExtension Source Code

    /**GET Method Propertie nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**SET Method Propertie nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**GET Method Propertie identificacion*/
    public String getIdentificacion(){
        return this.identificacion;
    }//end method getIdentificacion

    /**SET Method Propertie identificacion*/
    public void setIdentificacion(String identificacion){
        this.identificacion = identificacion;
    }//end method setIdentificacion

    /**GET Method Propertie tipoTrabajador*/
    public String getTipoTrabajador(){
        return this.tipoTrabajador;
    }//end method getTipoTrabajador

    /**SET Method Propertie tipoTrabajador*/
    public void setTipoTrabajador(String tipoTrabajador){
        this.tipoTrabajador = tipoTrabajador;
    }//end method setTipoTrabajador

//End GetterSetterExtension Source Code


}//End class