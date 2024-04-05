package exam.cs489.model;

import java.util.List;

public class Contact {
    private String fname;
    private String lname;
    private String company;
    private String title;
    private List<Phone> phone;
    private List<Phone> email;

    public Contact(String fname, String lname, String company, String title, List phones, List emails) {
        this.fname = fname;
        this.lname = lname;
        this.company = company;
        this.title = title;
        this.phone = new Phone(number, elabel);
        this.email = new Email(eaddress, elabel);
        if(phones == null){

        }else{
            for(int i = 0; i < phones.size();i++){
                // phone.add(new Phone(phones.get(i)[0], phones.get(i)[1])));
                phone.add(new Phone(company, title));
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

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public String toJSONString() {

        return String.format(
                "\t{ \"fname\": %s, \"lname\": %s, \"company\": %s, \"title\": %s, \"phone\": %s, \"label\": %s, \"email\": %s, \"label\": %s }",
                fname, lname, company, title, phone.getNumber(), phone.getLabel(), email.getAddress(),
                email.getLabel());
    }
}
