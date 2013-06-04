package pt.up.fe.pt.lpoo.bombermen;

import pt.up.fe.pt.lpoo.bombermen.messages.SMSG_SPAWN;
import pt.up.fe.pt.lpoo.bombermen.messages.SMSG_SPAWN_WALL;

import com.badlogic.gdx.math.Vector2;

public class Wall extends Entity
{
    private static CollisionHandler<Wall> cHandler = new CollisionHandler<Wall>()
    {
    };

    private int _hp;

    public Wall(int guid, int hp, Vector2 pos, BombermenServer sv)
    {
        super(TYPE_WALL, guid, pos, sv);

        _hp = hp;
    }

    @Override
    public SMSG_SPAWN GetSpawnMessage()
    {
        return new SMSG_SPAWN_WALL(GetGuid(), _hp, GetX(), GetY());
    }

    public static final Vector2 Size = new Vector2(Constants.WALL_WIDTH, Constants.WALL_HEIGHT);

    @Override
    public Vector2 GetSize()
    {
        return Size;
    }

    @Override
    public void OnCollision(Entity e)
    {
        cHandler.OnCollision(this, e);
    }

    @Override
    public void Update(int diff)
    {
        // TODO Auto-generated method stub
        
    }

}
