package test;

public class JefeEmpleado implements Empleados{
    private CreacionInformes informeNuevo;

    //Inyeccion de dependencias por constructor
    public JefeEmpleado(CreacionInformes informeNuevo ) {
        this.informeNuevo = informeNuevo;
    }


    @Override
    public String getTareas(){
        return "Gestiono tareas jefe";
    }

    @Override
    public String getInforme() {
        return "Informe presentado por el jefe: "+informeNuevo.getInforme();
    }

}
