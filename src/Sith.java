public class Sith extends GameCharacter{
    @Override
    void action(){System.out.println(name + " swings warblade!");}

    public Sith(String name, int age){
        super(name, age);
    }

}
