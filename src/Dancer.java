public class Dancer extends Person {
    private String groupName;



    public Dancer(String name, String designation, String groupName) {
        super(name,designation);
        this.groupName = groupName;
    }

    public Dancer() {


    }

    public void learn() {
        System.out.println("Читает книгу ");
    }

    public void walk() {
        System.out.println("Гуляет по природе ");
    }

    public void eat() {
        System.out.println("Обедает вместе  с друзьями");

    }
    public void dancing(){
        System.out.println("Танцует");
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "groupName='" + groupName + '\'' +
                '}';
    }
}
