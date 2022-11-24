public class Book {
    private String header;
    private Writter writter;
    private int yearPublish;

    public Book(String header, Author author, int yearPublish) {
        this.header = header;
        this.writter = new Writter("Дмитрий", "Лихачев");
        this.yearPublish = yearPublish;
    }

    public String getHeader() {
        return this.header;
    }

    public Writter getWritter() {
        return this.writter;
    }

    public int getYearPublish() {
        return this.yearPublish;
    }

        public void setYearPublish ( int yearPublish){
            this.yearPublish = yearPublish;
        }
    }
