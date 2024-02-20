package inputOutputManager;

/**
 * InputOutputManager class is responsible for managing the input and output of the game. It
 * initializes the sound player and input handler.
 */

public class InputOutputManager {

    private SoundPlayer bgMusic;
    private InputHandler inputHandler;

    public InputOutputManager() {
        bgMusic = new SoundPlayer();
        inputHandler = new InputHandler();
    }

    public SoundPlayer getBgMusic() {
        return bgMusic;
    }

    public InputHandler getInputHandler() {
        return inputHandler;
    }
}
