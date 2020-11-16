package masterIL.exemple.book.model;

public class Book {

        private int id;
        private String name;
        private String author;
        private String description;
        private double price;

        public Book(int id) {
                this.id = id;
                this.price = -1;
        }

        public Book() {
                this.price = -1;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getAuthor() {
                return author;
        }

        public void setAuthor(String author) {
                this.author = author;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public double getPrice() {
                return price;
        }

        public void setPrice(double price) {
                this.price = price;
        }
}
