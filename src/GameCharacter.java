public abstract class GameCharacter {
    protected String name;
    protected int age;

    public GameCharacter(String name, int age){
        this.name = name;
        this.age = age;
    }

    abstract void action();

    void showInfo(){System.out.println("Name: " + name + ", Age: " + age);}

    final void goLive(){System.out.println("Character is now live!");}
}
