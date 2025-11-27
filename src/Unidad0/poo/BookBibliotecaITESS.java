/*
*ITESS-TICS 2025 Estructura y Organización de Datos
*Periodo: Agosto Diciembre 2025
*Docente: Francisco Javier Montecillo Puente
*Descripción: Creando una biblioteca
*Programador: EDRC
*Email: erickdaniel4230l@gmail.com
*Fecha: 23/septiembre/2025
*Compile and run
*javac Arreglos01_suma.java
*java Arreglos01_suma.java
*una clase abstracta no crea objetos
*/
package Unidad0.poo;

/**
 *
 * @author erick
 */
public class BookBibliotecaITESS implements BookInterface{
    
    private String Title;
    private String Author;
    private int quantity;

    public BookBibliotecaITESS(String Title, String Author, int quantity) {
        this.Title = Title;
        this.Author = Author;
        this.quantity = quantity;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int quantity){
        if (quantity >0)
        this.quantity += quantity;
    }
    @Override
    public boolean isAvailable() {
        if (quantity>0)
            return true;
        return false;
    }

    @Override
    public void lend() {
        if (isAvailable())
            quantity--;
        
    }

    @Override
    public void returnBack() {
        quantity ++;
    }

    @Override
    public String toString() {
        return "BookBibliotecaITESS{" + "Title=" + Title + ", Author=" + Author + ", quantity=" + quantity + '}';
    }

    String getisAvailable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  

  
    }

   
    
   


    


