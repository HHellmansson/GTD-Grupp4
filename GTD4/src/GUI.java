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
    ArrayList<Integer> taBort = new ArrayList<Integer>();             //Bättre att göra listor med objekt där man kan spara textfield, checkbox och knappar istället för bara ints?
    ArrayList<Integer> checkbox = new ArrayList<Integer>();

    JLabel label = new JLabel("Att göra-lista");
    JTextField textField = new JTextField("");
    JCheckBox check = new JCheckBox(); 
    JButton taBortKnapp = new JButton("Ta bort");
    JButton läggTillKnapp = new JButton("Lägg till");
    JPanel startPanel = new JPanel();
    JPanel toDoPanel = new JPanel();

    public GUI(){

        JFrame frame = new JFrame("Mitt första GUI");
        frame.setSize(400, 300);

        läggTillKnapp.addActionListener(e -> {
            addToDo(countingClicks);
            // toDoPanel.setLayout(new GridLayout(countingClicks + 1, 3));     Använda?
            frame.add(toDoPanel);
        });

        startPanel.add(label);
        startPanel.add(läggTillKnapp);

        frame.add(startPanel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    
    public static void main(String[] args) {
        new GUI();
    }


    // // Metod som lyssnar på Lägga till-knapppen och skapar en ny rad för text, checkbox och Tabort-knapp.
    public int addToDo(int antalKlick) {
            countingClicks++;
            JTextField nrClicks = new JTextField(25); 
            JCheckBox checkB = new JCheckBox();                  
            JButton butt = new JButton("Ta bort");         
            toDoPanel.add(nrClicks);
            toDoPanel.add(checkB);
            toDoPanel.add(butt);
            textFieldArray.add(countingClicks);
            checkbox.add(countingClicks);
            taBort.add(countingClicks);    
            return countingClicks;
    }

}

//method för ta bort knappeen så den tar bort rutan.