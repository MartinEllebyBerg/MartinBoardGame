import java.util.Scanner;

public class UserInterface {

    //Attributer
    boolean gameIsRunning = true;
    Scanner scannerInput;
    Adventure adventure;
    String command;

    //Konstruktør
    public UserInterface() {
        scannerInput = new Scanner(System.in);
        scannerInput.useDelimiter("\n");
        adventure = new Adventure();
    }

    public void playGame() {
        welcomeText();

        String input1 = scannerInput.nextLine();
        if (input1 != "<") {
            descriptionTextAdventure();
        }

        String input2 = scannerInput.nextLine();
        if (input2 != "<") {
            userMenu();
        }

        while (gameIsRunning) {
            command = "";
            command = scannerInput.next().toLowerCase();

            switch (command) {
                case "1" -> {
                    userMenu();
                }
                case "2" -> {
                    welcomeText();
                }

                case "Exit", "exit" -> {
                    System.exit(0);
                }

                default -> System.out.println("Det kan du ikke skrive - prøv igen");
            }
        }
    }


    public void welcomeText() {
        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*        THE GREAT ADVENTURE OF      *");
        System.out.println("*          MARTIN ELLEBY BERG        *");
        System.out.println("*                                    *");
        System.out.println("**************************************\n");
        System.out.println("Tryk på Enter for at fortsætte");
    }

    public void descriptionTextAdventure() {
        System.out.println("Du er nu klar til at udforske eventyret om Martin Elleby Berg!\n");
        System.out.println("På vores mission for at finde Martin Elleby Berg står vi over for en uventet");
        System.out.println("hindring: monstre af ukendt oprindelse og uhyggelig styrke. Deres grusomme");
        System.out.println("udseende kaster frygt og tvivl over vores opgave, men vores beslutsomhed er");
        System.out.println("urokkelig. Vi samler vores mod og styrke for at konfrontere disse uhyrer og");
        System.out.println("sikre, at ingenting står i vejen for at finde vores savnede eventyrer. Med");
        System.out.println("samarbejde og mod står vi ansigt til ansigt med udfordringen, fast besluttet");
        System.out.println("på at overvinde monstrene og fortsætte vores søgen efter Martin Elleby Berg.");
        System.out.println("Eventyret venter, og vi vil ikke lade noget stoppe os.\n");
    }

    public void userMenu() {

        System.out.println("!!!HOVEDMENU!!!");
        System.out.println("Venligst vælg din næste handling:");
        System.out.println("Tast '1' for at ");
    }
}