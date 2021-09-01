import java.util.ArrayList;


/**
 * Enumerated class with AbstractAuthor, BookUser, Person behaviour.
 *
 * @author Jakub Ruminski 119441536
 */
public enum Author implements Abstract_Author{
    JJR_Tolkien( "JJR Tolkien" ), JD_Sallinger( "JD Sallinger" );

    private final String name;
    private ArrayList<Book> published_books = new ArrayList<>();
    private final BookUser book_user;
    // ^ book_user - Holds delegate instance ConcreteBookUser

    /**
     * private constructor for enumerated instances.
     *
     * @param name The author's name.
     */
    private Author( final String name ) {
        this.name = name;
        this.book_user = ConcreteBookUser.create( this );
    }

//  --------------------------------------------

//  --------- From Interface Person ------------

    /**
     * returns the author's name as String.
     *
     * @return The author's name.
     */
    @Override
    public final String getName( ) {
        // Overrides getName( ) from interface [ AbstractPerson ].
        return book_user.getName();
    }

    /**
     * returns the author's full name.
     *
     * @return The author's name.
     */
    @Override
    public final String toString( ) {
        return this.name;
    }
//  ------ Abstract_PersonEarnings interface ---
    /**
     * returns the author's earnings.
     *
     * @return The author's earnings.
     */
    @Override
    public final Number getEarnings( ) {
        // Overrides getEarnings( ) from interface [ Abstract_PersonEarnings ].
        return book_user.getEarnings();
    }
//  ---- receive( amount ) -------
    /**
     * The amount to be receiving by the author.
     *
     * @param earnings  The amount to be received.
     */
    @Override
    public final void receive( final Double earnings ) {
        // Overrides receive( amount ) from interface [ Abstract_PersonEarnings ].
        book_user.receive( earnings );
    }
    /**
     * The amount to be receiving by the author.
     *
     * @param earnings  The amount to be received.
     */
    @Override
    public final void receive( final Integer earnings ) {
        // Overrides receive( amount ) from interface [ Abstract_PersonEarnings ].
        book_user.receive( earnings );
    }
//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//  ----- charge( amount ) -------
    /**
     * The amount by which the author is charged.
     *
     * @param amount The amount to be subtracted from earnings.
     */
    @Override
    public final void charge( final Double amount ) {
        // Overrides charge( amount ) from interface [ Abstract_PersonEarnings ].
        book_user.charge( amount );
    }
    /**
     * The amount by which the author is charged.
     *
     * @param amount The amount to be subtracted from earnings.
     */
    @Override
    public final void charge( final Integer amount ) {
        // Overrides charge( amount ) from interface [ Abstract_PersonEarnings ].
        book_user.charge( amount );
    }
//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

//  --------- From Interface BookUser ----------

    /**
     * The act of author buying a book.
     *
     * @param book The book to be bought.
     */
    @Override
    public final void buy( final Book book ) {
        // Overrides buy( book ) from interface [ BookUser ].
        book_user.buy( book );
    }

    /**
     * returns array of books owned by author.
     *
     * @return Owned books.
     */
    @Override
    public final ArrayList<Book> getOwnedBooks( ) {
        // Overrides getOwnedBooks( ) from interface [ BookUser ].
        return book_user.getOwnedBooks( );
    }

    /**
     * prints list of books owned by author.
     *
     */
    @Override
    public final void printBooksOwned( ) {
        // Overrides printBooksOwned( ) from interface [ BookUser ].
        book_user.printBooksOwned();
    }

//  --------------------------------------------

//  ------ From interface AbstractAuthor -------

    /**
     * The act of author publishing a book.
     *
     * @param book The book to be published.
     */
    @Override
    public final void publishBook( final Book book ) {
        // Override publishBook( book ) from interface [ AbstractAuthor ].
        published_books.add( book );
    }

    /**
     * returns array of books published by author.
     *
     * @return Array of books published.
     */
    @Override
    public final ArrayList<Book> getPublishedBooks( ) {
        // Overrides getPublishedBooks( ) from interface [ AbstractAuthor ].
        return new ArrayList<>( published_books );
    }

    /**
     * prints list of books published by author.
     *
     */
    @Override
    public final void printBooksPublished( ) {
        // Overrides printBooksPublished( ) from interface [ AbstractAuthor ].
        String books = "";
        for ( Book book : published_books ) {
            books = books.concat("\t" + book.getTitle() + "\n");
        }
        System.out.printf("%s published:\n%s", this.getName(), books);
    }

//  --------------------------------------------

}
