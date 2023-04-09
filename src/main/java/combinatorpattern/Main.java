package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {
        Customer customer =  new Customer(
         "Alice","alice@gmail.com","+6282244252699"
                , LocalDate.of(1995,10,23)
        );

//        Using Customer Validator Service Manual
        CustomerValidatorService validService = new CustomerValidatorService();
        System.out.println(validService.isAutheticated(customer));


//        Using another way

        System.out.println(new CustomerValidatorService().isAutheticated(customer));
        //    Using Combinator Pattern

        ValidResult hasil =isEmailValid().and(isPhoneNumberValid()).and(isAdultsValid()).apply(customer);

        System.out.println(hasil);

        if(hasil != ValidResult.BERHASIL){
            throw new IllegalStateException(hasil.name());
        }
    }


}
