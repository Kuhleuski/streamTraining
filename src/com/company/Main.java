package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("Слон",25,13,Color.GRAY));
        animals.add(new Animal("Слон",25,3,Color.GRAY));
        animals.add(new Animal("Жираф",11,255,Color.ORANGE));
        animals.add(new Animal("Жираф",11,144,Color.ORANGE));
        animals.add(new Animal("Крокодил",32,4,Color.GREEN));
        animals.add(new Animal("Обезьяна",2,23,Color.BROWN));
        animals.add(new Animal("Обезьяна",2,11,Color.BROWN));
        animals.add(new Animal("Кролик",1,86,Color.WHITE));
        animals.add(new Animal("Кролик",1,9,Color.WHITE));
        animals.add(new Animal("Муравей",4,8,Color.BROWN));
        animals.add(new Animal("Попугай",7,5,Color.GREEN));


        List<Animal> brown = new ArrayList<>();

        for (Animal x : animals){
            if (x.getColor().equals(Color.BROWN)){
                brown.add(x);
            }
        }
        brown.forEach(System.out::println);
        System.out.println("\n");

        List<Animal> greens = animals.stream().
                filter(animal -> animal.getColor().equals(Color.GREEN)).
                collect(Collectors.toList());

        greens.forEach(System.out::println);


        //animals.forEach(System.out::println);

        System.out.println("\n");


        animals.forEach(System.out::println);
        System.out.println("\n");
        System.out.println("Ниже отСОРТированная коллекция: ");
        System.out.println("\n");
        List<Animal> sortedAge = animals.stream().
                        sorted(Comparator.comparing(Animal::getAge)).
                        collect(Collectors.toList());


        sortedAge.forEach(System.out::println);
        System.out.println("\n");
        System.out.println("Comparator two fields");
        System.out.println("\n");


       Comparator<Animal> compareAnimal = Comparator.
               comparing(Animal::getAge).
               thenComparing(Animal::getId);

       List<Animal> sortedAllAnimal = animals.stream().
               sorted(compareAnimal).
               collect(Collectors.toList());

       sortedAllAnimal.forEach(System.out::println);


                // Comparator<Employee> compareByName = Comparator
        //                                                .comparing(Employee::getFirstName)
        //                                                .thenComparing(Employee::getLastName);
        //
        //        List<Employee> sortedEmployees = employees.stream()
        //                                        .sorted(compareByName)
        //                                        .collect(Collectors.toList());
        //
        //        System.out.println(sortedEmployees);


    }
}
