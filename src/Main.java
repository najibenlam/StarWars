import java.sql.Driver;
import java.util.ArrayList;
void main() {
    ArrayList<GameCharacter> characters = new ArrayList<>();

    Jedi jediobj = new Jedi("Luke Skywalker", 23);
    Sith sithobj = new Sith("Darth Vader", 45);
    Droid droidobj = new Droid("R2-D2", 120);
    CloneTrooper cloneTrooperobj = new CloneTrooper("Captain Rex", 13);

    characters.add(jediobj);
    characters.add(sithobj);
    characters.add(droidobj);
    characters.add(cloneTrooperobj);



for(GameCharacter character : characters) {
    character.action();
    character.showInfo();


    if (character instanceof Jedi) {
        ((Jedi) character).meditate();
    }
}



}
