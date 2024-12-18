class CharacterFactory {
    public static Character createCharacter(String type) {
        switch (type) {
            case "Warrior": return new Warrior();
            case "Mage": return new Mage();
            case "Archer": return new Archer();
            default: throw new IllegalArgumentException("Unknown character type");
        }
    }
}