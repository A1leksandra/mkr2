import java.util.ArrayList;
import java.util.List;

class Arena {
    private List<Character> characters = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
        notifyObservers();
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }
}