package theory_assignment_04;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class ReviewManager_s2 {

        public void saveReview(String username, String bookTitle, String reviewMessage) throws InvalidReviewException_s2 , IOException {
            validateInputs(username, bookTitle, reviewMessage);
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            String review = String.format("User: %s | Book: %s | Review: %s | Date: %s%n",
                    username, bookTitle, reviewMessage, timestamp);
            try (FileWriter writer = new FileWriter("reviews.txt", true)) {
                writer.write(review);
            }
        }
        private void validateInputs(String username, String bookTitle, String reviewMessage) throws  InvalidReviewException_s2 {
            if (username == null || username.trim().isEmpty())
                throw new InvalidReviewException_s2 ("Username cannot be empty.");
            if (bookTitle == null || bookTitle.trim().isEmpty())
                throw new InvalidReviewException_s2 ("Book title cannot be empty.");
            if (reviewMessage == null || reviewMessage.trim().isEmpty())
                throw new InvalidReviewException_s2 ("Review message cannot be empty.");
        }
    }


