import java.util.Scanner;

// Dog class implementation
    public class Dog {
        private String name;
        private String breed;



        // Constructor
        public Dog(String name, String breed) {
            // Initialize attributes
            this.name=name;
            this.breed=breed;
        }

    public static void main(String[] arg){
        // Dog myDog = new Dog("Mike", "Golden retriver");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String breed = scanner.next();
        System.out.println("Name of the Dog: "+name);
        System.out.println("Name of the Breed: "+breed);



    }
        // Method to make the dog bark
        public void bark() {
            // Output the dog's name followed by 'barked'

        }

    }

