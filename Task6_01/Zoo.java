
package Task6_01;

import java.util.ArrayList;

public class Zoo {
    private final ArrayList<Animal> animalList=new ArrayList<>();

    public void addAnimal(int index, String name, int age){
        Animal newAnimal=new Animal(name, age);
        this.animalList.add(index, newAnimal);
    }
    public void showZoo(){
        System.out.println("Zoo consists of: ");
        System.out.println(animalList);
    }

    public static void main(String[] args) {
        Zoo myZoo=new Zoo();
        myZoo.addAnimal(0, "tiger", 7);
        myZoo.addAnimal(1, "elephant", 10);
        myZoo.addAnimal(2, "monkey", 5);
        myZoo.addAnimal(3, "koala", 5);
        myZoo.addAnimal(4, "kangaroo", 2);
        myZoo.addAnimal(5, "wild cat", 4);
        myZoo.addAnimal(6, "puma", 4);
        myZoo.addAnimal(7, "bear", 6);


        myZoo.showZoo();
    }
}
