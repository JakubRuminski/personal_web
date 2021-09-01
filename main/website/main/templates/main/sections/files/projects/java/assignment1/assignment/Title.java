
/** Creates instance of Title with [ getTitle ] behaviour.
 *
 * @author Jakub Ruminski
 *
 * */
public class Title implements Abstract_Title{
    private final Abstract_Title title;  // stores delegate

    /**
     * Creates instance of Title.
     *
     * @param title     The main title.
     * @param subtitle  The subtitle.
     */
    public Title( final String title, final String subtitle ) {
        this.title = new ConcreteSubtitle( title, subtitle );
    }

    /**
     * Creates instance of Title
     *
     * @param title The main title
     */
    public Title( final String title) {
        this.title = new ConcreteTitle( title );
    }

    /**
     * Acts as delegator to public class Title.
     *
     */
    private static class ConcreteTitle implements Abstract_Title{
        private final String title;

        /**
         * creates instance of ConcreteTitle.
         *
         * @param title The main title.
         */
        private ConcreteTitle( final String title ) {
            this.title = title;
        }

        /**
         * Implements getTitle from Abstract_Title interface.
         *
         * @return returns the title.
         */
        @Override
        public final String getTitle( ) {
            return this.title;
        }
    }

    /**
     * Acts as delegator to public class Title.
     *
     */
    private static class ConcreteSubtitle implements Abstract_Title{
        private final String title;
        private final String subtitle;

        /**
         * creates instance of ConcreteSubtitle.
         *
         * @param title     The main title.
         * @param subtitle  The subtitle.
         */
        private ConcreteSubtitle( final String title, final String subtitle ) {
            this.title = title;
            this.subtitle = subtitle;
        }

        /**
         * Implements getTitle from Abstract_Title interface.
         *
         * @return returns title and the subtitle.
         */
        @Override
        public final String getTitle( ) {
            return this.title + " / " + this.subtitle;
        }
    }

    /**
     * Implements getTitle from Abstract_Title interface.
     *
     * @return returns the entire title.
     */
    @Override
    public final String getTitle( ) {
        return title.getTitle();
    }
}
