/**
 * Class for team.
 */
class Team implements Comparable<Team> {
    /**The Team class also implements the interface
    of the Comparable class.**/
    private String country;
    /**
     * { var_description }.
     */
    private int wins;
    /**
     * { var_description }.
     */
    private int loses;
    /**
     * { var_description }.
     */
    private int draws;
    /**
     * Constructs the object.
     *
     * @param      country1  The countryT
     * @param      wins1     The wins
     * @param      loses1    The loses
     * @param      draws1    The draws
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
     * @param      country1  The country.
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
     * @param      wins1  The wins.
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
     * @param      loses1  The loses.
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
     * @param      draws1  The draws.
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
    public int compareTo(final Team that) {
        Team a = this;
        if (a.wins > that.wins) {

            return 1;
        }
        if (a.wins < that.wins) {

            return -1;
        }
        if (a.loses > that.loses) {

            return -1;
        }
        if (a.loses < that.loses) {

            return 1;
        }
        if (a.draws > that.draws) {

            return 1;
        }
        if (a.draws < that.draws) {

            return -1;
        }
        return 0;
    }
}
