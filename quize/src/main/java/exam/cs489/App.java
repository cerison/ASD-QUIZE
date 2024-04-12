package exam.cs489;

import java.util.Comparator;
import java.util.List;

import exam.cs489.model.Contact;

public class App {
    public static void main(String[] args) {

        var contacts = List.of(

                new Contact("David", "Sanger",
                        "Argos LLC", "Sales Manger",
                        new String[][] { { "240-133-0011", "Home" }, { "240-133-0011", "Home" } },
                        new String[][] { { "dave.sang@gmail.com", "Home" } }),

                new Contact("Cartos", "Jimenez", "Zappos", "Director", null, null),

                new Contact("Ali", "Gafar", "BMI Services", "HR Manger", new String[][] { { "412-116-9988", "Work" } },
                        new String[][] { { "ali@bmi.com", "Work" } }));

        var sortedList = contacts.stream()
                .sorted(Comparator.comparing(Contact::getLname)).toList();

        System.out.println("[");
        int i = 0;
        for (Contact contact : sortedList) {
            String value = (i > 0) ? ",\n " + contact.toJSONString() : contact.toJSONString();
            System.out.print(value);
            i++;
        }
        System.out.println("\n]");

    }
}