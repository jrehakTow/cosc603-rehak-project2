package edu.towson.cis.cosc603.project2.monopoly;

// TODO: Auto-generated Javadoc
/**
 * The Class Cell.
 */
public abstract class Cell {
	
	/** The name. */
	private String name;
	
	/** The owner. */
	protected Player theOwner;

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the owner.
	 *
	 * @return the owner
	 */
	public Player getTheOwner() {
		return theOwner;
	}
	
	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public int getPrice() {
		return 0;
	}

	/**
	 * Play action.
	 */
	public abstract void playAction();

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	void setName(String name) {
		this.name = name;
	}

	/**
	 * Sets the owner.
	 *
	 * @param owner the new owner
	 */
	public void setTheOwner(Player owner) {
		this.theOwner = owner;
	}
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return name;
    }
}
