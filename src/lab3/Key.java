package lab3;

import java.util.Objects;

public class Key {
    private String note;

    public Key(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void press() {
        System.out.println("Playing note: " + note);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return note.equals(key.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(note);
    }

    @Override
    public String toString() {
        return "Key{" +
                "note='" + note + '\'' +
                '}';
    }
}
