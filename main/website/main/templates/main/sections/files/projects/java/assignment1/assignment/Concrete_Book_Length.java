

/**
 * Class Concrete_Book with Book_Length methods.
 *
 * @author Jakub Ruminski 119441536
 */
public class Concrete_Book_Length implements Book_Length{
    private final Number length;
//  --------------------------------------------

//  ------------private Constructors------------
    /**
     * private constructor for class Concrete_Book_length.
     *
     * @param length  The book's length.
     */
    private Concrete_Book_Length( final Number length ) {
        this.length = length;
    }
//  --------------------------------------------

//  --------Indirect Constructor methods--------
    /**
     * returns instance of Concrete_Book_Length.
     *
     * @param length  The book's length [ Integer ].
     *
     * @return An instance of Book_Length.
     */
    public static Book_Length create( final Integer length ) {
        return new Concrete_Book_Length( length );
    }
    /**
     * returns instance of Concrete_Book_Length.
     *
     * @param length  The book's length [ Double ].
     *
     * @return An instance of Book_Length.
     */
    public static Book_Length create( final Double length ) {
        return new Concrete_Book_Length( length );
    }
//  --------------------------------------------

//  ----- GET Methods --------------------------

    /**
     * returns length of book.
     *
     * @return The book's length.
     */
    @Override
    public final Number getLength( ) {
        return length;
    }

    /**
     * returns string representation of book's length.
     *
     * @return The book's length.
     */
    @Override
    public final String toString( ) {
        if (length instanceof Double) {
            return "duration = " + length;
        }else if ( length instanceof Integer ) {
            return "number of pages = " + length;
        }else {
            return " problem. ";
        }
    }
//  --------------------------------------------
}
