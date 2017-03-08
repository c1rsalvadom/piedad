/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class CambiarLongitud {
    
    public void bo (intl [v]){
        int p=1,i;
    }
    
    //metodo que borra el elemento de la posicion p desplazando a la izquierda todos los elementos
    public void bo (int []v){
       int p=1,i;	  
      //mostramos su contenido 
        //Mostramos los elementos del array  
       System.out.print("v={");
         for (i=0;i<v.length;i++){
             System.out.print(v[i]+",");
             }    
         System.out.println("}");
         //Borramos el elemento
       	 if(p<v.length){ 
            BorraElemento(v, p, i);                                       
          }
   //Mostramos los elementos del array  
       System.out.print("v={");
         for (i=0;i<v.length;i++){
             System.out.print(v[i]+",");
             }    
         System.out.println("}");         
      
    }
    
    //metodo que inserta un  elemento en la posicion p desplazando a la derecha todos los elementos
public void in (int []v){
       int p=1, i;	  
      //mostramos su contenido 
        //Mostramos los elementos del array  
       System.out.print("v={");
         for (i=0;i<v.length;i++){
             System.out.print(v[i]+",");
             }    
         System.out.println("}");
         //Borramos el elemento
       	 if(p<v.length){ 
            InsertaElemento(i, v, p);
          }
   //Mostramos los elementos del array  
       System.out.print("v={");
         for (i=0;i<v.length;i++){
             System.out.print(v[i]+",");
             }    
         System.out.println("}");         
      }
    
    void BorraElemento(int[] v, int p, int i) {
        System.out.println("Elemento a borrar="+v[p]);
        for(i=p;i<v.length-1;i++)
              v[i]=v[i+1];
    }
    void InsertaElemento(int i, int[] v, int p) {
        System.out.println("Elemento a insertar=" + this.va);
       for (i = v.length - 1; i > p; i--) {
           v[i] = v[i - 1];
       }
       v[p] = this.va;
    }
