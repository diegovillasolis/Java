import java.util.ArrayList;

class AnimalRegister {
    private ArrayList<Animal> animals;

    public AnimalRegister(){
        animals = new ArrayList<Animal>();
    }

    public boolean addAnimal(Animal p){
        boolean b = false;
        p.setId((animals.size())+"");
        if(animals.add(p)) {
            b = true;
        }
        return b;
    }

    public Animal getAnimalById(String id) {
        Animal p = null;
        boolean b = false;
        int i = 0;
        while(!b && i < animals.size()){
            if(animals.get(i).getId().equals(id)) {
                p = animals.get(i);
                b = true;
            }
            i++;
        }
        return p;
    }

    public boolean deleteAnimal(String id){
        return animals.remove(getAnimalById(id));
    }

    public boolean updateAnimal(String currentAnimalId, Animal updated){
        boolean b = false;
        Animal current = getAnimalById(currentAnimalId);
        if(current != null){
            current.setName(updated.getName());
            current.setAge(updated.getAge());
            current.setBreed(updated.getBreed());
            b = true;
        }
        return b;
    }

    public String toString(){
        return animals.toString();
    }
}