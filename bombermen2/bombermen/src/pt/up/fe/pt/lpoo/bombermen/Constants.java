package pt.up.fe.pt.lpoo.bombermen;


public final class Constants
{
    // Window
    public static final String WINDOW_TITLE = "Bombermen";
    public static final int DEFAULT_WIDTH = 800;
    public static final int DEFAULT_HEIGHT = 480;
    public static final boolean USE_GL20 = true;

    // Control Pad
    public static final int DEFAULT_PAD_WIDTH = 200;
    public static final int DEFAULT_PAD_HEIGHT = 200;
    public static final float DEFAULT_PAD_BUTTON_SIZE_MULT = 2.f / 3.f;
    public static final boolean SHOW_PAD = false;

    // Game
    public static final int INIT_NUM_MAX_BOMBS = 1;
    public static final int INIT_BOMB_RADIUS = 2;
    public static final int DEFAULT_BOMB_TIMER = 3; // 3 seconds
    public static final int DEFAULT_BOMB_STRENGTH = 1; // 1 hp damage
    public static final int CELL_SIZE = 36; // px

    // Maps
    public static final String DEFAULT_MAP_FILE_CHARSET = "US-ASCII";
    public static final float WALL_CHANCE = 0.1f;
    public static final float INIT_PLAYER_SPEED = 108f / 1000f;

    // Sizes
    public static final float PLAYER_WIDTH = 18.f * CELL_SIZE * 0.8f / 26f;
    public static final float PLAYER_HEIGHT = CELL_SIZE * 0.8f;
    
    public static final float BOMB_WIDTH = 0.9f * CELL_SIZE;
    public static final float BOMB_HEIGHT = BOMB_WIDTH;
    
    public static final float EXPLOSION_WIDTH = 0.9f * CELL_SIZE;
    public static final float EXPLOSION_HEIGHT = EXPLOSION_WIDTH;
    
    public static final float POWER_UP_WIDTH = 0.9f * CELL_SIZE;
    public static final float POWER_UP_HEIGHT = POWER_UP_WIDTH;
    
    public static final float WALL_WIDTH = CELL_SIZE;
    public static final float WALL_HEIGHT = WALL_WIDTH;
    
    private Constants()
    {
    }
}
