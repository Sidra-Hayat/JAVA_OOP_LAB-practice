package theory_assignment_04;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class PurchaseManager_s1 {

        public void savePurchase(String username, String email, String bookTitle)
                throws  InvalidInputException_s1 {
            validateInputs(username, email, bookTitle);

            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            String record = String.format("Username: %s | Email: %s | Book: %s | Time: %s%n",
                    username, email, bookTitle, timestamp);

            try (FileWriter writer = new FileWriter("purchases.txt", true)) {
                writer.write(record);
                System.out.println("Purchase recorded successfully.");
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }
        }
        private void validateInputs(String username, String email, String bookTitle) throws InvalidInputException_s1, InvalidInputException_s1 {
            if (username == null || username.trim().isEmpty())
                throw new InvalidInputException_s1("Username cannot be empty.");
            if (email == null || !email.contains("@"))
                throw new InvalidInputException_s1("Invalid email address.");
            if (bookTitle == null || bookTitle.trim().isEmpty())
                throw new InvalidInputException_s1("Book title cannot be empty.");
        }
    }


