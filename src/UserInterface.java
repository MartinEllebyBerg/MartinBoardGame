import java.util.Scanner;

public class UserInterface {

    //Attributer
    boolean gameIsRunning = true;
    Scanner scannerInput;
    Adventure adventure;
    String command;
    String commandParameter;

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
            command = scannerInput.nextLine().toLowerCase();

            switch (command) {
                case "Nord", "nord", "n" -> {

                }
                case "Syd", "syd" -> {
                    userMenu();
                }

                case "Øst", "øst", "ø" -> {
                    userMenu();
                }

                case "Vest", "vest", "v" -> {
                    userMenu();
                }

                case "Exit", "exit", "e" -> {
                    System.exit(0);
                }

                default -> System.out.println("Det kan du ikke taste - prøv igen");
            }
        }
    }

    //Metode der printer velkomstbeskeden når man starte spillet
    public void welcomeText() {
        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*        THE GREAT ADVENTURE OF      *");
        System.out.println("*          MARTIN ELLEBY BERG        *");
        System.out.println("*                                    *");
        System.out.println("**************************************\n");
        System.out.println("Tryk på Enter for at fortsætte");
    }

    //Metode der printer forteksen til spillet
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
        System.out.println("Tryk på Enter for at fortsætte");
    }

    //Metode der printer UserMenuen
    public void userMenu() {

        System.out.println("!!!!!!!!HOVEDMENU!!!!!!!!\n");
        System.out.println("Vælg din næste handling:");
        System.out.println("Skriv 'Syd' for at gå mod syd");
        System.out.println("Skriv 'Nord' for at gå mod nord");
        System.out.println("Skriv 'Øst' for at gå mod øst");
        System.out.println("Skriv 'Vest' for at gå mod vest");
    }

    //Split-method bruges til at dele kommandoen til switch-casen op i to dele -
    // - så spilleren f.eks. kan skrive "take example" for at tilgå "take" i switch og derefter videresende "example" til take-metoden i Player
    public String processUserInput(String command) {
        String[] userInputArray = command.split(" ");
        this.command = userInputArray[0];
        if (this.command.equals("eat") || this.command.equals("take") || this.command.equals("drop") || this.command.equals("equip")) {
            commandParameter = userInputArray[1];
            return userInputArray[0];
        }
        return command;
    }
}