import java.nio.file.FileStore;

public class fullName_byCallingMethods {
    public static void main(String[] args) {
        greetUser("Altynai", "Basibosunova");

    }

    public static void greetUser(String FirstName, String secondName){
        System.out.println("Hello "+ FirstName+" "+secondName);
    }
}
