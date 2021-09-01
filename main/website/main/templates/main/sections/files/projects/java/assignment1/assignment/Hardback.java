
/**
 * Class Hardback with Book behaviours.
 *
 * @author Jakub Ruminski 119441536
 */
public class Hardback implements AbstractHardback {
    private final Double PRICE = 12.0;   // price of book €12.0.
    private final Book physical_book;    // delegate class instance.


    /**
     * Creates instance of Hardback
     *
     * @param author           An Author instance.
     * @param title            A Title instance.
     * @param number_of_pages  The books length.
     */
    public Hardback( final Author author,
                              final Title title,
                              final Integer number_of_pages ) {
        this.physical_book = Concrete_Physical_book.create( author,
                                                            title,
                                                            number_of_pages,
                                                            PRICE);
    }

//  --------- Book_Length interface ------------

    /**
     * returns book's length.
     *
     * @return The book's length as [Integer].
     */
    @Override
    public final Integer getLength( ) {
        // Overrides getLength( ) from Book_Length interface
        // by using instance of delegate class Concrete_Physical_Book.
        return (Integer) physical_book.getLength();
    }

//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

//  -------- Book interface --------------------

//  --- payAuthor( amount ) ------
    /**
     * pays author amount specified.
     *
     * @param amount The amount author receives.
     */
    @Override
    public final void payAuthor(Double amount) {
        // Overrides payAuthor( amount ) from Book interface by using
        // instance of delegate class Concrete_Physical_Book.
        physical_book.payAuthor( amount );
    }
    /**
     * pays author amount specified.
     *
     * @param amount The amount author receives.
     */
    @Override
    public final void payAuthor(Integer amount) {
        // Overrides payAuthor( amount ) from Book interface by using
        // instance of delegate class Concrete_Physical_Book.
        physical_book.payAuthor( amount );
    }
//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    /**
     * returns the authors full name.
     *
     * @return Author's name.
     */
    @Override
    public final String getAuthor( ) {
        // Overrides getAuthor( ) from Book interface by using
        // instance of delegate class Concrete_Physical_Book.
        return physical_book.getAuthor();
    }

    /**
     * returns the title name.
     *
     * @return Title's name.
     */
    @Override
    public final String getTitle( ) {
        // Overrides getTitle( ) from Book interface by using
        // instance of delegate class Concrete_Physical_Book.
        return physical_book.getTitle();
    }

    /**
     * returns the book's price.
     *
     * @return Book's price.
     */
    @Override
    public final Number getPrice( ) {
        // Overrides getPrice( ) from Book interface by using
        // instance of delegate class Concrete_Physical_Book.
        return physical_book.getPrice();
    }

    /**
     * returns String representation of
     * information associated with the book.
     *
     * @return Book's string representation.
     */
    @Override
    public final String toString( ) {
        // Overrides toString( ) from Book interface by using
        // instance of delegate class Concrete_Physical_Book.
        return physical_book.toString();
    }

//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

}
