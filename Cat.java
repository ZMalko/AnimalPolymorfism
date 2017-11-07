package Uppgift2.AnimalUppgift;

/**
 * Created by Elev1 on 2017-10-27.
 */
public class Cat implements Animal{
    @Override
    public void sound(){
        System.out.println("Mio Mio");
    }
    @Override
    public String name(){
        return "NoNo";
    }
}
