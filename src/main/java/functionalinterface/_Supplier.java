package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDB.get());
        System.out.println(getDBSupplier.get());

    }

//* static String getDBConnectionUrl =  this is the method

    static String getDBConnectionUrl(){
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getDB = () -> "jdbc://localhost:5432/users";

//*    or want to make a list

    static Supplier<List<String>> getDBSupplier = ()-> List.of("jdbc://localhost:5432/users","jdbc://localhost:5432/customer","jdbc://localhost:5432/catalog");

}
