//package empleado;  //quitarlo para subirlo al codegrade de brigth space

import java.util.*;

public class Empleado {
    
    private int id;
    private String nombre;
    private String apellido;
    //private  int comision;  Reto 1
    //private  int horasExtra; Reto 1 
    private ArrayList<Auto> autos = new ArrayList<>();
    private  int salario;
    
    
    
    public Empleado(String nombre, String apellido, int salario){  //Set empleado
    
        this.nombre=nombre;
        this.apellido=apellido;
        //this.comision=comision;  Reto 1 
        //this.horasExtra=horasExtra;  Reto 1
        this.salario=salario;
                
    }
    
    public void setAutos(ArrayList<Auto> autos){
        this.autos=autos;
        
    }
    
    public ArrayList<Auto> getAutos(){
//        ArrayList<Auto> autos_temporal = new ArrayList<>();
//        autos_temporal=autos;
        return autos;
    }
    
    public static double calcularMiNomina(Empleado empleado){   //Get nomina del empleado
    
        double salida=0;
        double i=0;
        double j=0;
        double k=0;
        
        ArrayList<Auto> autos_temporal2 = new ArrayList<>();
        autos_temporal2=empleado.getAutos();
        //salida= (empleado.comision+empleado.salario)*0.92;  Reto 1
        
        //int size=autos_temporal.size();
        
        for (int x=0; x<autos_temporal2.size();x++){
            
            if (autos_temporal2.get(x).get_tipo()==1){
                i=i+1;
            }
                                
            if (autos_temporal2.get(x).get_tipo()==2){
                j=j+1;
            }
                                
            if (autos_temporal2.get(x).get_tipo()==3){
                k=k+1;
            }
        }
        
        if (i>0 && j>0 && k>0){
            salida= (750000+500000+350000+empleado.salario)*0.92; 
        }
        
        if (i==0 && j==0 && k==0){
            salida= (empleado.salario)*0.92; 
        }
        
        if (i>0 && j==0 && k==0){
            salida= (750000+empleado.salario)*0.92; 
        }
        
        if (i==0 && j>0 && k==0){
            salida= (500000+empleado.salario)*0.92; 
        }
        
        if (i==0 && j==0 && k>0){
            salida= (350000+empleado.salario)*0.92; 
        }
        
        if (i>0 && j>0 && k==0){
            salida= (750000+500000+empleado.salario)*0.92; 
        }
        
        if (i>0 && j==0 && k>0){
            salida= (750000+350000+empleado.salario)*0.92; 
        }
        
        if (i==0 && j>0 && k>0){
            salida= (500000+350000+empleado.salario)*0.92; 
        }
        
        //salida= (empleado.salario)*0.92;  
        
        return salida;
    }
    
//    public void set_array(ArrayList<Auto> autosVendidos){ //Setter de los climatizadores del coche
//        this.autosVendidos=autosVendidos;
//       
//    }
    
    
    
    

    
}
