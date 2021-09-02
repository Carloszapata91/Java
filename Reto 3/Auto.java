package empleado;

public class Auto {
    private String marca;
    private int tipo;
    
    
    public Auto(String marca, int tipo){   //Constructor Auto
        this.marca=marca;
        this.tipo=tipo;
    }
    
    
    public int get_tipo(){
        return this.tipo;
    }
    
    
//    public static String Info_auto(Auto Auto1){
//    
//        
//        
//        //salida= (empleado.comision+empleado.salario)*0.92;  Reto 1
//        
//        
//        return "El auto es de marca " + Auto1.marca + " y es tipo " + Auto1.tipo ;
//    
//    }
    
}
