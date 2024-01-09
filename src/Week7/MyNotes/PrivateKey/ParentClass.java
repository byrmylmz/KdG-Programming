package Week7.MyNotes.PrivateKey;

import java.util.Objects;

public class ParentClass {
    private int privateField;

    public ParentClass(int value) {
        this.privateField = value;
    }

    public void printPrivateField() {
        System.out.println("Private Field in ParentClass: " + privateField);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParentClass that = (ParentClass) o;
        return privateField == that.privateField;
    }

    @Override
    public int hashCode() {
        return Objects.hash(privateField);
    }
}