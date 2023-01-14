public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 500) {
            System.out.println("This notebook is cheap.");
        } else if (this.price > 500 && this.price < 1400) {
            System.out.println("This price is good.");
        } else {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is lightweight.");
        } else if (this.weight > 1000 && this.weight < 1700) {
            System.out.println("this notebook is medium weight.");
    } else {
        System.out.println("This notebook is quite heavy.");
    }
    }
    public void checkYear() {
        if (this.year < 1995) {
            System.out.println("This notebook is old.");
        } else if (this.year > 1995 && this.year < 2005) {
            System.out.println("This notebook is decent.");
    } else {
            System.out.println("This notebook is quite new.");
    }
    }
    public void checkProduction() {
        if (this.year > 2004 && this.price < 1100) {
            System.out.println("This laptop is good to buy.");
        } else if (this.year > 2004 && this.year < 2010 && this.price > 1100 && this.price < 1700){
            System.out.println("I would think about buying this laptop");
    } else {
            System.out.println("I wouldn't buy this laptop.");

        }
    }
}
