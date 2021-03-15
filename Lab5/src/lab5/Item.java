/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author 40757
 */
class Item {

    protected String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().equals("")) {
            throw new IllegalArgumentException(
                    "Name should not be empty.");
        }
        if (!name.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException(
                    "Name should only contain characters: " + name);
        }
        this.name = name;
    }


    @Override
    public String toString() {
        return "Item{" + "name=" + name + '}';
    }

}
