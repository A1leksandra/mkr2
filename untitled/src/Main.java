public class Main {
    public static void main(String[] args) {
        Arena arena = new Arena();
        ArenaObserver observer = new ArenaObserver();
        arena.registerObserver(observer);

        Character warrior = CharacterFactory.createCharacter("Warrior");
        Character mage = CharacterFactory.createCharacter("Mage");
        Character archer = CharacterFactory.createCharacter("Archer");

        arena.addCharacter(warrior);
        arena.addCharacter(mage);
        arena.addCharacter(archer);

        warrior.attack();
        mage.attack();
        archer.move(5, 10);
    }
}