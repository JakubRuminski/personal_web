
/**
 * Class Concrete_Book with Book, and Book_Length methods.
 *
 * @author Jakub Ruminski 119441536
 */
public class Concrete_Book implements Book {
    private final Title title;
    private final Author author;
    private final Double price;
    private final Book_Length book_length;

    /**
     * private constructor for class Concrete_Book.
     *
     * @param author  An Author instance.
     * @param title   A Title instance.
     * @param length  The book's length as [ Double ].
     * @param price   The book's price.
     */
    private Concrete_Book( final Author author,
                           final Title title,
                           final Double length,
                           final Double price ) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.book_length = Concrete_Book_Length.create( length );
        this.author.publishBook( this );
    }
    /**
     * private constructor for class Concrete_Book.
     *
     * @param author  An Author instance.
     * @param title   A Title instance.
     * @param length  The book's length as [ Integer ].
     * @param price   The book's price.
     */
    private Concrete_Book( final Author author,
                           final Title title,
                           final Integer length,
                           final Double price ) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.book_length = Concrete_Book_Length.create( length );
        this.author.publishBook( this );
    }

    /**
     * returns instance of Concrete_Book.
     *
     * @param author  An Author instance.
     * @param title   A Title instance.
     * @param length  The book's length [ Double ].
     * @param price   The book's price.
     *
     * @return An instance of Book.
     */
    public static Book create( final Author author,
                              final Title title,
                              final Double length,
                              final Double price ) {
        return new Concrete_Book( author, title, length, price );
    }

    /**
     * returns instance of Concrete_Book.
     *
     * @param author  An Author instance.
     * @param title   A Title instance.
     * @param length  The book's length [ Integer ].
     * @param price   The book's price.
     *
     * @return An instance of Book.
     */
    public static Book create( final Author author,
                               final Title title,
                               final Integer length,
                               final Double price ) {
        return new Concrete_Book( author, title, length, price );
    }

//    --------From Book_Length interface--------

    /**
     * returns book's length.
     *
     * @return The book's length as [Integer].
     */
    @Override
    public final Number getLength( ) {
        // Overrides getLength( ) from [ Book_Length ] interface
        // by using instance of delegate class Concrete_Book_Length.
        return book_length.getLength();  // Only allows Integer or Double.
    }

//    ------------------------------------------

//    ---------From Book interface--------------
//  --- payAuthor( amount ) ------
    /**
     * pays author amount specified.
     *
     * @param amount The amount(type Double) author receives.
     */
    @Override
    public final void payAuthor( final Double amount ) {
        // Overrides payAuthor( ) from [ Book ] interface.
        // calls to instances receive(amount) function.
        author.receive( amount );
    }
    /**
     * pays author amount specified.
     *
     * @param amount The amount(type Integer) author receives.
     */
    @Override
    public final void payAuthor( final Integer amount ) {
        // Overrides payAuthor( ) from [ Book ] interface.
        // calls to instances receive(amount) function.
        author.receive( amount );
    }
//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    /**
     * returns the authors full name.
     *
     * @return Author's name.
     */
    @Override
    public final String getAuthor( ) {
    // Overrides getAuthor( ) from [ Book ] interface.
    return author.getName();
}

    /**
     * returns book's title.
     *
     * @return The book's title.
     */
    @Override
    public final String getTitle( ) {
        // Overrides getTitle( ) from [ Book ] interface.
        return title.getTitle( );
    }

    /**
     * returns the book's price.
     *
     * @return Book's price.
     */
    @Override
    public final Number getPrice( ) {
        // Overrides getPrice( ) from [ Book ] interface.
        return this.price;
    }

    /**
     * returns String representation of
     * information associated with the book.
     *
     * @return Book's string representation.
     */
    @Override
    public final String toString( ) {
        // Overrides toString( ) from [ Book ] interface.
        return String.format( "author = %s, title = %s, price = %s, %s",
                author,
                title.getTitle(),
                price,
                book_length.toString() );
    }

//    ------------------------------------------

}
