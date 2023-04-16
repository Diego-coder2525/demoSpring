package test;

public class SecretarioEmpleado implements Empleados{

    //
    private CreacionInformes informeNuevo;
    //
    private int edadEmpresa;
    private String email;

    public CreacionInformes getInformeNuevo() {
        return informeNuevo;
    }

    public int getEdadEmpresa() {
        return edadEmpresa;
    }

    public void setEdadEmpresa(int edadEmpresa) {
        this.edadEmpresa = edadEmpresa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getTareas() {
        return "Gestiono tareas secretario";
    }

    @Override
    public String getInforme() {
        return "Informe generado por secretario: "+informeNuevo.getInforme();
    }

    public void setInformeNuevo(CreacionInformes informeNuevo) {
        this.informeNuevo = informeNuevo;
    }

}
