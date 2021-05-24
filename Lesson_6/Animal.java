package Lesson_6;

public abstract class Animal {

    private static int countAnimal = 0;

    public static int getCountAnimal() {
        return countAnimal;
    }

    public Animal() {
        countAnimal++;
    }

    public abstract void run(int obstacleLength);

    public abstract void swim(int obstacleLength);


}
