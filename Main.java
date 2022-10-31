package FightGame;

class Main {
    public static void main(String[] args) {
        System.out.println("Fight Game");

        //Código para mostrar los 5 tipos de patos con el metodo showDuck

        Character King, Queen, Knight, Troll;

        King = new King();
        Queen = new Queen();
        Knight = new Knight();
        Troll = new Troll();

        //
        King.showCharacter();
        Queen.showCharacter();
        Knight.showCharacter();
        Troll.showCharacter();

        }
}
