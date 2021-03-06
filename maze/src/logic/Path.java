package logic;

/**
 * Represents a pathway that can be transversed.
 */
public class Path extends InanimatedObject
{
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new path.
     */
    public Path()
    {
        super(InanimatedObjectType.Path);
    }

    /* (non-Javadoc)
     * @see logic.WorldObject#GetSymbol()
     */
    @Override
    public char GetSymbol()
    {
        return ' ';
    }
}
