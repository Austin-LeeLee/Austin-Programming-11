import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {

        int count = 0,countBuffer=0,countLine=0, indexPosition=0;
        StringBuilder lineNumber = new StringBuilder();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to be Searched");
        String inputSearch = sc.nextLine();
        String line;

        //Add words from ProgrammingHistory.txt to Arraylist
        Scanner s = null;
        try {
            s = new Scanner(new File("ProgrammingHistory.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> indexes = new ArrayList<>();



        while (true){
            assert s != null;
            if (!s.hasNext()) break;
            list.add(s.next());
            System.out.println(list);

        }
        try {
            BufferedReader br = new BufferedReader(new FileReader("ProgrammingHistory.txt"));
            try {
                while((line = br.readLine()) != null)


                {
                    countLine++;



                    //System.out.println(line);  remove // to view text (original format) from ProgrammingHistory.txt
                    String[] words = line.split(" ");

                    for (String word : words) {
                        if (word.equals(inputSearch))
                            if (indexPosition != -1){
                                indexes.add(indexPosition + 1);
                                count++;
                                countBuffer++;
                                indexPosition++;
                            }
                    }

                    if(countBuffer > 0)
                    {
                        countBuffer = 0;
                        lineNumber.append(countLine).append(",");
                    }
                }
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("\nTimes found: "+count);
        System.out.println(inputSearch + " found at index: "+ lineNumber);
        System.out.println( inputSearch+ " found at index position: " + indexes);

    }
}