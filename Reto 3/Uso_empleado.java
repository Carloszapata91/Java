package empleado;
import java.util.*;
import java.math.BigDecimal;

public class Uso_empleado {
    
        public static void main(String [] args) {
        
        // Empleado Diego_Moreno=new Empleado("Diego", "Moreno", 500000, 0, 1875000); // Reto 1
        
        // double nom =Diego_Moreno.calcularMiNomina(Diego_Moreno); Reto 1
                    
        // System.out.println(Empleado.calcularMiNomina(Diego_Moreno)); //Reto 1
        
        
        //Variables locales (validas solo en este metodo main)
        var Carro1="Citroen";
        var Carro1_tipo=1;
        
        
        Auto Auto1=new Auto("Renault",2);
        Auto Auto2=new Auto("Mazda",1);
        Auto Auto3=new Auto("Nissan",1);
        Auto Auto4=new Auto("Honda",3);
        Auto Auto5=new Auto(Carro1,Carro1_tipo);
        
        ArrayList<Auto> autos_Vend = new ArrayList<>();
        
        autos_Vend.add(Auto1);
        autos_Vend.add(Auto2);
        //autos_Vend.add(Auto3);
        
        
        // System.out.println(Auto.Info_auto(Auto1));
                
        Empleado Diego_Moreno=new Empleado("Diego", "Moreno",2000000);  //Reto 2
        
        //double nom =Diego_Moreno.calcularMiNomina(Diego_Moreno); //Reto 2
        
        Diego_Moreno.setAutos(autos_Vend);
        
        //System.out.println("La nomina de Diego Moreno es: " + Empleado.calcularMiNomina(Diego_Moreno)); //Reto 2
        
        
        //Nuevo objeto: Empleado Juan Lopez
        
        Empleado Juan_Lopez = new Empleado ("Juan", "Lopez", 1875000);
        
        ArrayList<Auto> autos_Vendidos_JL = new ArrayList<>();
        
        autos_Vendidos_JL.add(Auto1);
        autos_Vendidos_JL.add(Auto2);
        autos_Vendidos_JL.add(Auto3);
        autos_Vendidos_JL.add(Auto4);
        
        Juan_Lopez.setAutos(autos_Vendidos_JL);              //Asi invoco a un metodo estatico:  nombre_clase.nombre_metodo_statico(Objeto)
        //System.out.println("La nomina de Juan Lopez es: " + Empleado.calcularMiNomina(Juan_Lopez)); //Reto 2
        
        Empleado.calcularMiNomina(Juan_Lopez);
        
        
      ///Reto 3
        
        Concesionario c1=new Concesionario();
      
        //c1.calcularPagos(Diego_Moreno,"01/01/2020","30/12/2020");  //No sirve.. cambiaron el formato de la fecha
        
        System.out.println("El pago anual a Diego Moreno es: " + c1.calcularPagos(Diego_Moreno,"2020-01-01","2020-12-30"));
        
        System.out.println("Las deducciones anuales a Diego Moreno son: " + c1.calcularDeducciones(Diego_Moreno,"2020-01-01","2020-12-30"));
        
           
        }

    
}
