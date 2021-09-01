
/**
 * Class ConcretePerson with AbstractPerson behaviour.
 *
 * @author Jakub Ruminski 119441536.
 */
public final class ConcretePerson implements AbstractPerson {
    private final AbstractPerson person;
    private final Abstract_PersonEarnings earnings;

//  ----- Constructors -------------------------

    /**
     * private constructor for class ConcretePerson.
     *
     * @param person A class object.
     */
    private ConcretePerson( final AbstractPerson person ) {
        this.person = person;
        this.earnings = Concrete_PersonEarnings.create();
    }

//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

//  -------- Indirect Constructor methods ------

    /**
     * returns instance of AbstractPerson.
     *
     * @param person A class object.
     *
     * @return Instance of AbstractPerson.
     */
    public static AbstractPerson create( final BookUser person ) {
        return new ConcretePerson( person );
    }

//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

//  ------ From interface AbstractPerson -------

    /**
     * returns person's name using their toString method.
     *
     * @return The person's name.
     */
    @Override
    public final String getName( ) {
        return this.person.toString();
    }

//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

//  --- Abstract_PersonEarnings ----------------

    /**
     * returns person's earnings.
     *
     * @return The person's earnings.
     */
    @Override
    public final Number getEarnings( ) {
        // Overrides getEarnings( ) from interface [ Abstract_PersonEarnings ].
        return this.earnings.getEarnings();
    }

//  ----- receive( earnings ) ---------
    /**
     * The amount to be receiving by the person.
     *
     * @param earnings  The amount to be received.
     */
    @Override
    public final void receive( final Double earnings ) {
        // Overrides receive( amount ) from interface [ Abstract_PersonEarnings ].
        this.earnings.receive(earnings);
    }
    /**
     * The amount to be receiving by the person.
     *
     * @param earnings  The amount to be received.
     */
    @Override
    public final void receive( final Integer earnings ) {
        // Overrides receive( amount ) from interface [ Abstract_PersonEarnings ].
        this.earnings.receive(earnings);
    }
//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//  ------- charge( amount ) ----------
    /**
     * The amount by which the person is charged.
     *
     * @param amount The amount to be subtracted from earnings.
     */
    @Override
    public final void charge( final Double amount ) {
        // Overrides charge( amount ) from interface [ Abstract_PersonEarnings ].
        earnings.charge( amount );
    }

    /**
     * The amount by which the person is charged.
     *
     * @param amount The amount to be subtracted from earnings.
     */
    @Override
    public final void charge( final Integer amount ) {
        // Overrides charge( amount ) from interface [ Abstract_PersonEarnings ].
        earnings.charge( amount );
    }
//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
}
