package pt.up.fe.lpoo.bombermen.messages;

import pt.up.fe.lpoo.bombermen.ClientMessageHandler;

public class SMSG_DESTROY extends Message
{
    private static final long serialVersionUID = 1L;

    public final int Guid;

    public SMSG_DESTROY(int guid)
    {
        super(SMSG_DESTROY);
        Guid = guid;
    }

    @Override
    public String toString()
    {
        return "[SMSG_DESTROY - Guid: " + Guid + "]";
    }

    @Override
    public void Handle(ClientMessageHandler cmh)
    {
        cmh.SMSG_DESTROY_Handler(this);
    }
}
