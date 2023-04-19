public class Person {
private String name;
private String designation;

    public Person() {
    }

    public Person(String name,String designation) {
        this.name = name;
        this.designation=designation;
    }


    public void learn() {
        System.out.println("Читает");
    }

    public void walk() {
        System.out.println("Гуляет");
    }
    public void eat(){
        System.out.println("Кушает");


    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
