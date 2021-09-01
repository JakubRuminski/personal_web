
/**
 * Class Concrete_PersonEarnings with Abstract_PersonEarnings behaviour.
 *
 * @author Jakub Ruminski 119441536.
 */
public class Concrete_PersonEarnings implements Abstract_PersonEarnings {
    private Number earnings = 0;

//  -------- Constructors ----------------------
    private Concrete_PersonEarnings( ) {
        this.earnings = earnings;
    }

//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

//  ----- Indirect Constructor Methods ---------

    public static Abstract_PersonEarnings create( ) {
        return new Concrete_PersonEarnings( );
    }

//  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    @Override
    public final Number getEarnings() {
        if ( this.earnings instanceof Double){
            double whole_number = (Double)this.earnings -
                    Math.floor((Double) this.earnings);
            // checks if Double number can be converted
            // to an Integer
            if ( whole_number == 0) {
                return this.earnings.intValue();
            }else {
                return this.earnings;
            }

        }
        return this.earnings;
    }

    @Override
    public final void receive( Double earnings ) {
        double current_earnings = this.earnings.doubleValue();
        this.earnings = current_earnings + earnings;
    }

    @Override
    public final void receive( Integer earnings ) {
        double earnings_given = earnings.doubleValue();
        double current_earnings = this.earnings.doubleValue();
        this.earnings = current_earnings + earnings_given;
    }

    @Override
    public final void charge( Double amount ) {
        double current_earnings = this.earnings.doubleValue();
        this.earnings = current_earnings - amount;
    }

    @Override
    public final void charge( Integer amount ) {
        double amount_given = amount.doubleValue();
        double current_earnings = this.earnings.doubleValue();
        this.earnings = current_earnings - amount_given;
    }
}
