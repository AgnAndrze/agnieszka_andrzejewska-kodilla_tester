public class ColourApplication {
        public static void main(String[] args) {
            ColourDialog colour = new ColourDialog();
            String result = colour.getColourSelection();
            System.out.println("Wybrany kolor to: " + result);
        }
    }
