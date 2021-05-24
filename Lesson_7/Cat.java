package Lesson_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public boolean isSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate p) {
        if (this.satiety) return;
        p.info();
        satiety = p.decreaseFood(appetite);
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Кот по имени " + name +
                (satiety ? " съел из тарелки " + appetite + "  и теперь сыт"
                        : " голоден и его аппетит равен  " + appetite);
    }
}
