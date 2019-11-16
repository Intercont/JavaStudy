package designpatterns.observerpattern;

public class StockObserver implements Observer {

    //individual price of each stock
    private double ibmPrice;
    private double aaplPrice;
    private double googlPrice;

    private static int observerIDTracker = 0;

    private int observerID;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        System.out.println("New Observer " + this.observerID);
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googlPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googlPrice = googlPrice;
        printThePrices();
    }

    private void printThePrices() {
        System.out.println("Observer Id: " + this.observerID +
                "\nIBM: " + ibmPrice +
                "\nAAPL: " + aaplPrice +
                "\nGOOGL: " + googlPrice + "\n");
    }
}
