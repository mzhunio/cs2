package com.zhunio.test1;

import java.util.Objects;
import java.util.Scanner;

//Animal class not shown here but you may use any of the method shown in the UML
//the default numOflegs for a pet is 4, the type is mammal and wild is false
public class Pet extends Animal {
    /*** Modify the  below two lines to implement data hiding ***/
    private String name;
    private static long ownerId = 123456;

    /*** Add attibute(s) to automatically give Pet objects ids. ***/


    public Pet() {
        this("asds");
    }

    /*** Fill in the following constructors.
     Only one constructor should have multiple lines. ***/
    public Pet(String name) {
        this(name, (long) 12345);
    }

    public Pet(String name, long ownerId) {
        this.name = name;
        this.ownerId = ownerId;
    }

    /*** Add a method that will allow us to change the Pet's name from outside the class ***/
    public String changeName(String name) {
        return name;
    }

    /***Add a method that will allow us to read the owner's id from outside the class ***/
    public void read() {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter the Owner Ids: ");
        kb.nextLine();

    }


    /*** Add a toString method below that will result in the following output:
     legs:
     type:
     name:
     ownerId:
     ***/

    public String toString() {
        return "Legs: " + getNumOfLegs() + "\n" +
                "type: " + getType() + '\'' +
                "name: " + name + "\n" +
                "ownerID: " + ownerId;
    }

    /*** Add an equals method header below that overrides the equals from Object class.***/
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;

        Pet pet = (Pet) o;
        return ownerId == pet.ownerId &&
                Objects.equals(name, pet.name);
    }

}
