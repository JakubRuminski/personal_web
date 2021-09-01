import java.util.ArrayList;

public interface Abstract_Author extends BookUser {

    public void publishBook( final Book book );
    public ArrayList<Book> getPublishedBooks( );
    public void printBooksPublished( );

}
