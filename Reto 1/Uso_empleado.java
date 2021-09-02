package empleado;
import java.util.*;

public class Uso_empleado {
    
        public static void main(String [] args) {
        
        Empleado Diego_Moreno=new Empleado("Diego", "Moreno", 500000, 0, 1875000);  
        
        double nom =Diego_Moreno.calcularMiNomina(Diego_Moreno); 
        
            
        System.out.println(Diego_Moreno.calcularMiNomina(Diego_Moreno));
  
                
        Empleado Diego_Moreno=new Empleado("Diego", "Moreno",1875000);  //Reto 1
        
        double nom =Diego_Moreno.calcularMiNomina(Diego_Moreno); //Reto 1
        
               
        System.out.println(Diego_Moreno.calcularMiNomina(Diego_Moreno)); //Reto 1
        
        
        
        
        
        }

    
}
