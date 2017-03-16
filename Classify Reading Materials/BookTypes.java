/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booktypes;

/**
 *
 * @author Alexis
 */
public class BookTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book book = new Book(null, 0, 0, 0);
        Magazine mag = new Magazine(null, 0, 0, 0);
        Journal journal = new Journal(null, 0, 0, 0);
        Textbook txt = new Textbook(null, 0, 0, 0);
        Manual manual = new Manual(null, 0, 0, 0);

        book.print();
        mag.print();
        journal.print();
        txt.print();
        manual.print();
    }
    
}
