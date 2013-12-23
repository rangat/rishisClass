import java.util.GregorianCalendar;

/**
 * Created by rangat on 12/20/13.
 */
public class Person {
    private String name;
    GregorianCalendar birthDay;

    Person() {
        this.name = "default";
        this.birthDay = new GregorianCalendar();
    }

    Person(String name, int birthYear, int birthMonth, int birthDay) {
        this.name = name;
        this.birthDay = new GregorianCalendar(birthYear, birthMonth, birthDay);
    }

    public String getName() {
        return this.name;
    }
}