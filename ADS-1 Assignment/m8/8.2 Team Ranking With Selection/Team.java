/**
 * Class for team.
 */
class Team implements Comparable<Team> {
    /**
     * The team class implements the interface
     * of the Comparable function.
     */
    private String country;
    /**
     * team wins.
     */
    private int wins;
    /**
     * team loses.
     */
    private int loses;
    /**
     * team draws.
     */
    private int draws;
    /**
     * Constructs the object.
     *
     * @param      country  The country
     * @param      wins     The wins
     * @param      loses    The loses
     * @param      draws    The draws
     */
    Team(final String country1, final int wins1, final int loses1,
         final int draws1) {
        this.country = country1;
        this.wins = wins1;
        this.loses = loses1;
        this.draws = draws1;
    }
    /**
     * Gets country.
     *
     * @return     country.
     */
    public String getcountry() {
        return country;
    }
    /**
     * Sets country.
     *
     * @param      country  The country.
     */
    public void setcountry(final String country1) {
        this.country = country1;
    }
    /**
     * Get wins.
     *
     * @return     wins.
     */
    public int getwins() {
        return wins;
    }
    /**
     * Set wins.
     *
     * @param      wins  The wins.
     */
    public void setwins(final int wins1) {
        this.wins = wins1;
    }
    /**
     * Get loses.
     *
     * @return     loses.
     */
    public int getloses() {
        return loses;
    }
    /**
     * Set loses.
     *
     * @param      loses  The loses.
     */
    public void setloses(final int loses1) {
        this.loses = loses1;
    }
    /**
     * Get draws.
     *
     * @return     draws.
     */
    public int getdraws() {
        return draws;
    }
    /**
     * Set draws.
     *
     * @param      draws  The draws.
     */
    public void setdraws(final int draws1) {
        this.draws = draws1;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return this.country;
    }
    /**
     * comapares two objects in the given condition.
     *
     * @param      that  The that
     *
     * @return     { description_of_the_return_value }
     */
    public int compareTo(Team that) {
        Team a = this;
        if (a.wins > that.wins) {
            return -1;
        }
        if (a.wins < that.wins) {
            return 1;
        }

        if (a.loses > that.loses) {

            return 1;
        }
        if (a.loses < that.loses) {

            return -1;
        }
        if (a.draws > that.draws) {
            return -1;
        }
        if (a.draws < that.draws) {
            return 1;
        }
        return 0;
    }
}
