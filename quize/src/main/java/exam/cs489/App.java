package exam.cs489;

import java.util.Comparator;
import java.util.List;

import exam.cs489.model.Contact;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        var contacts = List.of(
                new Contact("David", "Sanger", "Argos LLC", "Sales Manger",
                        List.of(new String[] { "240-133-0011", "Home" }, new String[] { "240-133-0011", "Home" }),
                        List.of(new String[] { "dave.sang@gmail.com", "Home" })),
                new Contact("Cartos", "Jimenez", "Zappos", "Director", null, null),
                new Contact("Ali", "Gafar", "BMI Services", "HR Manger",
                        List.of(new String[] { "412-116-9988", "Work" }),
                        List.of(new String[] { "ali@bmi.com", "Work" })));
        var sortedArray = contacts.stream()
                .sorted(Comparator.comparing(Contact::getLname).reversed());

        for (Contact contact : sortedArray) {
            System.out.println(contact.toJSONString());
        }
    }

}