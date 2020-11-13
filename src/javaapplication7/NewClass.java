/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.io.File;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author User
 */
public class NewClass {
  void playMusic(String musicLocation){
    InputStream music;
    try{
        File musicPath =new File(musicLocation);
        if(musicPath.exists())
        {
        AudioInputStream audioInput=AudioSystem.getAudioInputStream(musicPath);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInput);
        clip.start();
        clip.loop(Clip.LOOP_CONTINUOUSLY);
                }
        else{System.out.println("000");}
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
    }    
    
    }
       
}
