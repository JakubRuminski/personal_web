import java.util.ArrayList;

/**
 * Class ConcreteBookUser with BookUser, and Person behaviour.
 *
 * @author Jakub Ruminski 119441536
 */
public class ConcreteBookUser implements BookUser{

    private ArrayList<Book> owned_books = new ArrayList<>();
    private final AbstractPerson person;

//  ----- Constructors -------------------------

    /**
     * Constructs instance of
     *
     * @param bookuser
     */
    private ConcreteBookUser( final BookUser bookuser ) {
        this.person = ConcretePerson.create( bookuser );
    }

//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

//  -------- Indirect Constructor methods ------

    public static BookUser create( final Author author ) {
        return new ConcreteBookUser( author );
    }

    public static BookUser create( final Reader reader ) {
        return new ConcreteBookUser( reader );
    }

//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

//  ------- From interface AbstractPerson ------

    /**
     * returns the book user's name as String.
     *
     * @return The book user's name.
     */
    @Override
    public final String getName( ) {
        // Overrides getName( ) from interface [ AbstractPerson ].
        return person.getName();
    }

    /**
     * returns the book user's earnings.
     *
     * @return The book user's earnings.
     */
    @Override
    public final Number getEarnings( ) {
        // Overrides getEarnings( ) from interface [ Abstract_PersonEarnings ].
        return person.getEarnings( );
    }

//  ----- receive( earnings ) ---------
    /**
     * The amount to be receiving by the book user.
     *
     * @param earnings  The amount to be received.
     */
    @Override
    public final void receive( final Double earnings ) {
        // Overrides receive( amount ) from interface [ Abstract_PersonEarnings ].
        person.receive( earnings );
    }
    /**
     * The amount to be receiving by the book user.
     *
     * @param earnings  The amount to be received.
     */
    @Override
    public final void receive( final Integer earnings ) {
        // Overrides receive( amount ) from interface [ Abstract_PersonEarnings ].
        person.receive( earnings );
    }
//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//  ------- charge( amount ) ----------
    /**
     * The amount by which the book user is charged.
     *
     * @param amount The amount to be subtracted from earnings.
     */
    @Override
    public final void charge( final Double amount ) {
        // Overrides charge( amount ) from interface [ Abstract_PersonEarnings ].
        person.charge(amount);
    }
    /**
     * The amount by which the book user is charged.
     *
     * @param amount The amount to be subtracted from earnings.
     */
    @Override
    public final void charge( final Integer amount ) {
        // Overrides charge( amount ) from interface [ Abstract_PersonEarnings ].
        person.charge(amount);
    }
//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

//  ------- From interface BookUser ------------

    /**
     * The act of book user buying a book.
     *
     * @param book The book to be bought.
     */
    @Override
    public final void buy( final Book book ) {
        // Overrides buy( book ) from interface [ BookUser ].

        Double persons_earnings = person.getEarnings( ).doubleValue( );
        Double book_price = book.getPrice().doubleValue();
        int result = persons_earnings.compareTo( book_price );
        if ( result >= 0 ) {
            double percentage_cut = 0.1;
            // ^percentage the author gets for book sold.

            Double amount = book.getPrice().doubleValue() * percentage_cut;
            book.payAuthor( amount );
            owned_books.add( book );
            person.charge( book.getPrice().doubleValue() );
        }
        else {
            System.out.printf( "You don’t have enough money to buy\n " +
                    "\t %s[ %s ] \n", book.getClass().getName(), book.toString() );
        }
    }

    /**
     * returns array of books owned by book user.
     *
     * @return Owned books.
     */
    @Override
    public final ArrayList<Book> getOwnedBooks( ) {
        // Overrides getOwnedBooks( ) from interface [ BookUser ].
        return new ArrayList<>( owned_books );
    }

    /**
     * prints list of books owned by book user.
     *
     */
    public final void printBooksOwned( ) {
        // Overrides printBooksOwned( ) from interface [ BookUser ].
        String books = "";
        for ( Book book : owned_books ) {
            books = books.concat("\t" + book.getTitle() + "\n");
        }
        System.out.printf("%s owns:\n%s", this.getName(), books);
    }

//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

}
