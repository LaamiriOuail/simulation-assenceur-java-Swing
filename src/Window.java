import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Window extends JFrame {
    Window(int width,int height,String title,String icon,boolean fixed){
        this.setTitle(title);
        //set Icon to
        File iconFile = new File(icon);
        if(iconFile.exists()){
            ImageIcon  iconImage = new ImageIcon(icon);
            this.setIconImage(iconImage.getImage());
        }
        this.setSize(width,height);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        if(fixed){
            this.setResizable(false);
        }
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public Frame newFrame(int left,int top,int width,int height,String backgroundColor){
        Frame frame = new Frame(left,top,width,height,backgroundColor);
        this.add(frame);
        return frame;
    }
    public void Show(){
        this.setVisible(true);
    }
    public void close(){
        this.setVisible(false);
    }
    public JButton newButton(int left , int top,int width,int height,String text,String icon,String toolTip,boolean enable,String color,String backgroundColor,int fontSize,String fontFamily,boolean bold,boolean italic){
        JButton btn = new JButton();
        if(!"".equals(text)){
            btn.setText(text);
        }
        if(!"".equals(toolTip)){
            btn.setToolTipText(toolTip);
        }
        File iconFile = new File(icon);
        if(iconFile.exists()){
            ImageIcon  iconImage = new ImageIcon(icon);
            btn.setIcon(iconImage);
        }

        btn.setEnabled(enable);
        btn.setBounds(left,top,width,height);
        Color myColor =null;
        try {
            myColor = Color.decode(color);
        } catch (NumberFormatException e) {
            System.err.println("JButton::c::La chaîne de caractères n'est pas un code couleur valide.");
        }

        // Utilisation de la couleur dans votre application
        if (myColor != null) {
            btn.setForeground(myColor);
        }
        Color myBackgroundColor = null;
        try{
            myBackgroundColor = Color.decode(backgroundColor);
        }catch (NumberFormatException e){
            System.err.println("JButton::bgc::La chaîne de caractères n'est pas un code couleur valide.");
        }
        if(myBackgroundColor !=null){
            btn.setBackground(myBackgroundColor);
        }
        boolean isFontAvailable = false;
        String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String name : fontNames) {
            if (name.equals(fontFamily)) {
                isFontAvailable = true;
                break;
            }
        }

        // Utilisation de la police de caractères dans votre application
        if (isFontAvailable) {
            if(bold && italic){
                btn.setFont(new Font(fontFamily,Font.ITALIC+Font.BOLD,fontSize));
            }
            else if(bold){
                btn.setFont(new Font(fontFamily,Font.BOLD,fontSize));
            }
            else if(italic){
                btn.setFont(new Font(fontFamily,Font.ITALIC,fontSize));
            }else{
                btn.setFont(new Font(fontFamily,Font.PLAIN,fontSize));
            }

        } else {
            System.err.println("La police de caractères n'est pas disponible sur le système.");
        }
        this.add(btn);
        return btn;
    }
}
