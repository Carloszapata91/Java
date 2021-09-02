package empleado;  //quitarlo para subirlo al codegrade de brigth space

import java.util.*;

public class Empleado {
    
    
    //Atributos de clase
    
    private int id;
    private String nombre;
    private String apellido;
    //private  int comision;  Reto 1
    //private  int horasExtra; Reto 1 
    private ArrayList<Auto> autos = new ArrayList<>();
    private  int salario;
    
    
    
    public Empleado(String nombre, String apellido, int salario){  //Constructor empleado
    
        this.nombre=nombre;
        this.apellido=apellido;
        //this.comision=comision;  Reto 1 
        //this.horasExtra=horasExtra;  Reto 1
        this.salario=salario;
    }
    
    public int getSalario(){
        return salario;
    }
    
    public void setAutos(ArrayList<Auto> autos){  //Setter para introducir el arrayList de autos
        this.autos=autos;
        
    }
    
    public ArrayList<Auto> getAutos(){   //Getter para poder usar el arrayList de los autos
//        ArrayList<Auto> autos_temporal = new ArrayList<>();
//        autos_temporal=autos;
        return autos;
    }
    
    public static double calcularMiNomina(Empleado empleado){   //nomina del empleado
    
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
        
        //Cadena de if para obtener la nomina total (Salario + comision)
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

    
    
    
    

    
}
