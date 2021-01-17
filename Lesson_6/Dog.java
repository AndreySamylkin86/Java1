package Lesson_6;

public class Dog extends Animal {
    private String name;
    private final int maxRun;
    private final int maxSwim;
    private static int countDog = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCountDog() {
        return countDog;
    }

    public Dog(String name) {
        this.name = name;
        this.maxRun = 200;
        this.maxSwim = 10;
        countDog++;
    }

    @Override
    public void run(int obstacleLength) {
        if (obstacleLength < 0)
            System.out.println("Длина препятствия отрицательная: " + obstacleLength
                    + "м. Укажите корректное значение длины.");
        else {
            System.out.println("Нужно пробежать " + obstacleLength + " м.");
            if (obstacleLength <= maxRun)
                System.out.println(name + " пробежал/а " + obstacleLength + " м.");
            else System.out.println(name + " пробежал " + maxRun + " м. и сошёл/ла с дистанции");
        }
    }

    @Override
    public void swim(int obstacleLength) {
        if (obstacleLength < 0)
            System.out.println("Длина препятствия отрицательная: " + obstacleLength
                    + "м. Укажите корректное значение длины.");
        else {
            System.out.println("Нужно проплыть " + obstacleLength + " м.");
            if (obstacleLength <= maxSwim)
                System.out.println(name + " проплыл/а " + obstacleLength + " м.");
            else System.out.println(name + " проплыл/а " + maxSwim + " м. и сошёл/ла с дистанции");
        }
    }
}
