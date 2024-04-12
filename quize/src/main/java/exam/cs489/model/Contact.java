package exam.cs489.model;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String fname;
    private String lname;
    private String company;
    private String title;
    private List<Phone> phone = new ArrayList<>();
    private List<Email> email = new ArrayList<>();

    public Contact(String fname, String lname, String company, String title, String[][] phones,
            String[][] emails) {
        this.fname = fname;
        this.lname = lname;
        this.company = company;
        this.title = title;

        if (phones != null) {
            for (String list[] : phones) {
                if (list.length > 0) {phone.add(new Phone(list[0], list[1]));}
            }
        }
        if (emails != null) {
            for (String list[] : emails) {
                if (list.length > 0) {email.add(new Email(list[0], list[1]));}
            }
        }
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toJSONString() {
        String phoneValue = "";
        if (phone.size() > 0) {
            for (Phone phone : phone) {
                phoneValue = (phoneValue.isEmpty())
                        ? phoneValue.concat(phone.getNumber()).concat("|").concat(phone.getLabel())
                        : phoneValue.concat(", ").concat(phone.getNumber()).concat("|").concat(phone.getLabel());
            }
        }

        String emailValue = "";

        if (email.size() > 0) {
            for (Email email : email) {
                emailValue = (emailValue.isEmpty())
                        ? emailValue.concat(email.getAddress()).concat("|").concat(email.getLabel())
                        : phoneValue.concat(", ").concat(email.getAddress()).concat("|").concat(email.getLabel());
            }
        }

        return String.format(
                "\t{ \"fname\": %s, \"lname\": %s, \"company\": %s, \"title\": %s, \"phone\": %s, \"email\": %s }",
                fname, lname, company, title, phoneValue, emailValue);
    }
}
