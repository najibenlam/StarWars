public class Droid extends GameCharacter{
    @Override
    void action(){System.out.println(name + " shoots blaster rifle!");}

    public Droid(String name, int age){
        super(name, age);
    }
}
