import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //Options
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int Option = 1;
        String line;

        System.out.println("\nPlease wait, the system is starting...");
        while (Option != 7) {
            Thread.sleep(2000);
            System.out.println("----------------------------------------------");
            System.out.println("|This Menu contains the following options:   |");
            System.out.println("| 1) Add Friends in FriendGroup1.txt         |");
            Thread.sleep(200);
            System.out.println("| 2) Add Friends in FriendGroup2.txt         |");
            Thread.sleep(200);
            System.out.println("| 3) Add Friends in FriendGroup3.txt         |");
            Thread.sleep(200);
            System.out.println("| 4) View File 'FriendGroup1.txt'            |");
            Thread.sleep(200);
            System.out.println("| 5) View File 'FriendGroup2.txt'            |");
            Thread.sleep(200);
            System.out.println("| 6) View File 'FriendGroup3.txt'            |");
            Thread.sleep(200);
            System.out.println("| 7) Exit Program                            |");
            System.out.println("----------------------------------------------\n");
            System.out.print("\t\t\t\t\tPlease Enter Option [1-7]: ");

            Option = Integer.parseInt(br.readLine());
            switch (Option) {

                case 1:

                    System.out.println("\n\t\t\tExample:\n");
                    System.out.println("\t\t\t\t\tName: Austin Lee");
                    System.out.println("\t\t\t\t\tAge: 27");
                    System.out.println("\t\t\t\t\tGender: Male");
                    System.out.println("\t\t\t\t\tTelephone Number: 604-604-6046");

                    System.out.println("\n\t\t\t\t\tName: Ava Lee");
                    System.out.println("\t\t\t\t\tAge: 23");
                    System.out.println("\t\t\t\t\tGender: Female");
                    System.out.println("\t\t\t\t\tTelephone Number: 778-778-7787\n");

                    FileWriter fw = new FileWriter("FriendGroup1.txt", true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    System.out.println("Type in 'Exit/exit' to View Other Options!");

                    Scanner scan = new Scanner(System.in);

                    while (true) {
                        String input = scan.nextLine();
                        if (input.trim().equalsIgnoreCase("exit")) {
                            break;
                        }
                        bw.write((input));
                        bw.newLine();
                        bw.flush();
                    }
                    System.out.println("User Has Decided to Exit Option 1...");
                    break;

                case 2:

                    System.out.println("\n\t\t\tExample:\n");
                    System.out.println("\t\t\t\t\tName: Austin Lee");
                    System.out.println("\t\t\t\t\tAge: 27");
                    System.out.println("\t\t\t\t\tGender: Male");
                    System.out.println("\t\t\t\t\tTelephone Number: 604-604-6046");

                    System.out.println("\n\t\t\t\t\tName: Ava Lee");
                    System.out.println("\t\t\t\t\tAge: 23");
                    System.out.println("\t\t\t\t\tGender: Female");
                    System.out.println("\t\t\t\t\tTelephone Number: 778-778-7787\n");

                    FileWriter fw1 = new FileWriter("FriendGroup2.txt", true);
                    BufferedWriter bw1 = new BufferedWriter(fw1);
                    System.out.println("Type in 'Exit/exit' to View Other Options!");

                    Scanner scan1 = new Scanner(System.in);

                    while (true) {
                        String input = scan1.nextLine();
                        if (input.trim().equalsIgnoreCase("exit")) {
                            break;
                        }
                        bw1.write((input));
                        bw1.newLine();
                        bw1.flush();
                    }
                    System.out.println("User Has Decided to Exit Option 2...");
                    break;

                case 3:

                    System.out.println("\n\t\t\tExample:\n");
                    System.out.println("\t\t\t\t\tName: Austin Lee");
                    System.out.println("\t\t\t\t\tAge: 27");
                    System.out.println("\t\t\t\t\tGender: Male");
                    System.out.println("\t\t\t\t\tTelephone Number: 604-604-6046");

                    System.out.println("\n\t\t\t\t\tName: Ava Lee");
                    System.out.println("\t\t\t\t\tAge: 23");
                    System.out.println("\t\t\t\t\tGender: Female");
                    System.out.println("\t\t\t\t\tTelephone Number: 778-778-7787\n");

                    FileWriter fw2 = new FileWriter("FriendGroup3.txt", true);
                    BufferedWriter bw2 = new BufferedWriter(fw2);
                    System.out.println("Type in 'Exit/exit' to View Other Options!");

                    Scanner scan2 = new Scanner(System.in);

                    while (true) {
                        String input = scan2.nextLine();
                        if (input.trim().equalsIgnoreCase("exit")) {
                            break;
                        }
                        bw2.write((input));
                        bw2.newLine();
                        bw2.flush();
                    }
                    System.out.println("User Has Decided to Exit Option 3...");
                    break;


                case 4:
                    System.out.println("Display added friends in FriendGroup1\n");
                    try {
                        BufferedReader brr = new BufferedReader(new FileReader("FriendGroup1.txt"));
                        while ((line = brr.readLine()) != null) {


                            System.out.println(line); //Display Pre-Added and Manually-Added Friends in Text File "FriendGroup1.txt"
                        }
                        break;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;


                case 5:
                    System.out.println("Display added friends in FriendGroup2\n");
                    try {
                        BufferedReader brr = new BufferedReader(new FileReader("FriendGroup2.txt"));
                        while ((line = brr.readLine()) != null) {


                            System.out.println(line); //Display Pre-Added and Manually-Added Friends in Text File "FriendGroup2.txt"
                        }
                        break;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 6:
                    System.out.println("Display added friends in FriendGroup3\n");
                    try {
                        BufferedReader brr = new BufferedReader(new FileReader("FriendGroup3.txt"));
                        while ((line = brr.readLine()) != null) {

                            System.out.println(line); //Display Pre-Added and Manually-Added Friends in Text File "FriendGroup3.txt"
                        }
                        break;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 7:
                    System.out.println("System Shutting Down.....");
                    break;

                default: System.out.println("Invalid Option. Please Try Again.");
            }
        }
    }
}


