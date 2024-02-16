package inputOutputManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class InputHandler {
    public boolean LeftKey() {
        return Gdx.input.isKeyPressed(Keys.LEFT);
    }

    public boolean RightKey() {
        return Gdx.input.isKeyPressed(Keys.RIGHT);
    }

    public boolean SpaceKey() {
        return Gdx.input.isKeyPressed(Keys.SPACE);
    }
}