
/**
 * Class Audiobook with Book behaviours.
 *
 * @author Jakub Ruminski 119441536
 */
public class AudioBook implements AbstractAudiobook{
    private static Double PRICE = 15.0;   // price of book €15.0.
    private final Book digital_book;      // delegate class instance.

    /**
     * Creates instance of Audiobook
     *
     * @param author           An Author instance.
     * @param title            A Title instance.
     * @param duration         The books length.
     */
    public AudioBook( final Author author,
                      final Title title,
                      final Double duration) {
        this.digital_book = Concrete_Book.create( author,
                                                  title,
                                                  duration,
                                                  PRICE );
    }
//  --------- Book_Length interface ------------

    /**
     * returns book's length.
     *
     * @return The book's length as [Double].
     */
    @Override
    public final Double getLength() {
        // Overrides getLength( ) from Book_Length interface
        // by using instance of delegate class Concrete_Book.
        return (Double) digital_book.getLength();
    }

//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

//  -------- Book interface --------------------

//  --- payAuthor( amount ) ------
    /**
     * pays author amount specified.
     *
     * @param amount The amount(type Double) author receives.
     */
    @Override
    public final void payAuthor(Double amount) {
        // Overrides payAuthor( amount ) from Book interface
        // by using instance of delegate class Concrete_Book.
        digital_book.payAuthor( amount );
    }
    /**
     * pays author amount specified.
     *
     * @param amount The amount(type Integer) author receives.
     */
    @Override
    public final void payAuthor(Integer amount) {
        // Overrides payAuthor( amount ) from Book interface
        // by using instance of delegate class Concrete_Book.
        digital_book.payAuthor( amount );
    }
//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    /**
     * returns the authors full name.
     *
     * @return Author's name.
     */
    @Override
    public final String getAuthor( ) {
        // Overrides getAuthor( ) from Book interface
        // by using instance of delegate class Concrete_Book.
        return digital_book.getAuthor();
    }

    /**
     * returns the title name.
     *
     * @return Title's name.
     */
    @Override
    public final String getTitle( ) {
        // Overrides getTitle( ) from Book interface
        // by using instance of delegate class Concrete_Book.
        return digital_book.getTitle();
    }

    /**
     * returns the book's price.
     *
     * @return Book's price.
     */
    @Override
    public final Number getPrice( ) {
        // Overrides getPrice( ) from Book interface
        // by using instance of delegate class Concrete_Book.
        return digital_book.getPrice( );
    }

    /**
     * returns String representation of
     * information associated with the book.
     *
     * @return Book's string representation.
     */
    @Override
    public final String toString( ) {
        // Overrides toString( ) from Book interface
        // by using instance of delegate class Concrete_Book.
        return digital_book.toString();
    }

//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

}
