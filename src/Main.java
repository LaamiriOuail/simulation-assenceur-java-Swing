import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Window window = new Window(750,650,"Assenceur","",true);
        Frame frame1 = window.newFrame(100,10,200,500,"#54b391");
        Assenceur1 assenceur1 = new Assenceur1(frame1);
        FrameChoixEtage frameChoixEtage1 = new FrameChoixEtage(window,assenceur1,10);
        Thread ass1Thread = new Thread(assenceur1);
        ass1Thread.start();
        Frame frame2 = window.newFrame(400,10,200,500,"#54b391");
        Assenceur1 assenceur2 = new Assenceur1(frame2);
        FrameChoixEtage frameChoixEtage2 = new FrameChoixEtage(window,assenceur2,670);
        Thread ass2Thread = new Thread(assenceur2);
        ass2Thread.start();
        window.Show();
    }
}