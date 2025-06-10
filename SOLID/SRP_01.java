package SOLID;

import java.io.FileWriter;
import java.io.IOException;

public class SRP_01 {

    public static class User {
        private String name;
        private String email;
       
        public User(String name, String email) {
            this.name = name;
            this.email = email;
        }
        public String getName() {
            return name;
        }
 
        public String getEmail() {
            return email;
        }
    }
 
    public static class UserSaver{
        public void saveToFile(User user) {
            try (FileWriter fileWriter = new FileWriter(user.getName() + ".output.txt")) {
                fileWriter.write("Name: " + user.getName() + "\n");
                fileWriter.write("Email: " + user.getEmail() + "\n");
                System.out.println("User data saved successfully!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
 
    public static void main(String[] args) {
        User user = new User("anusha", "anusha@gmail.com");
        UserSaver userSaver = new UserSaver();
        userSaver.saveToFile(user);
    }
}