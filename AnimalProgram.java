package Uppgift2.AnimalUppgift;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Elev1 on 2017-10-27.
 */
public class AnimalProgram {
    public static void main(String[] args) {

        Animal[] myAnimal = {new Dog(), new Cat()};

        for (Animal myAnimals : myAnimal) {
            myAnimals.sound();
            System.out.println(myAnimals.name());
            if(myAnimals instanceof Dog){
                ((Dog) myAnimals).sound2();
            }
        }

        Puppy p=new Puppy("Sivo");
        System.out.println(p);
    }
}
