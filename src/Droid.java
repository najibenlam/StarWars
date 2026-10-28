public class Droid extends GameCharacter{
    @Override
    void action(){System.out.println("Droid shoots blaster rifle!");}

    public Droid(String name, int age){
        super(name, age);
    }
}
