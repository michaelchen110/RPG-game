package rpg;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * Java
 * 
 * @author xqh
 *
 */
public class MusicPlayer {
    private String musicName;
    private AudioPlayWave audioPlayWave;

    public MusicPlayer()
    {
        musicName = "sound/test.wav";
    }
    
    public MusicPlayer(String name)
    {
        musicName = name;
    }

    public void play()
    {
        audioPlayWave = new AudioPlayWave(musicName);
        audioPlayWave.start(); // 
    }
    
    public void cycle()
    {
        Thread cyc = new Thread (new Runnable() {
            public void run()
            {
                while (true) {
                    audioPlayWave = new AudioPlayWave(musicName);
                    audioPlayWave.start(); // 
                    try {
                        audioPlayWave.join();
                    } 
                    catch(InterruptedException e) { 
                        e.printStackTrace(); 
                    }     
                }
            }
        });
        cyc.start();
    }
    

    public void stop()
    {
        audioPlayWave.isStop();
    }
}

/**
 * 
 * 
 * @author xqh
 *
 */
class AudioPlayWave extends Thread {
    private String fileName; // 
    private Position curPosition; //
    private final int EXTERNAL_BUFFER_SIZE = 524288; // 128k
    private boolean isContinue = true;


    enum Position { //
        LEFT, RIGHT, NORMAL
    };

    //

    public void isStop()
    {
        isContinue = false;
    }
    
    public AudioPlayWave(String wavFile) {
        this.fileName = wavFile;
        curPosition = Position.NORMAL;
    }

    public void run() {
        File soundFile = new File(fileName); //
        if (!soundFile.exists()) {
            System.err.println("Wave file not found:" + fileName);
            return;
        }

        AudioInputStream audioInputStream = null; //
        try {
            audioInputStream = AudioSystem.getAudioInputStream(soundFile); //
        } catch (UnsupportedAudioFileException e1) {
            e1.printStackTrace();
            return;
        } catch (IOException e1) {
            e1.printStackTrace();
            return;
        }

        AudioFormat format = audioInputStream.getFormat(); //
        SourceDataLine auline = null; //
        DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);

        try {
            auline = (SourceDataLine) AudioSystem.getLine(info);
            auline.open(format);
        } catch (LineUnavailableException e) {
            e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        if (auline.isControlSupported(FloatControl.Type.PAN)) {
            FloatControl pan = (FloatControl) auline
                .getControl(FloatControl.Type.PAN);
            if (curPosition == Position.RIGHT)
                pan.setValue(1.0f);
            else if (curPosition == Position.LEFT)
                pan.setValue(-1.0f);
        }

        auline.start();
        int nBytesRead = 0;
        byte[] abData = new byte[EXTERNAL_BUFFER_SIZE];

        try {
            while (nBytesRead != -1) {
                if (isContinue) {
                    nBytesRead = audioInputStream.read(abData, 0, abData.length);
                    if (nBytesRead >= 0)
                        auline.write(abData, 0, nBytesRead);
               } 
               else 
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } finally {
            auline.drain();
            auline.close();
        }
    }
}
