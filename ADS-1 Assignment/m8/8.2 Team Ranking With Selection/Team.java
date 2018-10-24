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
    Team(final String country, final int wins, final int loses, final int draws) {
        this.country = country;
        this.wins = wins;
        this.loses = loses;
        this.draws = draws;
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
    public void setcountry(final String country) {
        this.country = country;
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
    public void setwins(int wins) {
        this.wins = wins;
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
    public void setloses(int loses) {
        this.loses = loses;
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
    public void setdraws(int draws) {
        this.draws = draws;
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
        if (a.wins > that.wins) return -1;
        if (a.wins < that.wins) return 1;
        if (a.loses > that.loses) return 1;
        if (a.loses < that.loses) return -1;
        if (a.draws > that.draws) return -1;
        if (a.draws < that.draws) return 1;
        return 0;
    }
}
