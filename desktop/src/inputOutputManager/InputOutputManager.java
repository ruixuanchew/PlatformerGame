package inputOutputManager;

public class InputOutputManager {
    private Map map;
    private SoundPlayer bgMusic;

    public InputOutputManager() {
        map = new Map();
        bgMusic = new SoundPlayer();
    }

    public Map getMap() {
        return map;
    }

    public SoundPlayer getSoundPlayer() {
        return bgMusic;
    }
}
