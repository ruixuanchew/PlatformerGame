package inputOutputManager;

public class InputOutputManager {
    private Map map;
    private SoundPlayer bgMusic;
    private InputHandler inputHandler;

    public InputOutputManager() {
        map = new Map();
        bgMusic = new SoundPlayer();
        inputHandler = new InputHandler();
    }

    public Map Map() {
        return map;
    }

    public SoundPlayer backgroundMusic() {
        return bgMusic;
    }
    
    public InputHandler InputHandler() {
        return inputHandler;
    }
}
