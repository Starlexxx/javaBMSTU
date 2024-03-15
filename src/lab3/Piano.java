package lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Piano {

    private final List<Key> keys;

    public Piano() {
        this.keys = new ArrayList<>();
        for (int i = 0; i < 88; i++) {
            this.keys.add(new Key("Note" + i));
        }
    }

    public void tune() {
        System.out.println("The piano is being tuned.");
    }

    public void play() {
        System.out.println("Playing the piano.");
        for (Key key : keys) {
            key.press();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piano piano = (Piano) o;
        return keys.equals(piano.keys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keys);
    }

    @Override
    public String toString() {
        return "Piano{" +
                "keys=" + keys +
                '}';
    }
}
