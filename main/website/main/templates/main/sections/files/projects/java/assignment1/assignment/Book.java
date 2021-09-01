public interface Book extends Book_Length {

    public String getTitle( );
    public String getAuthor( );

    public void payAuthor( final Double amount );
    public void payAuthor( final Integer amount );

    public Number getPrice( );
    public String toString( );

}
