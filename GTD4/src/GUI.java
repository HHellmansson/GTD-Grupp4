import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.util.ArrayList;

public class GUI {

    int countingClicks = 0; // Håller koll på hur många gånger man tryckt på Lägga till-knappen
    
    ArrayList<Integer> textFieldArray = new ArrayList<Integer>();
    ArrayList<Integer> taBort = new ArrayList<Integer>();
    ArrayList<Integer> checkbox = new ArrayList<Integer>();

    JLabel label = new JLabel("hello");
    JTextField textField = new JTextField("");
    JCheckBox check = new JCheckBox(); 
    JButton button = new JButton("+");
    JPanel panel = new JPanel();

    public GUI(){

        JFrame frame = new JFrame("Mitt första GUI");
        frame.setSize(400, 300);

        button.addActionListener(e -> {
            ToDo.add(1);
            int size = ToDo.size();
            System.out.println(size); // göra methoder för när man trycker på knappen lägger till en textfield, knapp för att ta bort och checkbox. en method för varje
        });

        panel.setLayout(new GridLayout(1, 3));
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(check);

        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    
    public static void main(String[] args) {
        new GUI();
    }


    // // Metod som lyssnar på Lägga till-knapppen och skapar en ny rad för text, checkbox och Tabort-knapp.
    //         // Gör detta utanför och kalla på metoden ---->   Läggatillknapp.addActionListener(e -> {
    // public int addToDo(int antalKlick, ArrayList<Integer> text, ArrayList<Integer> taBort, ArrayList<Integer> checkb) {
    //         countingClicks++;
    //         panel.add(textField);
    //         panel.add(check);
    //         panel.add(button);
    //         textFieldArray.add(1);
    //         checkbox.add(1);
    //         taBort.add(1);
    //            //Lägga till en rad i Gridlayout utanför metod så man slipper importera argument osv?
    //         return countingClicks;
    // }

}

//method för ta bort knappeen så den tar bort rutan.