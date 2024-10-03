import javax.swing.*;
import java.awt.GridLayout;
import java.util.ArrayList;

public class GUI {

    int countingClicks = 0; // Håller koll på hur många gånger man tryckt på Lägga till-knappen

    // Lista för att hålla alla rader med komponenter
    ArrayList<ToDoItem> toDoItems = new ArrayList<>();

    JLabel label = new JLabel("Att göra-lista");
    JButton läggTillKnapp = new JButton("Lägg till");
    JPanel startPanel = new JPanel();
    JPanel toDoPanel = new JPanel();

    public GUI() {

        JFrame frame = new JFrame("Mitt första GUI");
        frame.setSize(400, 300);

        // Använd GridLayout för att hantera rader med komponenter
        toDoPanel.setLayout(new GridLayout(0, 3)); // Dynamiskt antal rader, 3 kolumner (Textfält, Checkbox, Ta bort-knapp)

        läggTillKnapp.addActionListener(e -> {
            addToDo();
            frame.revalidate(); // Uppdaterar GUI efter en ny komponent har lagts till
        });

        startPanel.add(label);
        startPanel.add(läggTillKnapp);

        frame.add(startPanel, "North");
        frame.add(toDoPanel, "Center");

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Metod som lägger till en ny rad med textfält, checkbox och ta bort-knapp
    public void addToDo() {
        countingClicks++;

        // Skapa nya komponenter för raden
        JTextField nrClicks = new JTextField(25);
        JCheckBox checkBox = new JCheckBox();
        JButton button = new JButton("Ta bort");

        // Skapa och lagra en ny rad (ToDoItem)
        ToDoItem newItem = new ToDoItem(nrClicks, checkBox);
        toDoItems.add(newItem);

        // Lägg till komponenterna i panelen
        toDoPanel.add(nrClicks);
        toDoPanel.add(checkBox);
        toDoPanel.add(button);

        // Lyssnare för "Ta bort"-knappen, tar bort raden från både GUI och listan
        
    }

    // Metod som tar bort en rad från både panelen och listan
   
    // Klass för att representera en rad med komponenter
    class ToDoItem {
        JTextField textField;
        JCheckBox checkBox;
        

        ToDoItem(JTextField textField, JCheckBox checkBox) {
            this.textField = textField;
            this.checkBox = checkBox;
            
        }
    }

    public static void main(String[] args) {
        new GUI();
    }
}
