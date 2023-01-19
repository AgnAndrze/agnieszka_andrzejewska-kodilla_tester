    import java.util.Scanner;
    public class ColourDialog {
        public static String getColourSelection() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Wybierz literę (N-niebieski, C-czerwony, R-różowy, Z-zielony):");
                String calc = scanner.nextLine().trim().toUpperCase();
                switch (calc) {
                    case "N":
                        return "niebieski";
                    case "C":
                        return "Czerwony";
                    case "R":
                        return "różowy";
                    case "Z":
                        return "zielony";
                    default:
                        System.out.println("Wybierasz złą literę. Spróbuj ponownie.");
                }
            }
        }

        }