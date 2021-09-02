//package empleado;

public class Empleado {
    
    private int id=0;
    private final String nombre="null";
    private final String apellido="null";
    private  int comision=0;
    private final int horasExtra=0;
    private  int salario=0;
    
    
    
    public Empleado(String nombre, String apellido, int comision, int horasExtra, int salario){
    
        //this.nombre=nombre;
        apellido="null";
        this.comision=comision;
        horasExtra=0;
        this.salario=salario;
        
    }
    
    public static double calcularMiNomina(Empleado empleado){
    
        double salida=1;
        
        salida= (empleado.comision+empleado.salario)*0.92;
        
        return salida;
    }

    
}
