package com.company;

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        AnimalRegister animals = new AnimalRegister();
        Scanner scanner = new Scanner(System.in);

        showPrincipalMenu();

        String id;
        String name;
        String breed;
        int age;
        String option;

        while (scanner.hasNext()){
            switch (scanner.nextLine()){
                case "1" :
                    System.out.flush();
                    System.out.println("Register animals\n");
                    System.out.println("Enter an id");
                    id = scanner.nextLine();

                    System.out.println("Enter a name");
                    name = scanner.nextLine();

                    System.out.println("Enter a breed");
                    breed = scanner.nextLine();

                    System.out.println("Enter an age");
                    age = scanner.nextInt();

                    System.out.println("Are you sure you want to register your animal\n" +
                            "  Y) Register a new animal\n" +
                            "  N) Cancel\n");

                    option = scanner.nextLine();
                    while(!option.equals("Y") && !option.equals("N")){
                        System.out.println("Invalid option");
                        option = scanner.nextLine();
                    }
                    if(option.equals("Y")){
                        DomesticAnimal dog = new DomesticAnimal(id, name, age, breed);
                        animals.addAnimal(dog);
                        System.out.println("Your animal has been successfully saved!");
                    }
                    else{
                        showPrincipalMenu();
                    }

                    System.out.println(animals);

                    showPrincipalMenu();
                    break;
                case "2" :
                    System.out.flush();
                    System.out.println("Update animals\n");
                    System.out.println("Enter an id");
                    id = scanner.nextLine();

                    Animal currentAnimal = animals.getAnimalById(id);
                    System.out.println();

                    System.out.println("Enter a name");
                    name = scanner.nextLine();

                    System.out.println("Enter a breed");
                    breed = scanner.nextLine();

                    System.out.println("Enter an age");
                    age = scanner.nextInt();

                    System.out.println("Are you sure you want to register your animal\n" +
                            "  Y) Register a new animal\n" +
                            "  N) Cancel\n");

                    option = scanner.nextLine();
                    while(!option.equals("Y") && !option.equals("N")){
                        System.out.println("Invalid option");
                        option = scanner.nextLine();
                    }
                    if(option.equals("Y")){
                        DomesticAnimal dog = new DomesticAnimal(id, name, age, breed);
                        animals.addAnimal(dog);
                        System.out.println("Your animal has been successfully saved!");
                    }
                    else{
                        showPrincipalMenu();
                    }

                    System.out.println(animals);

                    showPrincipalMenu();
                    break;
                case "3" :
                    System.out.println("Eliminar animales");
                    break;
                case "4" :
                    System.out.println("Mostrar animales");
                    break;
                case "0" :
                    System.out.println("Salir del programa");
                    break;
                default:
                    System.out.println("error" );
                    break;
            }
        }
    }

    private static void showPrincipalMenu(){
        System.out.println("-- Actions --");
        System.out.println(
                "Select an option: \n" +
                        "  1) Register a new animal\n" +
                        "  2) Update you animal data\n" +
                        "  3) Delete your animal data \n" +
                        "  3) Show your animal data \n" +
                        "  0) Exit\n "
        );
    }
}