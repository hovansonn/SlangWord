import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    private static TreeSet<SlangWord> slangWords = new TreeSet<>();

    public static void main(String[] args) {
        loadSlangWord();
        while (true) {
            System.out.println("-----------MENU-----------");
            System.out.println("1.Search by slang word");
            System.out.println("2.Search by definition");
            System.out.println("3.Show history");
            System.out.println("4.Add 1 new slang word ");
            System.out.println("5.Edit 1 slang word");
            System.out.println("6.Delete 1 slang word");
            System.out.println("7.Reset lang words ");
            System.out.println("8.On this day slang word");
            System.out.println("9.Quiz question by slang word");
            System.out.println("10.Quiz question by definition");
            System.out.println("11.Exit");

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter your choose: ");
            String choose = scan.nextLine();
            switch (choose) {
                case "1":
                    System.out.print("Enter slang word : ");
                    String slang = scan.nextLine();
                    feature1(slang);
                    break;
                case "2":
                    System.out.print("Enter definition : ");
                    String definition = scan.nextLine();
                    feature2(definition);
                    break;
                case "7":
                    loadSlangWord();
                    break;
            }
        }
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

    private static void feature1(String slang) {
        for (SlangWord word :
                slangWords) {
            if (word.getSlang().contains(slang))
            {
                System.out.println("Definition: " + word.getDefinition());
                return;
            }
        }
        System.out.println(slang + " NOT FOUND DEFINITION");
    }

    private static void feature2(String definition) {

        for (SlangWord word :
                slangWords) {
            if (word.getDefinition().contains(definition))
            {
                System.out.println("Slang word: " + word.getSlang());
            }
        }
    }
}