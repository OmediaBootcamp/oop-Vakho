package dev.omedia;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        this.tonerLevel = 0;
        this.duplex = duplex;
        if(tonerLevel < 0 || tonerLevel > 100){
            this.tonerLevel = -1;
        }else{
            this.tonerLevel = tonerLevel;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int printPages(int pages) {

        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <= 100){
            if(this.tonerLevel + tonerAmount > 100){
                return -1;
            }else{
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            }
        }else{
            return -1;
        }
    }

}
