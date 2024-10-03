import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GUI {

    JLabel label = new JLabel("");
    JButton läggTillKnapp = new JButton("Lägg till");
    JPanel startPanel = new JPanel();
    JPanel toDoPanel = new JPanel();



    //Metod som skapar ram för programmet och lägger till startpanel, etc.
    public GUI() {

        JFrame frame = new JFrame("Att göra-lista");
        frame.setSize(400, 300);

        //Lyssnar på Lägg till-knappen och kallar på addToDo-metoden
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

        // Skapa nya komponenter för raden
        JPanel ToDo = new JPanel();
        ToDo.setLayout(new FlowLayout());
        JTextField textField = new JTextField(25);
        ToDo.add(textField);
        JCheckBox checkBox = new JCheckBox();
        ToDo.add(checkBox);
        JButton removeButton = new JButton("Ta bort");
        
        //Lyssnar på Ta bort-knappen och raderar textfält, checkbox och knapp
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
    }

   

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
