public interface Abstract_PersonEarnings {

    public Number getEarnings( );

    public void receive( final Double earnings );
    public void receive( final Integer earnings );


    public void charge( final Double amount );
    public void charge( final Integer amount );

}
