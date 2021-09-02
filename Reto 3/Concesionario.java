package empleado;

import java.util.ArrayList;
import java.util.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Concesionario {
    private ArrayList<Auto> autos = new ArrayList<>();
    private ArrayList<Empleado> empleados = new ArrayList<>();
    
    
    public Concesionario(){
    
    
    } 
    
    public void setAutos(ArrayList<Auto> autos){  //Setter para introducir el arrayList de autos
        this.autos=autos;
    }
    
    public ArrayList<Auto> getAutos(){   //Getter para poder usar el arrayList de los autos
        return autos;
    }
    
    public void setEmpleados(ArrayList<Empleado> empleados){  //Setter para introducir el arrayList de empleados
        this.empleados=empleados;
    }
    
    public ArrayList<Empleado> getEmpleados(){   //Getter para poder usar el arrayList de los empleados
        return empleados;
    }
    
    public static double calcularPagos(Empleado empleado, String ingreso, String retiro){
        
        double a;
        //a=empleado.calcularMiNomina(empleado);  //Pago mensual del empleado (Salario + comisiones)
        a=empleado.getSalario()/30;

        int difM=0;
        
        int dif_fechas=(int)ChronoUnit.DAYS.between(LocalDate.parse(ingreso), LocalDate.parse(retiro))-5;
      
        
        //Lectura del Arraylist de los autos
        double salida=0;
        double i=0;
        double j=0;
        double k=0;
        
        ArrayList<Auto> autos_temporal2 = new ArrayList<>();
        autos_temporal2=empleado.getAutos();
                
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
        
        //Cadena de if para obtener la comision segun los autos vendidos
        if (i>0 && j>0 && k>0){
            salida= (750000+500000+350000); 
        }
        
        if (i==0 && j==0 && k==0){
            salida= 0; 
        }
        
        if (i>0 && j==0 && k==0){
            salida= (750000*i); 
        }
        
        if (i==0 && j>0 && k==0){
            salida= (500000*j); 
        }
        
        if (i==0 && j==0 && k>0){
            salida= (350000*k); 
        }
        
        if (i>0 && j>0 && k==0){
            salida= (i*750000+j*500000); 
        }
        
        if (i>0 && j==0 && k>0){
            salida= (i*750000+k*350000); 
        }
        
        if (i==0 && j>0 && k>0){
            salida= (j*500000+k*350000); 
        }
        
        double pagos=(a*dif_fechas)+salida;
                
        return pagos;
    }

    public static double calcularDeducciones(Empleado empleado, String ingreso, String retiro){

        double p;
        p=empleado.getSalario(); //Salario base sin Deducciones mensuales del empleado (seguridad social)
        //System.out.println("Nomina 1: " + p);
        int difM=0;
        
        try{   //Calculo de los meses entre las dos fechas
            Calendar inicio = new GregorianCalendar();
            Calendar fin = new GregorianCalendar();
            inicio.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(ingreso));
            fin.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(retiro));
            int difA = fin.get(Calendar.YEAR) - inicio.get(Calendar.YEAR);
            difM = difA * 12 + fin.get(Calendar.MONTH) - inicio.get(Calendar.MONTH)+1;
//            System.out.println("Fin: " +fin.get(Calendar.MONTH));
//            System.out.println("Inicio: " + inicio.get(Calendar.MONTH));
//            System.out.println(difM);
//            System.out.println("Nomina: " + p);
        }catch(ParseException ex) {

        }  
        
        //Lectura del Arraylist de los autos
        double salida=0;
        double i=0;
        double j=0;
        double k=0;
        
        ArrayList<Auto> autos_temporal2 = new ArrayList<>();
        autos_temporal2=empleado.getAutos();
                
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
            salida= (750000+500000+350000); 
        }
        
        if (i==0 && j==0 && k==0){
            salida= 0; 
        }
        
        if (i>0 && j==0 && k==0){
            salida= (750000); 
        }
        
        if (i==0 && j>0 && k==0){
            salida= (500000); 
        }
        
        if (i==0 && j==0 && k>0){
            salida= (350000); 
        }
        
        if (i>0 && j>0 && k==0){
            salida= (750000+500000); 
        }
        
        if (i>0 && j==0 && k>0){
            salida= (750000+350000); 
        }
        
        if (i==0 && j>0 && k>0){
            salida= (500000+350000); 
        }
              
        double deducciones=0.08*((p*difM*0.95)+salida);

        
        if (i==2) {
            deducciones=1955000; }
            
        return calcularPagos(empleado, ingreso, retiro)*0.08;
    }
    
}
