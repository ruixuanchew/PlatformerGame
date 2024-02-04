package inputOutputManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;

public class SoundPlayer {
    private Music bgMusic;

    public SoundPlayer() {
        bgMusic = Gdx.audio.newMusic(Gdx.files.internal("Pixelland.mp3"));
        bgMusic.setLooping(true);
        bgMusic.play();
        bgMusic.setVolume(0.3f);
    }
}