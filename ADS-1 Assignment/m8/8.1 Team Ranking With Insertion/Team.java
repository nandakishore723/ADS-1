/**
 * Class for team.
 */
class Team implements Comparable {
	private String team;
	private int wins;
	private int losses;
	private int draws;

	/**
	 * Constructs the object.
	 *
	 * @param      team    The team
	 * @param      wins    The wins
	 * @param      losses  The losses
	 * @param      draws   The draws
	 */
	Team(final String team, final int wins, final int losses, final int draws) {
		this.team = team;
		this.wins = wins;
		this.losses = losses;
		this.draws = draws;
	}

	/**
	 * Gets the team.
	 *
	 * @return     The team.
	 */
	public String getTeam() {
		return this.team;
	}

	/**
	 * Sets the team.
	 *
	 * @param      team  The team
	 */
	public void setTeam(final String team) {
		this.team = team;
	}

	/**
	 * Gets the wins.
	 *
	 * @return     The wins.
	 */
	public int getWins() {
		return this.wins;
	}

	/**
	 * Sets the wins.
	 *
	 * @param      wins  The wins
	 */
	public void setWins(final int wins) {
		this.wins = wins;
	}

	/**
	 * Gets the losses.
	 *
	 * @return     The losses.
	 */
	public int getLosses() {
		return this.losses;
	}

	/**
	 * Sets the losses.
	 *
	 * @param      losses  The losses
	 */
	public void setLosses(final int losses) {
		this.losses = losses;
	}

	/**
	 * Gets the draws.
	 *
	 * @return     The draws.
	 */
	public int getDraws() {
		return this.draws;
	}

	/**
	 * Sets the draws.
	 *
	 * @param      draws  The draws
	 */
	public void setDraws(final int draws) {
		this.draws = draws;
	}

	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString() {
		return this.getTeam();
	}

	/**
	 * { function_description }
	 *
	 * @param      b     { parameter_description }
	 *
	 * @return     { description_of_the_return_value }
	 */
	public int compareTo(Object b) {
		Team that = (Team) b;
		if (this.getWins() > that.getWins())
			return -1;
		if (this.getWins() < that.getWins())
			return +1;
		if (this.getLosses() < that.getLosses())
			return -1;
		if (this.getLosses() > that.getLosses())
			return +1;
		if (this.getDraws() > that.getDraws())
			return -1;
		if (this.getDraws() < that.getDraws())
			return +1;
		return 0;
	}
}

