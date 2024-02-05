package org.github.mahambach;

import org.github.mahambach.Records.Animal;
import org.github.mahambach.Records.Owner;
import org.github.mahambach.Records.Species;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Owner> ownerList = new ArrayList<>();
        ownerList.add( new Owner("John Doe", 30, "123 Main Street"));
        ownerList.add( new Owner("Jane Smith", 25, "456 Oak Avenue"));


        List<Species> speciesList = new ArrayList<>();
        speciesList.add(new Species("Lion", 3000));
        speciesList.add(new Species("Elephant", 15000));
        speciesList.add(new Species("Giraffe", 8000));
        speciesList.add(new Species("Zebra", 5000));
        speciesList.add(new Species("Penguin", 200));
        speciesList.add(new Species("Kangaroo", 3000));


        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal(1, "Leo", speciesList.get(0), 5, ownerList.getLast()));
        animalList.add(new Animal(2, "Dumbo", speciesList.get(1), 15, ownerList.getFirst()));
        animalList.add(new Animal(3, "Stretch", speciesList.get(2), 8, ownerList.getFirst()));
        animalList.add(new Animal(4, "Stripes", speciesList.get(3), 6, ownerList.getLast()));
        animalList.add(new Animal(5, "Waddle", speciesList.get(4), 3, ownerList.getFirst()));
        animalList.add(new Animal(6, "Jumparoo", speciesList.get(5), 7, ownerList.getLast()));
        animalList.add(new Animal(7, "Stripes Jr.", speciesList.get(3), 4, ownerList.getFirst()));
        animalList.add(new Animal(8, "Bamboo", speciesList.get(1), 9, ownerList.getFirst()));
        animalList.add(new Animal(9, "Flipper", speciesList.get(0), 12, ownerList.getFirst()));
        animalList.add(new Animal(10, "Eucalyptus", speciesList.get(5), 5, ownerList.getLast()));
        animalList.add(new Animal(1, "Leo", speciesList.get(0), 5, ownerList.getLast()));

        for(Animal animal : animalList){
            System.out.println(animal);
        }
        System.out.printf("Is %s the %s equal to %s the %s? %b \n",
                animalList.getFirst().name(),
                animalList.getFirst().species(),
                animalList.getLast().name(),
                animalList.getLast().species(),
                animalList.getFirst().equals(animalList.getLast()));

    }
}

/*
public static List<Animal> createZoo(){
    List<Animal> animalList = new ArrayList<>();
    return animalList;
}
*/