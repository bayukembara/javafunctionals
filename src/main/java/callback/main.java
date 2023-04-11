package callback;

import java.util.function.Consumer;

public class main {
	public static void main(String[] args) {

		hello("john", "Montana", value -> {
			System.out.println("no lastName Provided for " + value);
		});
	}

	static void hello(String firstName, String lastName, Consumer<String> callback) {
		System.out.println(firstName);
		if (lastName != null) {
			System.out.println(lastName.toLowerCase());
		}
		else {
			callback.accept(firstName);
		}

	}

//    function hello(firstName,lastName,callback){
//        console.log(firstName);
//        if(lastName){
//            console.log(lastName);
//        }else{
//            callback();
//        }
//    }
}
