import java.util.ArrayList;

public interface BookUser extends AbstractPerson{

    public void buy(final Book book);

    public ArrayList<Book> getOwnedBooks( );
    public void printBooksOwned( );

}

