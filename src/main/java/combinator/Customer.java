package combinator;

import java.time.LocalDate;

public class Customer {
    private final String name;
    private final String phoneNumber;
    private final String email;
    private final LocalDate dob;

    public Customer(String name, String email,String phoneNumber, LocalDate dob){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
    }

    public String getName(){
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getEmail(){
        return email;
    }

    public LocalDate getDob() {
        return dob;
    }
}
