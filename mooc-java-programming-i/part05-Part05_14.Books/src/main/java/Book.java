
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object comparedObj) {
        if(this == comparedObj) {
            return true;
        }
        
        if(!(comparedObj instanceof Book)) {
            return false;
        }
        
        Book castedBook = (Book) comparedObj;
        
        return this.name.equals(castedBook.name) &&
               this.publicationYear == castedBook.publicationYear;
    }   
}
