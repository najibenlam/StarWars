    public class Jedi extends GameCharacter{
        @Override
        void action(){System.out.println("Jedi swings lightsaber!");}

        public Jedi(String name, int age){
            super(name, age);
        }

        void meditate(){System.out.println("Jedi is meditating");}



    }
