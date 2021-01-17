package Lesson_6;

public class Main {

    public static void main(String[] args) {
        Dog dogSharik = new Dog("Шарик");
        Cat catBella = new Cat("Белла");

        System.out.println("Количество животных " + Animal.getCountAnimal());
        System.out.println("Количество собак " + Dog.getCountDog());
        System.out.println("Количество котов и кошек " + Cat.getCountCat());

        dogSharik.run(-40);
        dogSharik.run(140);
        dogSharik.run(540);
        dogSharik.swim(4);
        dogSharik.swim(40);

        catBella.run(-50);
        catBella.run(350);
        catBella.run(550);

        catBella.swim(5);
    }
}
