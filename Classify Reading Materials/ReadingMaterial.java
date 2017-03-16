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
public class ReadingMaterial {

    String type;

    int pages, characters, numPictures;

    public ReadingMaterial(String type, int pages, int characters, int numPictures) 
    {
        this.type = type;
        this.pages = pages;
        this.characters = characters;
        this.numPictures = numPictures;
    }

    public void print() 
    {
        System.out.println("Reading Material Data: ");
        System.out.println("");
        System.out.println("Type of reading material: " + type);
        System.out.println("Number of pages: " + pages);
        System.out.println("Number of primary characters: " + characters);
        System.out.println("Number of pictures: " + numPictures);
        System.out.println("");
    }
}
