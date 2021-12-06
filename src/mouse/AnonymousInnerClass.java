package mouse;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(400, 300);
        jf.setVisible(true);
// передаем в качестве слушателя объект анонимного класса
//                      =1= =2=                 =3= =4=
        jf.addMouseMotionListener(new MouseMotionListener() {
            //    =5=
            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println(e.getX() + " " + e.getY());
            }

            //    =6=
            @Override
            public void mouseDragged(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }
//=7=
        });
    }
}
