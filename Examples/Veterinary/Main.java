import java.util.Scanner;

class Main{
    public static void main(String[] args){
        AnimalRegister animals = new AnimalRegister();
        Scanner scanner = new Scanner(System.in);
        String id;
        String name;
        String breed;
        int age;
        String option;
        boolean b = true;

        showPrincipalMenu();

        while (b){
            switch (scanner.nextLine()){
                case "1" :
                    System.out.flush();
                    System.out.println("Register animals\n");

                    System.out.println("Enter a name");
                    name = scanner.nextLine();

                    System.out.println("Enter a breed");
                    breed = scanner.nextLine();

                    System.out.println("Enter an age");
                    age = scanner.nextInt();

                    confirmMessage();

                    option = scanner.nextLine();
                    while(!option.equals("Y") && !option.equals("N")){
                        option = scanner.nextLine();
                    }
                    if(option.equals("Y")){
                        Animal animal = new Animal(name, age, breed);                    
                        if(animals.addAnimal(animal)){
                            System.out.println("Your animal has been successfully saved!");
                            System.out.println(animal);
                        }
                        else{
                            System.out.println("You are trying to register an existent animal");
                        }
                        if(scanner.hasNextLine()){
                            showPrincipalMenu();
                        }
                    }
                    else{
                        showPrincipalMenu();
                    }
                    System.out.println(animals);
                    break;
                case "2" :
                    System.out.flush();
                    System.out.println("Update animals\n");
                    System.out.println("Enter an id to update your animal data");
                    id = scanner.nextLine();

                    System.out.println("Enter a new name");
                    name = scanner.nextLine();

                    System.out.println("Enter a new breed");
                    breed = scanner.nextLine();

                    System.out.println("Enter an new age");
                    age = scanner.nextInt();

                    confirmMessage();

                    option = scanner.nextLine();
                    while(!option.equals("Y") && !option.equals("N")){
                        option = scanner.nextLine();
                    }
                    if(option.equals("Y")){
                        if(animals.updateAnimal(id, new Animal(name, age, breed))){
                            System.out.println("Your animal has been successfully saved!");
                        }
                        else{
                            System.out.println("You are trying to updated a nonexistent animal");
                        }
                        if(scanner.hasNextLine()){
                            showPrincipalMenu();
                        }
                    }
                    else{
                        showPrincipalMenu();
                    }

                    System.out.println(animals);
                    break;
                case "3" :
                    System.out.flush();
                    System.out.println("Delete animal\n");
                    System.out.println("Enter an id to delete your animal data");
                    id = scanner.nextLine();

                    confirmMessage();

                    option = scanner.nextLine();
                    while(!option.equals("Y") && !option.equals("N")){
                        System.out.println("Invalid option");
                        option = scanner.nextLine();
                    }
                    if(option.equals("Y")){
                        if(animals.deleteAnimal(id)){
                            System.out.println("Your animal has been successfully deleted!");
                        }
                        else{
                            System.out.println("You are trying to delete a nonexistent animal");
                        }
                        if(scanner.hasNextLine()){
                            showPrincipalMenu();
                        }
                    }
                    else{
                        showPrincipalMenu();
                    }

                    System.out.println(animals);
                    break;
                case "4" :
                    System.out.flush();
                    System.out.println("Show animal \n");
                    System.out.println("Enter an id to show your animal data");
                    id = scanner.nextLine();
                    Animal a = animals.getAnimalById(id);
                    if(a == null){
                        System.out.println("Your animal has not been found");
                    }
                    else{
                        System.out.println(animals.getAnimalById(id));
                    }
                    if(scanner.hasNextLine()){
                        showPrincipalMenu();
                    }
                    break;
                case "0" :
                    System.out.println("Exit \n");
                    b = false;
                    break;
            }
        }
    }

    private static void registerAnimal(){

    }

    private static void updatedAnimal(){

    }

    private static void deleteAnimal(){

    }

    private static void showAnimal(){

    }

    private static void showPrincipalMenu(){
        System.out.println("-- Actions --");
        System.out.println(
                "Select an option: \n\n" +
                        "  1) Register a new animal\n" +
                        "  2) Update you animal data\n" +
                        "  3) Delete your animal data \n" +
                        "  4) Show your animal data \n" +
                        "  0) Exit\n "
        );
    }

    private static void confirmMessage(){
        System.out.println("Are you sure you want to continue \n" +
                "  Y) Accept\n" +
                "  N) Cancel\n");
    }
}