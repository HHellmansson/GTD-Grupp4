import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.util.ArrayList;

public class GUI {

    ArrayList<Integer> ToDo = new ArrayList<Integer>();

    public GUI(){

        JFrame frame = new JFrame("Mitt första GUI");
        frame.setSize(400, 300);

        JLabel label = new JLabel("hello");
        JTextField textField = new JTextField("");

        JButton button = new JButton("+");
        button.addActionListener(e -> {
            ToDo.add(1);
            int size = ToDo.size();
            System.out.println(size);
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));
        panel.add(label);
        panel.add(textField);
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);
    
    }
    public static void main(String[] args) {
        new GUI();
    }
}