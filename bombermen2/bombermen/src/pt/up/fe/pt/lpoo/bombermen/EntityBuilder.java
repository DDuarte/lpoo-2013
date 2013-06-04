package pt.up.fe.pt.lpoo.bombermen;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
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
            Bomb.Regions = TextureRegion.split(t, 18, 18);

        Bomb b = new Bomb(guid);
        b.setBounds(x, y, Constants.BOMB_WIDTH, Constants.BOMB_HEIGHT);

        return b;
    }

    public Player CreatePlayer(int guid, String name, float x, float y)
    {
        Texture t = _textureManager.Get("bomberman"); // 18 x 26

        if (Player.Regions == null)
            Player.Regions = TextureRegion.split(t, 18, 26);

        Player p = new Player(guid, name);
        p.setBounds(x, y, Constants.PLAYER_WIDTH, Constants.PLAYER_HEIGHT);

        return p;
    }

    public Wall CreateWall(int guid, int hitPoints, float x, float y)
    {
        Texture t = _textureManager.Get("wall"); // 16 x 16

        if (Wall.Regions == null)
            Wall.Regions = TextureRegion.split(t, 16, 16);

        Wall w = new Wall(guid, hitPoints);
        w.setBounds(x, y, Constants.WALL_WIDTH, Constants.WALL_HEIGHT);

        return w;
    }

    public PowerUp CreatePowerUp(int guid, Wall wall)
    {
        float x = wall.getX() + 0.1f * Constants.CELL_SIZE;
        float y = wall.getY() + 0.1f * Constants.CELL_SIZE;

        Texture t = _textureManager.Get("powerup"); // 16 x 16

        if (PowerUp.Regions == null)
            PowerUp.Regions = TextureRegion.split(t, 16, 16);

        PowerUp pu = new PowerUp(guid, MathUtils.random(0, PowerUp.NUMBER_OF_TYPES)); // @TODO: All power up types got the same probability to spawn. Maybe change that.
        pu.setBounds(x, y, Constants.POWER_UP_WIDTH, Constants.POWER_UP_HEIGHT);

        return pu;
    }

    public Explosion CreateExplosion(int guid, float x, float y, int direction, boolean end)
    {
        Texture t = _textureManager.Get("explosion"); // 16 x 16

        if (Explosion.Regions == null)
            Explosion.Regions = TextureRegion.split(t, 16, 16);

        Explosion e = new Explosion(guid, direction, end);
        e.setBounds(x, y, Constants.EXPLOSION_WIDTH, Constants.EXPLOSION_HEIGHT);

        return e;
    }
}
