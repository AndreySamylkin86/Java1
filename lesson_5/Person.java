package lesson_5;

public class Person {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Person(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    private void info() {
        System.out.println("Информация о сотруднике");
        System.out.println("Имя: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com",
                "892312312", 30000, 30);
        persArray[1] = new Person("Petrov Ivan", "Engineer", "petrov@mailbox.com",
                "892312342", 45000, 28);
        persArray[2] = new Person("Sidorov Ivan", "Engineer", "sidorov@mailbox.com",
                "892312412", 20000, 50);
        persArray[3] = new Person("Dolgov Ivan", "Engineer", "dolgov@mailbox.com",
                "892312442", 25000, 35);
        persArray[4] = new Person("Popov Ivan", "Engineer", "popov@mailbox.com",
                "892312342", 11000, 45);

        System.out.println("Сотрудники старше 40 лет: ");
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40)
                persArray[i].info();
        }
    }
}
