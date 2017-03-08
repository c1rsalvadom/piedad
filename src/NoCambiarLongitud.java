/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Ruben
 */
public class NoCambiarLongitud {
    
    public void mo(int []v){
     	int i;  
        int p=1;
       //Mostramos los elementos del array  
       System.out.print("v={");
         for (i=0;i<v.length;i++){
             System.out.print(v[i]+",");
             }    
         System.out.println("}");
         //Modificamos el array
       	  if(p<v.length){ 
              ModificaElemento(v, p);
             }
       //Mostramos los elementos del array  
       System.out.print("v={");
       for (i=0;i<v.length;i++){
           System.out.print(v[i]+",");
       }    
         System.out.println("}");  
    }
    
        void ModificaElemento(int[] v, int p) {
        //mostramos su contenido           			
   System.out.println("Elemento a modificar="+v[p]);
       v[p]=this.va;
    }

}
