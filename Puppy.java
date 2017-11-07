package Uppgift2.AnimalUppgift;

/**
 * Created by Elev1 on 2017-11-07.
 */
public class Puppy extends Dog implements Animal {
    public Puppy(String name) {
        super(name);
    }

    public void sound() {
        System.out.println(getClass().getName() + "hoho");
    }
}
