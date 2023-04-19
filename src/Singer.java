public class Singer extends Person{
  private String bandName;

  public Singer(String bandName,String designation,String name) {
    super(name, designation);
    this.bandName = bandName;
  }

  public Singer() {

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

  public void singing(){
    System.out.println("Поет");
  }
  public void playGitar(){
    System.out.println("Играет на гитаре");
  }


  @Override
  public String toString() {
    return "Singer{" +
            "bandName='" + bandName + '\'' +
            '}';
  }
}