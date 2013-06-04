package pt.up.fe.pt.lpoo.bombermen;

import pt.up.fe.pt.lpoo.utils.TextureSplitter;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.MathUtils;

public class EntityBuilder
{
    private TextureManager _textureManager;

    public EntityBuilder(TextureManager tm)
    {
        _textureManager = tm;
    }

    public Bomb CreateBomb(int guid, float x, float y)
    {
        Texture t = _textureManager.Get("bomb"); // 18 x 18
        
        if (Bomb.Regions == null)
            Bomb.Regions = TextureSplitter.SplitTexture(t, 1, 3);

        Bomb b = new Bomb(guid);
        b.setBounds(x, y, Constants.CELL_SIZE * 0.9f, Constants.CELL_SIZE * 0.9f);

        return b;
    }

    public Player CreatePlayer(int guid, String name, float x, float y)
    {
        Texture t = _textureManager.Get("bomberman"); // 18 x 26
        
        if (Player.Regions == null)
            Player.Regions = TextureSplitter.SplitTexture(t, 1, 8);

        Player p = new Player(guid, name);
        p.setBounds(x, y, 18.f * Constants.CELL_SIZE * 0.9f / 26, Constants.CELL_SIZE * 0.9f);

        return p;
    }

    public Wall CreateWall(int guid, int hitPoints, float x, float y)
    {
        Texture t = _textureManager.Get("wall"); // 16 x 16
        
        if (Wall.Regions == null)
            Wall.Regions = TextureSplitter.SplitTexture(t, 1, 4);

        Wall w = new Wall(guid, hitPoints);
        w.setBounds(x, y, Constants.CELL_SIZE, Constants.CELL_SIZE);

        return w;
    }

    public PowerUp CreatePowerUp(int guid, Wall wall)
    {
        float x = wall.getX() + 0.1f * Constants.CELL_SIZE;
        float y = wall.getY() + 0.1f * Constants.CELL_SIZE;

        Texture t = _textureManager.Get("powerup"); // 16 x 16
        
        if (PowerUp.Regions == null)
            PowerUp.Regions = TextureSplitter.SplitTexture(t, 2, 7);

        PowerUp pu = new PowerUp(guid, MathUtils.random(0, PowerUp.NUMBER_OF_TYPES)); // @TODO: All power up types got the same probability to spawn. Maybe change that.
        pu.setBounds(x, y, Constants.CELL_SIZE * 0.9f, Constants.CELL_SIZE * 0.9f);

        return pu;
    }

    public Explosion CreateExplosion(int guid, float x, float y)
    {
        Texture t = _textureManager.Get("explosion"); // 16 x 16
        
        if (Explosion.Regions == null)
            Explosion.Regions = TextureSplitter.SplitTexture(t, 5, 9);

        Explosion e = new Explosion(guid);
        e.setBounds(x, y, Constants.CELL_SIZE * 0.9f, Constants.CELL_SIZE * 0.9f);

        return e;
    }
}
