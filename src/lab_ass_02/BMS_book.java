package lab_ass_02;

public class BMS_book {
        // Private attributes for encapsulation
        private String author;
        private String[] chapterNames = new String[100];  // Array to store up to 100 chapter names

        // No-argument constructor
        public BMS_book() {
            this.author = "Unknown Author";  // Default author
            // Initialize all chapter names as empty strings
            for (int i = 0; i < 100; i++) {
                chapterNames[i] = "";
            }
        }
        // Parameterized constructor
        public BMS_book(String author, String[] chapterNames) {
            this.author = author;
            for (int i = 0; i < chapterNames.length; i++) {
                this.chapterNames[i] = chapterNames[i];
            }
        }
    public String getAuthor() {
        return author;
    }

    public String[] getChapterNames() {
        return chapterNames;
    }

    // Setter for author
        public void setAuthor(String author) {
            this.author = author;
        }

        // Setter for chapter names
        public void setChapterNames(String[] chapterNames) {
            for (int i = 0; i < chapterNames.length; i++) {
                this.chapterNames[i] = chapterNames[i];
            }
        }

        // Method to compare authors of two books
        public boolean compareBooks(BMS_book b) {
            return this.author.equals(b.author);  // Compare authors
        }
        // Method to compare the number of chapters between two books
        public BMS_book compareChapterNames(BMS_book b) {
            int thisBookChapterCount = 0;
            int otherBookChapterCount = 0;
            // Count the number of non-empty chapters for this book
            for (String chapter : this.chapterNames) {
                if (chapter != null && !chapter.isEmpty()) {
                    thisBookChapterCount++;
                }
            }for (String chapter : b.chapterNames) {
                if (chapter != null && !chapter.isEmpty()) {
                    otherBookChapterCount++;
                }
            }if (thisBookChapterCount > otherBookChapterCount) {
                return this;
            } else {
                return b;
            }
        }
        public void displayBookInfo() {
            System.out.println("Author: " + author);
            System.out.print("Chapters: ");
            for (String chapter : chapterNames) {
                if (chapter != null && !chapter.isEmpty()) {
                    System.out.print(chapter + ", ");
                }
            }
            System.out.println();
        }
    }


