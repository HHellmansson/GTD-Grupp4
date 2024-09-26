import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.util.ArrayList;

public class GUI {

    int countingClicks = 0; // Räknar när man trycker på Lägga till-knappen
    
    ArrayList<Integer> textField = new ArrayList<Integer>();
    ArrayList<Integer> taBort = new ArrayList<Integer>();
    ArrayList<Integer> checkbox = new ArrayList<Integer>();

    public GUI(){

        JFrame frame = new JFrame("Mitt första GUI");
        frame.setSize(400, 300);

        JLabel label = new JLabel("hello");
        JTextField textField = new JTextField("");

        JButton button = new JButton("+");
        button.addActionListener(e -> {
            ToDo.add(1);
            int size = ToDo.size();
            System.out.println(size); // göra methoder för när man trycker på knappen lägger till en textfield, knapp för att ta bort och checkbox. en method för varje
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



    // Metod som lyssnar på Lägga till-knapppen och skapar en ny rad för text, checkbox och Tabort-knapp.
    // public int addToDo(int antalKlick) {
    //     Läggatillknapp.addActionListener(e -> {
    //         countingClicks++;
    //         panel.add(textField);
    //         add checkbox
    //         panel.add(taBort-knapp);
    //         textField.add();
    //         taBort.add();
    //         checkbox.add();
               // Måste lägga till en rad i GridLayout också
    //         return countingClicks;
    //     }
    // }



}

//method för ta bort knappeen så den tar bort rutan.