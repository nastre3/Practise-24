package mouse;

import javax.swing.JFrame;


public class Main {
    public static void main(String[] args) {
        JFrame jf = new JFrame(); // создаем окно
        jf.setSize(400, 300); // устанавливаем ему размеры
        jf.addMouseListener(new SimpleClickListener());
        jf.setVisible(true); // и показываем его
    }
}
