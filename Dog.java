package Uppgift2.AnimalUppgift;

/**
 * Created by Elev1 on 2017-10-26.
 */
public class Dog implements Animal{
    private String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    @Override
    public void sound(){
        System.out.println("hao hao");
    }

    @Override
    public String name(){
        return "Kiko";
    }

    public void sound2(){
        System.out.println("hao hao");
    }

    public String toString(){
        return " toString "+name;}
    }
