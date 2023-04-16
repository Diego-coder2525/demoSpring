package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {
    public static void main(String[] args) {
        //Empleados Empleado = new DirectorEmpleado();

        //System.out.println(Empleado.getTareas());

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        /*Empleados Juan = context.getBean("miSecretario", Empleados.class);

        System.out.println(Juan.getTareas());
        System.out.println(Juan.getInforme());*/

        // Inyeccion con setter I - depend
        SecretarioEmpleado Maria = context.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
        System.out.println(Maria.getTareas());
        System.out.println(Maria.getInforme());
        System.out.println(Maria.getEmail());
        System.out.println(Maria.getEdadEmpresa());
        System.out.println(Maria);

        // Inyeccion con setter II - campos
        DirectorEmpleado Juan = context.getBean("miEmpleado",DirectorEmpleado.class);
        System.out.println(Juan.getTareas());
        System.out.println(Juan.getInforme());
        System.out.println(Juan.getEmail());
        System.out.println(Juan.getEdadEmpresa());
        System.out.println(Juan);


        context.close();
    }
}
