public class Programmer extends Person {
    private  String companyName;


    public Programmer() {
    }

    public Programmer(String name, String designation, String companyName){
        super(name,designation);
        this.companyName=companyName;
    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void learn() {
        System.out.println("Читает книгу");
    }

    public void walk() {
        System.out.println("Гуляет по городу");
    }
    public void eat(){
        System.out.println("Ужинает вместе с семьей");

    }
    public void coding(){
        System.out.println("Программист пишет код");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
}
