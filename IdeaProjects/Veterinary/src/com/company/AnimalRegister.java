package com.company;

import java.util.ArrayList;

class AnimalRegister {
    private ArrayList<Animal> animals = new ArrayList<Animal>();

    public void addAnimal(Animal p){
        animals.add(p);
    }

    public Animal getAnimalById(String id) {
        Animal p = null;
        boolean b = false;
        int i = 0;
        while(!b || i < animals.size()){
            if(animals.get(i).getId() == id) {
                p = animals.get(i);
                b = true;
            }
            i++;
        }
        return p;
    }

    public void deleteAnimal(Animal p){
        animals.remove(p);
    }

    public void updateAnimal(String currentAnimalId, Animal updated){
        Animal current = getAnimalById(currentAnimalId);
        current.setName(updated.getName());
        current.setAge(updated.getAge());
        current.setBreed(updated.getBreed());
    }

    public String toString(){
        return animals.toString();
    }
}