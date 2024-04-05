package exam.cs489.model;

import java.util.List;

public class Contact {
    private String fname;
    private String lname;
    private String company;
    private String title;
    private List<Phone> phone = null;
    private List<Email> email = null;

    public Contact(String fname, String lname, String company, String title, List phones,
            List emails) {
        this.fname = fname;
        this.lname = lname;
        this.company = company;
        this.title = title;
        if (phones.size() > 0) {
            for (String list[] : phones) {
                phone.add(new Phone(list[0], list[1]));
            }
        }
        if (emails.size() > 0) {
            for (String list[] : emails) {
                email.add(new Email(list[0], list[1]));
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

        return String.format(
                "\t{ \"fname\": %s, \"lname\": %s, \"company\": %s, \"title\": %s, \"phone\": %s, \"label\": %s, \"email\": %s, \"label\": %s }",
                fname, lname, company, title, phone.getNumber(), phone.getLabel(), email.getAddress(),
                email.getLabel());
    }
}
