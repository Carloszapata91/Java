package empleado;
import java.util.*;

public class Uso_empleado {
    
        public static void main(String [] args) {
        
        // Empleado Diego_Moreno=new Empleado("Diego", "Moreno", 500000, 0, 1875000);  Reto 1
        
        // double nom =Diego_Moreno.calcularMiNomina(Diego_Moreno); Reto 1
        
            
        // System.out.println(Diego_Moreno.calcularMiNomina(Diego_Moreno)); Reto 1
        
        Auto Auto1=new Auto("Renault",2);
        Auto Auto2=new Auto("Mazda",1);
        
        ArrayList<Auto> autos_Vend = new ArrayList<>();
        
        autos_Vend.add(Auto1);
        autos_Vend.add(Auto2);
        
        
        // System.out.println(Auto.Info_auto(Auto1));
                
        Empleado Diego_Moreno=new Empleado("Diego", "Moreno",1875000);  //Reto 1
        
        double nom =Diego_Moreno.calcularMiNomina(Diego_Moreno); //Reto 1
        
        Diego_Moreno.setAutos(autos_Vend);
        
        System.out.println(Diego_Moreno.calcularMiNomina(Diego_Moreno)); //Reto 1
        
        
        
        
        
        }

    
}
