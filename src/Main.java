import java.util.ArrayList;
void main() {
    ArrayList<GameCharacter> characters = new ArrayList<>();
    characters.add(new Jedi());
    characters.add(new Sith());
    characters.add(new Droid());

for(GameCharacter character : characters) {
    character.action();


    if (character instanceof Jedi) {
        ((Jedi) character).meditate();
    }
}


}
