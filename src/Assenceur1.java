import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;

public class Assenceur1 extends JButton implements Runnable {
    private int etage=1;
    public Assenceur1(@NotNull Frame parent){
        this.setBounds(0,450,200,50);
        this.setBackground(Color.black);
        this.setForeground(Color.YELLOW);
        this.setEnabled(false);
        parent.add(this);
    }
    public void setEtage(int etage){
        this.etage=etage;
    }
    public void toEtage(int etage) {
        boolean wssalty=false;
        int etagey=etageY(etage);
        if(etagey==-1){
            wssalty=true;
        }
        this.setText("Etage "+Integer.toString(etage));
        while(!wssalty){
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(this.getY()>etagey){
                this.setLocation(0,this.getY()-1);
            }else if(this.getY()<etagey){
                this.setLocation(0,this.getY()+1);
            }else{
                wssalty=true;
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public int etageY(int etage){
        int etayY;
        switch (etage){
            case 1 :
                etayY=450;
                break;
            case 2 :
                etayY=400;
                break;
            case 3 :
                etayY=350;
                break;
            case 4 :
                etayY=300;
                break;
            case 5 :
                etayY=250;
                break;
            case 6 :
                etayY=200;
                break;
            case 7 :
                etayY=150;
                break;
            case 8 :
                etayY=100;
                break;
            case 9 :
                etayY=50;
                break;
            case 10 :
                etayY=00;
                break;
            default:
                etayY=-1;
        }
        return etayY;
    }

    @Override
    public void run() {
        while(true){
            toEtage(this.etage);
        }

    }
}
