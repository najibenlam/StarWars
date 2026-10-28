public abstract class GameCharacter {
    protected String name;
    int age;

    void action(){System.out.println("Character is doing something");}

    void showInfo(){System.out.println(name + age);}

    final void goLive(){System.out.println("Character is now live!");}
}
