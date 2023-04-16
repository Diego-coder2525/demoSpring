package test;

public class DirectorEmpleado implements Empleados {
    private int edadEmpresa;
    private String email;

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

    //Creacion de campo tipo CreacionInformes
    private CreacionInformes informeNuevo;
    //Inyeccion de dependencias por constructor
    public DirectorEmpleado(CreacionInformes informeNuevo){
        this.informeNuevo=informeNuevo;
    }
    @Override
    public String getTareas() {
        return "Gestiono tareas director";
    }

    @Override
    public String getInforme() {
        return "Informe creado por el Director: " + informeNuevo.getInforme();
    }

}
