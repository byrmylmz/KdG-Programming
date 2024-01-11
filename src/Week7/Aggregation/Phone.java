package Week7.Aggregation;

import java.util.Objects;

public class Phone {
    private String number;

    public Phone(String number) {
        this.number = number;
    }

    public String toString(){
        return String.format("%s",number);
    }

}
