package pt.up.fe.lpoo.bombermen.messages;

public class CMSG_PLACE_BOMB extends Message
{
    private static final long serialVersionUID = 1L;

    public CMSG_PLACE_BOMB()
    {
        super(CMSG_PLACE_BOMB);
    }

    @Override
    public String toString()
    {
        return "[CMSG_PLACE_BOMB]";
    }
}