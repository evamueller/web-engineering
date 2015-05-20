package model;

import java.util.Date;

public class FormModel {

    private String firstName;
    private String lastName;
    private String email;
    private Date date;
    private String category;
    private String headline;
    private String message;
    
    public FormModel() { }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        
        b.append("First Name: ");
        b.append(getFirstName());
        b.append(System.lineSeparator());
        b.append("Last Name: ");
        b.append(getLastName());
        b.append(System.lineSeparator());
        b.append("Email: ");
        b.append(getEmail());
        b.append(System.lineSeparator());
        b.append("Date: ");
        b.append(getDate());
        b.append(System.lineSeparator());
        b.append("Category: ");
        b.append(getCategory());
        b.append(System.lineSeparator());
        b.append("Headline: ");
        b.append(getHeadline());
        b.append(System.lineSeparator());
        b.append("Message: ");
        b.append(getMessage());
        
        return b.toString();
    }
}