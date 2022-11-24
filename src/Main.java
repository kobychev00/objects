public class Main {

    public static void main(String[] args) {
        // dz1
        System.out.println("ДЗ1");
        Author author1 = new Author ("Дмитрий", "Лихачев");
        Book book1 = new Book("Письма о добром", author1 , 2014 );
        Author author2 = new Author("Александр", "Дюма");
        Book book2 = new Book("Три мушкетёра", author2, 2005);
        System.out.println(book1.getHeader() + " " + book1.getYearPublish() + " " + book1.getWritter());
        System.out.println(book2.getHeader() + " " + book2.getYearPublish() + " " + book2.getWritter());
        book2.setYearPublish(2010);
        System.out.println("Обновлена дата издания" + ". " + book2.getHeader() + " " + book2.getYearPublish() + " " + book2.getWritter());



















        // конспект
        String nameJohn = "John";
        int ageJohn = 13;

        String nameSarah = "Sarah";
        int ageSarah = 30;

        String[] names = {"John", "Sarah"};
        int[] ages = {13, 30};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Имя - " + names[i] + " Возраст - " + ages[i]);
        }
        Person sarah = new Person("Sarah", 30);
        System.out.println("sarah.name = " + sarah.getName());
        System.out.println("sarah.age = " + sarah.getAge());
        Person john = new Person("John", 13);
        sarah.setAge(31);
        System.out.println("sarah.getAge() = " + sarah.getAge());
        System.out.println("john.name = " + john.getName());
        System.out.println("john.age = " + john.getAge());
    }
}