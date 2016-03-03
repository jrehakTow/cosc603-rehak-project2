package edu.towson.cis.cosc603.project2.monopoly;

// TODO: Auto-generated Javadoc
/**
 * The Class CardCell.
 * This class defines the cardcell
 */
public class CardCell extends Cell {
    
    /** The type. */
    private int type;
	/** The available. */
	private boolean available = true;
    
    /**
     * Instantiates a new card cell.
     *
     * @param type the type
     * @param name the name
     */
    public CardCell(int type, String name) {
        setName(name);
        this.type = type;
    }
    
    /* (non-Javadoc)
     * @see edu.towson.cis.cosc442.project1.monopoly.Cell#playAction()
     */
    public void playAction() {
    }
    
    /**
     * Gets the type.
     *
     * @return the type
     */
    public int getType() {
        return type;
    }

	/**
	 * Checks if is available.
	 *
	 * @return true, if is available
	 */
	public boolean isAvailable() {
		return available;
	}

	/**
	 * Sets the available.
	 *
	 * @param available the new available
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}
}
