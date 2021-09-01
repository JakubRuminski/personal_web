
/**
 * Class Concrete_Physical_book with Book behaviours.
 *
 * @author Jakub Ruminski 119441536
 */
public class Concrete_Physical_book implements Physical_Book{

    private final Book book;   // delegate class instance.
//  ----------- private Constructors -----------
    /**
     * private constructor for class Concrete_Physical_book.
     *
     * @param author           An Author instance.
     * @param title            A Title instance.
     * @param number_of_pages  The book's number of pages.
     * @param price            The book's price.
     */
    private Concrete_Physical_book( final Author author,
                                   final Title title,
                                   final Integer number_of_pages,
                                   final Double price ) {

        this.book = Concrete_Book.create( author,
                                          title,
                                          number_of_pages,
                                          price );
    }
//  --------------------------------------------

//  --------Indirect Constructor methods--------
    /**
     * returns instance of Concrete_Physical_book.
     *
     * @param author          An Author instance.
     * @param title           A Title instance.
     * @param number_of_pages The book's number of pages.
     * @param price           The book's price.
     *
     * @return An instance of Book.
     */
    public static Book create( final Author author,
                                    final Title title,
                                    final Integer number_of_pages,
                                    final Double price ) {

        return new Concrete_Physical_book( author,
                                           title,
                                           number_of_pages,
                                           price );
    }
//  --------------------------------------------

//    --------From Book_Length interface--------

    /**
     * returns book's length.
     *
     * @return The book's length as [Integer].
     */
    @Override
    public final Integer getLength( ) {
        // Overrides getLength( ) from [ Book_Length ] interface
        // by using instance of delegate class Concrete_Book.
        return (Integer) book.getLength();
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
    public final void payAuthor( Double amount ) {
        // Overrides payAuthor( amount ) from [ Book ] interface
        // by using instance of delegate class Concrete_Book.
        book.payAuthor( amount );
    }
    /**
     * pays author amount specified.
     *
     * @param amount The amount(type Integer) author receives.
     */
    @Override
    public final void payAuthor( Integer amount ) {
        // Overrides payAuthor( amount ) from [ Book ] interface
        // by using instance of delegate class Concrete_Book.
        book.payAuthor( amount );
    }
//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    /**
     * returns the authors full name.
     *
     * @return Author's name.
     */
    @Override
    public final String getAuthor( ) {
        // Overrides getAuthor( ) from [ Book ] interface
        // by using instance of delegate class Concrete_Book.
        return book.getAuthor();
    }

    /**
     * returns the title name.
     *
     * @return Title's name.
     */
    @Override
    public final String getTitle( ) {
        // Overrides getLength( ) from [ Book ] interface
        // by using instance of delegate class Concrete_Book.
        return book.getTitle();
    }

    /**
     * returns the book's price.
     *
     * @return Book's price.
     */
    @Override
    public final Number getPrice( ) {
        // Overrides getPrice( ) from [ Book ] interface
        // by using instance of delegate class Concrete_Book.
        return book.getPrice();
    }

    /**
     * returns String representation of
     * information associated with the book.
     *
     * @return Book's string representation.
     */
    @Override
    public final String toString( ) {
        // Overrides toString( ) from [ Book ] interface
        // by using instance of delegate class Concrete_Book.
        return book.toString();
    }

//    ------------------------------------------
}
