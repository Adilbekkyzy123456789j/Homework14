

public class Main {
    public static void main(String[] args) {


        Person person=new Person("Зари","Красивая");
        Programmer programmer=new Programmer("Адам","Умный ","Peaksoft");
        Dancer dancer=new Dancer("Мила","Шустрая","Бийчилер группасы");
        Singer singer=new Singer("Nео","Талантливые","Алсу");

        System.out.println(person);
        System.out.println(programmer);
        System.out.println(dancer);
        System.out.println(singer);

        System.out.println("Person:");
        person.walk();
        person.learn();
        person.eat();

        System.out.println("Programmer:");
        programmer.eat();
        programmer.learn();
        programmer.walk();
        programmer.coding();

        System.out.println("Dancer:");
        dancer.eat();
        dancer.learn();
        dancer.walk();
        dancer.dancing();

        System.out.println("Singer:");
        singer.eat();
        singer.learn();
        singer.walk();
        singer.singing();
        singer.playGitar();
    }
}