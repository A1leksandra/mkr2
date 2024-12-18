interface Character {
    void attack();
    void move(int x, int y);
}

class Warrior implements Character {
    public void attack() {
        System.out.println("Warrior attacks with sword!");
    }
    public void move(int x, int y) {
        System.out.println("Warrior moves to (" + x + "," + y + ")");
    }
}

class Mage implements Character {
    public void attack() {
        System.out.println("Mage casts a fireball!");
    }
    public void move(int x, int y) {
        System.out.println("Mage moves to (" + x + "," + y + ")");
    }
}

class Archer implements Character {
    public void attack() {
        System.out.println("Archer shoots an arrow!");
    }
    public void move(int x, int y) {
        System.out.println("Archer moves to (" + x + "," + y + ")");
    }
}