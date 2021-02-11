package example2;

public class Main {

    public static void main(String[] args) {

         Car obj = new Car();
        // Method reference using the object of the class
         MyInterface ref = obj::nameToUppercase;
        // Calling the method of functional interface

        ref.display("Tesla");
    }
}
