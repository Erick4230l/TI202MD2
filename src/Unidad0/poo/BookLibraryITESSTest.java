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
public class BookLibraryITESSTest  {
    public static void main(String[] args) {
        //probar el constructor
        BookBibliotecaITESS aBook= new BookBibliotecaITESS("Java","Deithel", 4);
        System.out.println(aBook.toString());
        
        
        //probar getters
        System.out.println("getTitle(): " + aBook.getTitle());
        System.out.println("getAuthor(): " + aBook.getAuthor());
        System.out.println("getQuantity(): " + aBook.getQuantity());
        
        //probar isAvailable
        System.out.println("isAvailable " + aBook.getisAvailable());
        
        //test returnBack()
        System.out.println("ReturningBack");
        // Probar isAvailable
        
        // Probar prestar 
        aBook.lend();
        System.out.println("Cantidad: " + aBook.getQuantity());
        
        // Probar devolber
        aBook.returnBack();
        System.out.println("Cantidad: " + aBook.getQuantity());
        
        // Test BookInterface
        BookInterface iBook = aBook;
        System.out.println(iBook.isAvailable());
      
        
        //test Interface
        


    }
    
}
