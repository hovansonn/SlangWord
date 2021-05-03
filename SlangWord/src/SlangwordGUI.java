import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class SlangwordGUI {
    private static TreeSet<SlangWord> slangWords = new TreeSet<>();
    private static ArrayList<SlangWord> historySearch = new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);
    private static JFrame frame = new JFrame("Slang Word");
    private JPanel panelMain;
    private JToolBar toolBar;
    private JButton searchBySlangWord;
    private JButton searchByDefinition;
    private JButton history;
    private JButton add;
    private JButton edit;
    private JButton delete;
    private JButton reset;
    private JButton onDaySlangWord;
    private JButton quiz;
    private JTextField searchTF;
    private JButton searchBtn;
    private JPanel searchBySlangWordPanel;
    private JLabel resultLabel;
    private JPanel panelToolbar;
    private JPanel searchByDefinitionPanel;
    private JLabel slangWord;
    private JLabel SlangWordLabel;
    private JButton search;
    private JTextField searchTf;

    public SlangwordGUI() {
        searchBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                resultLabel.setText(feature1(searchTF.getText()));
            }
        });
        searchByDefinition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                showPanel
                frame.getContentPane().removeAll();
                frame.getContentPane().add(new SlangwordGUI().panelToolbar);
                frame.getContentPane().add(new SlangwordGUI().searchByDefinition);
                frame.validate();

            }
        });
        searchBySlangWord.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame.getContentPane().removeAll();
                frame.getContentPane().add(new SlangwordGUI().panelToolbar);
                frame.getContentPane().add(new SlangwordGUI().searchBySlangWordPanel);
                frame.validate();
            }
        });
    }
    public void showPanel(JPanel panel)
    {
        // hide panels
        for (JPanel pnl : panels)
        {
            pnl.setVisible(false);
        }

        // and show only this panel
        panel.setVisible(true);
    }
    public static void main(String[] args) {
        loadSlangWord();
        frame.setContentPane(new SlangwordGUI().panelToolbar);
        frame.setSize(200, 200);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    private static void loadSlangWord() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("slang.txt"));
            String line = reader.readLine();
            while (line != null) {
                String define = "";
                String slang = line.split("`")[0];
                if (line.contains("`"))
                    define = line.split("`")[1];
                else
                    System.out.println(line);
                SlangWord word = new SlangWord(slang, define);
                slangWords.add(word);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static String feature1(String slang) {
        for (SlangWord word :
                slangWords) {
            if (word.getSlang().compareTo(slang) == 0) {
                historySearch.add(word);
                return word.getDefinition();
            }
        }
        return slang + " NOT FOUND DEFINITION";
    }

    private static void feature2(String definition) {
        for (SlangWord word :
                slangWords) {
            if (word.getDefinition().contains(definition)) {
                System.out.println("Slang word: " + word.getSlang());
                historySearch.add(word);
            }
        }
    }

    private static void feature3() {

        for (SlangWord word :
                historySearch) {
            System.out.println("Slang word: " + word.getSlang() + " - " + word.getDefinition());
        }
    }

    private static void feature4() {
        SlangWord word = new SlangWord();
        System.out.print("Enter Slang: ");
        String slang = scan.nextLine();
        word.setSlang(slang);
        System.out.print("Enter definition: ");
        String definition = scan.nextLine();
        word.setDefinition(definition);

        for (SlangWord slangWord :
                slangWords) {
            if (slangWord.getSlang().compareTo(slang) == 0) {
                System.out.println("Duplicate with slang word " + slangWord.getSlang() + "`" + slangWord.getDefinition());
                System.out.println("1. overwrite");
                System.out.println("2. duplicate");
                System.out.print("Enter your choose: ");
                String choose = scan.nextLine();
                if ("1".compareTo(choose) == 0)
                    slangWord.setDefinition(word.getDefinition());
                else
                    slangWord.setDefinition(slangWord.getDefinition() + " | " + word.getDefinition());
                return;
            }
        }
        slangWords.add(word);
    }

    private static void feature5(String slangWordEdit) {

        for (SlangWord slangWord :
                slangWords) {
            if (slangWord.getSlang().compareTo(slangWordEdit) == 0) {
                System.out.println("Select the property to edit");
                System.out.println("1. slang word");
                System.out.println("2. difinition");
                System.out.print("Enter your choose: ");
                String choose = scan.nextLine();
                if ("1".compareTo(choose) == 0) {
                    System.out.print("Enter slang word: ");
                    String slang = scan.nextLine();
                    slangWord.setSlang(slang);
                } else {
                    System.out.print("Enter difinition: ");
                    String difinition = scan.nextLine();
                    slangWord.setDefinition(difinition);
                }
                return;
            }
        }
    }
}
