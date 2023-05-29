import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameChoixEtage {
    FrameChoixEtage(Window parent,Assenceur1 ass,int left){
        JButton btn1 = parent.newButton(left,460,50,50,"1","","",true,"#fff878","#000178",9,"",true,true);
        JButton btn2 = parent.newButton(left,410,50,50,"2","","",true,"#fff878","#000178",15,"",true,true);
        JButton btn3 = parent.newButton(left,360,50,50,"3","","",true,"#fff878","#000178",15,"",true,true);
        JButton btn4 = parent.newButton(left,310,50,50,"4","","",true,"#fff878","#000178",15,"",true,true);
        JButton btn5 = parent.newButton(left,260,50,50,"5","","",true,"#fff878","#000178",15,"",true,true);
        JButton btn6 = parent.newButton(left,210,50,50,"6","","",true,"#fff878","#000178",15,"",true,true);
        JButton btn7 = parent.newButton(left,160,50,50,"7","","",true,"#fff878","#000178",15,"",true,true);
        JButton btn8 = parent.newButton(left,110,50,50,"8","","",true,"#fff878","#000178",15,"",true,true);
        JButton btn9 = parent.newButton(left,60,50,50,"9","","",true,"#fff878","#000178",15,"",true,true);
        JButton btn10 = parent.newButton(left,10,50,50,"10","","",true,"#fff878","#000178",15,"",true,true);

        btn1.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {ass.setEtage(1);}});
        btn2.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {ass.setEtage(2);}});
        btn3.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {ass.setEtage(3);}});
        btn4.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {ass.setEtage(4);}});
        btn5.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {ass.setEtage(5);}});
        btn6.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {ass.setEtage(6);}});
        btn7.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {ass.setEtage(7);}});
        btn8.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {ass.setEtage(8);}});
        btn9.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {ass.setEtage(9);}});
        btn10.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {ass.setEtage(10);}});
    }
}
