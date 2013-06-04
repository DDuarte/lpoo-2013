package pt.up.fe.pt.lpoo.bombermen;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class Bombermen2 implements ApplicationListener
{
    private Stage _stage;
    private Game _game;
    private Input _input;
    private ControlPad _controlPad;

    @Override
    public void create()
    {
        _stage = new Stage();
        _game = new Game(_stage);

        _input = new Input(_game, _stage.getCamera());
        //Gdx.input.setInputProcessor(_stage);
        Gdx.input.setInputProcessor(_input);

        if (Gdx.app.getType() == ApplicationType.Android || Constants.SHOW_PAD)
        {
            _controlPad = new ControlPad();
            _controlPad.SetSize(Constants.DEFAULT_PAD_WIDTH, Constants.DEFAULT_PAD_HEIGHT);
            _input.SetControlPad(_controlPad);
        }
    }

    @Override
    public void resize(int width, int height)
    {
        _stage.setViewport(width, height, true);
        _stage.getCamera().translate(-200, 0, 0);
    }

    @Override
    public void render()
    {
        Gdx.gl.glClearColor(16f / 255, 120f / 255, 48f / 255, 1);
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

        int dt = (int) (Gdx.graphics.getRawDeltaTime() * 1000.f);
        _game.Update(/*dt*/);

        _stage.act(Gdx.graphics.getDeltaTime());
        _stage.draw();

        if (_controlPad != null)
        {
            _stage.getSpriteBatch().setProjectionMatrix(_stage.getCamera().combined);
            _stage.getSpriteBatch().begin();
            _controlPad.draw(_stage.getSpriteBatch());
            _stage.getSpriteBatch().end();
        }
    }

    @Override
    public void pause()
    {
    }

    @Override
    public void resume()
    {
    }

    @Override
    public void dispose()
    {
        _stage.dispose();
    }
}