package mouse;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class SimpleClickListener implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked аt " + e.getX() + "," + e.getY()); // коордитаты нажатия мыши
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
    }

}