public class Book {
    private String header;
    private Author author;
    private int yearPublish;

    public Book(String header, Author author, int yearPublish) {
        this.header = header;
        this.author = author;
        this.yearPublish = yearPublish;
    }

    public String getHeader() {
        return this.header;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearPublish() {
        return this.yearPublish;
    }

        public void setYearPublish ( int yearPublish){
            this.yearPublish = yearPublish;
        }
    }
