/*
*ITESS-TICS 2025 Estructura y Organización de Datos
*Periodo: Agosto Diciembre 2025
*Docente: Francisco Javier Montecillo Puente
*Descripción: probelma higthtest temperature
*Programador: EDRC
*Email: erickdaniel4230l@gmail.com
*Fecha: 22/octubre/2025
*Compile and run
*una clase abstracta no crea objetos
 */
package TestStack;

import java.util.ArrayList;
import java.util.Stack;

public class HighestTemperatures {

    public static void main(String[] args) {
        //crear temperaturas
        //crear stack de t.altas
        //crear resultados
        //para n-1 agregar al stack
        //recorrer el arrgeglo del final al inicio
        //comparar temp[i] vs Stack si es mayor se agrega 
        //restar indices
        // else se eliminar hasta hayar un valor mayor con un while
        ArrayList<Integer> temperaturas = new ArrayList<>();

        // crear temperaturas
        temperaturas.add(23);
        temperaturas.add(24);
        temperaturas.add(25);
        temperaturas.add(26);
        temperaturas.add(27);
        temperaturas.add(30);
        temperaturas.add(37);
        //Crear Stack de Temperaturas Altas
        Stack<String> tempAltas = new Stack<>();
       
        /**
         * tempAltas.push(temp.size()-1); for(int i=temp.size()-2; i>0 ; i--){
         */
        ArrayList<Integer> Resultado = new ArrayList<>();
        
       for (int i = 0; i < temperaturas.size(); i++) {
        Resultado.add(0);
    }
       String indxv = temperaturas.size()-1+","+temperaturas.get(temperaturas.size()-1);
       tempAltas.push(indxv);
       
       for (int i= temperaturas.size()-2;i>=0;i--){
           int index=Integer.parseInt(tempAltas.peek().split(",")[0]);
           int valor=Integer.parseInt(tempAltas.peek().split(",")[1]);
           if (valor>temperaturas.get(i)){
               Resultado.set(i,index-1);
               tempAltas.push(i+"," + temperaturas.get(i));
           }else {
               do {
                   tempAltas.pop();
               }while (temperaturas.get(i) > Integer.parseInt(tempAltas.peek().split(",")[i])&& !tempAltas.isEmpty());
               Resultado.set(i,Integer.parseInt(tempAltas.peek().split(",")[0])-i);
               tempAltas.push(i + (",")+ temperaturas.get(i));
           }
           
       }
        System.out.println(tempAltas.toString());
        
               }
           }
      /** for (int  = temperaturas.size() - 2; i > 0; i--) {
            if (temperaturas.get(i) < tempAltas.peek()) {
                Resultado = set(i, tempAltas.peek());
                tempAltas.push(i);
            }
           */ 
    
      /**  for (int i = temp.size() - 2; i > 0; i--) {
            if (temp.get(i) < tempAltas.peek()) {
                dias = set(i, tempAltas.peek());
                tempAltas.push(i);
            }
            {else
                {
                    while(temp)
                        
                    
                    }
            }
        }
*/
    

    

    


