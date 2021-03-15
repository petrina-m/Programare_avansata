/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.awt.Desktop;
import static java.awt.Desktop.getDesktop;
import java.util.ArrayList;
import java.util.List;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author 40757
 */
public class Catalog {

    List<Item> items = new ArrayList<>();

    public void add(String nume) {
        items.add(new Item(nume));
    }

    public void list() {
        items.stream().forEach(x -> System.out.println(x.getName()));
    }

    public void play(String numeItem) {
       /* File f = new File(Item.getPath);
         try {
             Desktop.getDesktop().open(f);
         } catch (IOException e) {
             e.printStackTrace();
         }
        */
        //Desktop.open();
    }

    public void save() {
        
    }

    /**
     *
     * @param filename
     * @throws java.io.FileNotFoundException
     */
    public void load(String filename) throws FileNotFoundException, IOException {
        String continut = null;
        FileReader f = null;
        try {
            f = new FileReader(filename);
            int c;
            while ((c = f.read()) != -1) {
                continut = continut + c;
            }

        } catch (FileNotFoundException e) {
            System.err.println("The file " + filename + "is missing!");
        } catch (IOException e) {
            System.out.println("Unexpected error reading the file!");
        } finally {
            if (f != null) { // Close the file
                try {
                    f.close();
                } catch (IOException e) {
                    System.err.println("Error closing the file!");
                }
            }
        }
    }
}
