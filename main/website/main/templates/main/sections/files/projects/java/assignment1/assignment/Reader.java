import java.util.ArrayList;

/**
 * Class Reader with AbstractReader, BookUser, Person behaviour.
 *
 * @author Jakub Ruminski 119441536
 */
public class Reader implements AbstractReader {
    private final String name;
    private final String surname;
    private final BookUser book_user;

//  ----- Constructors -------------------------

    /**
     * Constructs instance of class Reader
     *
     * @param name    The reader's name.
     * @param surname The reader's surname.
     */
    public Reader( final String name, final String surname) {
        this.name = name;
        this.surname = surname;
        this.book_user = ConcreteBookUser.create( this );
    }

//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

//  ----- From interface AbstractPerson --------
    /**
     * returns reader's name.
     *
     * @return The reader's name.
     */
    @Override
    public final String getName( ) {
        // Overrides getName from interface [ AbstactPerson ].
        return book_user.getName( );
    }

//  ------ Abstract_PersonEarnings interface ---
    /**
     * returns reader's total earnings.
     *
     * @return The reader's earnings
     */
    @Override
    public final Number getEarnings( ) {
        // Overrides getEarnings from interface [ AbstractPerson ]
        return book_user.getEarnings( );
    }

//  ---- receive( amount ) -------
    /**
     * The amount to be receiving by the reader.
     *
     * @param earnings  The amount to be received.
     */
    @Override
    public final void receive( Double earnings ) {
        // Overrides receive( earnings ) from interface [ Abstract Person ].
        book_user.receive( earnings );
    }
    /**
     * The amount to be receiving by the reader.
     *
     * @param earnings  The amount to be received.
     */
    @Override
    public final void receive( Integer earnings ) {
        // Overrides receive( earnings ) from interface [ Abstract Person ].
        book_user.receive( earnings );
    }
//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//  ----- charge( amount ) -------
    /**
     * The amount by which the reader is charged.
     *
     * @param amount The amount to be subtracted from earnings.
     */
    @Override
    public final void charge( final Double amount) {
        // Overrides charge( ) from the interface [ AbstractPerson ].
        book_user.charge( amount );
    }
    /**
     * The amount by which the reader is charged.
     *
     * @param amount The amount to be subtracted from earnings.
     */
    @Override
    public final void charge( final Integer amount) {
        // Overrides charge( ) from the interface [ AbstractPerson ].
        book_user.charge( amount );
    }
//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

//  ------- From interface BookUser ------------

    /**
     * The act of reader buying a book.
     *
     * @param book The book to be bought.
     */
    @Override
    public final void buy( final Book book ) {
        // @Override buy( ) from interface [ BookUser ].
        book_user.buy( book );
    }

    /**
     * returns array of books owned by reader.
     *
     * @return The array of owned books.
     */
    @Override
    public final ArrayList<Book> getOwnedBooks( ) {
        // Overrides getOwnedBooks( ) from interface [ BookUser ].
        return book_user.getOwnedBooks( );
    }

    /**
     * prints list of books owned by reader.
     *
     */
    @Override
    public final void printBooksOwned( ) {
        // Overrides printBooksOwned( ) from interface [ BookUser ].
        book_user.printBooksOwned();
    }

//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

//  -------- From interface AbstractReader -----

    /**
     * returns string representation of reader.
     *
     * @return string representation of reader
     */
    @Override
    public final String toString( ) {
        return name + " " + surname;
    }

//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
}
