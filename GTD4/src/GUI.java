import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
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
        frame.setSize(600, 300);

        // Använd GridLayout för att hantera rader med komponenter
        //toDoPanel.setLayout(new FlowLayout()); // Dynamiskt antal rader, 3 kolumner (Textfält, Checkbox, Ta bort-knapp)

        läggTillKnapp.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e){
                addToDo();
            }
        });

        startPanel.add(label);
        startPanel.add(läggTillKnapp);
        startPanel.setLayout(new BoxLayout(startPanel, BoxLayout.Y_AXIS));


        frame.add(startPanel, "North");
        frame.add(toDoPanel, "Center");

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Metod som lägger till en ny rad med textfält, checkbox och ta bort-knapp
    private void addToDo() {
        countingClicks++;

        // Skapa nya komponenter för raden
        JPanel ToDo = new JPanel();
        ToDo.setLayout(new FlowLayout());
        JTextField nrClicks = new JTextField(25);
        ToDo.add(nrClicks);
        JCheckBox checkBox = new JCheckBox();
        ToDo.add(checkBox);
        JButton removeButton = new JButton("Ta bort");
        removeButton.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e){
                startPanel.remove(ToDo);
                startPanel.revalidate();
                startPanel.repaint();
            }
        });
        ToDo.add(removeButton);

        startPanel.add(ToDo);
        startPanel.revalidate();


        // Skapa och lagra en ny rad (ToDoItem)
        //ToDoItem newItem = new ToDoItem(nrClicks, checkBox);
        //toDoItems.add(newItem);

        // Lägg till komponenterna i panelen
        //toDoPanel.add(nrClicks);
        //toDoPanel.add(checkBox);
        //toDoPanel.add(removeButton);

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
        SwingUtilities.invokeLater(new Runnable() {
            @Override public void run(){
                new GUI();
            }
        });
    }
}
