public class Main {
    public static void main( String[] args ) {

//      -------Test given-----------------------
        final Title t1 = new Title( "The Hobbit", "An Unexpected Journey" ); // create title #1: main title and subtitle
        final Title t2 = new Title( "Catcher in the Rye" ); // create title #2: main title only
        final Author a1 = Author.JJR_Tolkien; // ‘‘create’’ author #1
        final Author a2 = Author.JD_Sallinger; // ‘‘create’’ author #2
        final Book b1 = new AudioBook( a1, t1, 1800.5 ); // create and publish book #1
        final Book b2 = new Paperback( a2, t2, 100 ); // create and publish book #2
        final Reader r1 = new Reader( "Joe", "Soap" ); // create reader #1
        a1.receive( 100 ); // author #1 receives some money to spend
        a1.buy( b2 ); // author #1 buys book worth 10 Euro
        r1.buy( b1 ); // reader #1 tries to buy book worth 15 Euro: fails
        r1.receive( 100.20 ); // reader #1 receives some money to spend
        r1.buy( b1 ); // reader #1 buys book worth 15 Euro: now works
        r1.buy( b2 ); // reader #1 buys book worth 10 Euro
        a1.printBooksOwned( );
        a1.printBooksPublished( );
        r1.printBooksOwned( );
        // a1 owns 100 - 10 + 0.10 * 15 = 91.5 Euro
        System.out.println( a1 + " owns " + a1.getEarnings( ) + " Euro" );
//      -------


//        final Title t1 = new Title( "The Hobbit", "An Unexpected Journey" );
//        final Title t2 = new Title( "Catcher in the Rye" );
//
//        System.out.println(t1.getTitle());
//        System.out.println(t2.getTitle());
//
//        final Author a1 = Author.JJR_Tolkien;
//        final Author a2 = Author.JD_Sallinger;
//
//        final Book b1 = new AudioBook(a1, t1, 1800.5);
//        final Book b2 = new Paperback( a2, t2, 100 );
//
//        System.out.println( b1.getAuthor( ) );
//        System.out.println( b1.getTitle( ) );
//        System.out.println( b1.getPrice( ) );
//        System.out.println( b1.getLength( ) );
//
//        System.out.println( b2.getAuthor( ) );
//        System.out.println( b2.getTitle( ) );
//        System.out.println( b2.getPrice( ) );
//        System.out.println( b2.getLength( ) );
//
//        System.out.println("----------------------");
//
//        System.out.println( "a1 attempting to buy b1..." );
//        a1.buy(b1);
//
//        System.out.println( "receiving €20.0..." );
//        a1.receive( 20.0 );
//        System.out.println( "second attempt to buy book: b1" );
//        System.out.println(a1.getOwnedBooks());
//        System.out.println(a1.getPublishedBooks());
//        a1.buy(b1);
//        System.out.println(a1.getOwnedBooks());
//        System.out.println(a1.getPublishedBooks());


    }
}





