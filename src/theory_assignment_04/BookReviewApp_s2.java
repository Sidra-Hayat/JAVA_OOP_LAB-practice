package theory_assignment_04;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class BookReviewApp_s2 {
        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> new BookReviewApp_s2().createUI());
        }

        private void createUI() {
            JFrame frame = new JFrame("TechBookHub - Submit Book Review");
            frame.setSize(400, 350);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            panel.setLayout(new GridBagLayout());
            frame.add(panel);

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(8, 8, 8, 8);
            gbc.fill = GridBagConstraints.HORIZONTAL;

            JLabel userLabel = new JLabel("Username:");
            JTextField userField = new JTextField(20);

            JLabel bookLabel = new JLabel("Book Title:");
            JTextField bookField = new JTextField(20);

            JLabel reviewLabel = new JLabel("Review Message:");
            JTextArea reviewArea = new JTextArea(5, 20);
            reviewArea.setLineWrap(true);
            reviewArea.setWrapStyleWord(true);
            JScrollPane scrollPane = new JScrollPane(reviewArea);

            JButton submitButton = new JButton("Submit Review");

            // Layout
            gbc.gridx = 0; gbc.gridy = 0;
            panel.add(userLabel, gbc);
            gbc.gridx = 1;
            panel.add(userField, gbc);

            gbc.gridx = 0; gbc.gridy = 1;
            panel.add(bookLabel, gbc);
            gbc.gridx = 1;
            panel.add(bookField, gbc);

            gbc.gridx = 0; gbc.gridy = 2;
            panel.add(reviewLabel, gbc);
            gbc.gridx = 1;
            panel.add(scrollPane, gbc);

            gbc.gridx = 1; gbc.gridy = 3;
            panel.add(submitButton, gbc);

            // Event Handling
            ReviewManager_s2 reviewManager = new ReviewManager_s2 ();
            submitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String username = userField.getText().trim();
                    String bookTitle = bookField.getText().trim();
                    String reviewMessage = reviewArea.getText().trim();

                    try {
                        reviewManager.saveReview(username, bookTitle, reviewMessage);
                        JOptionPane.showMessageDialog(frame, "Review submitted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        userField.setText("");
                        bookField.setText("");
                        reviewArea.setText("");
                    } catch (InvalidReviewException_s2  ex) {
                        JOptionPane.showMessageDialog(frame, ex.getMessage(), "Input Error", JOptionPane.WARNING_MESSAGE);
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(frame, "Error saving review: " + ex.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

            frame.setVisible(true);

        }
    }


