package designpatterns.observerpattern;

public class GrabStocks {
    public static void main(String[] args) {
        //The StockGrabberSubject will handle all Observers for us, as well as deleting and adding them
        StockGrabberSubject stockGrabberSubject = new StockGrabberSubject();

        //We'll create an Observer that will publish updates to the StockGrabberSubject, like a Publisher
        StockObserver observer1 = new StockObserver(stockGrabberSubject);

        //every time a change occurs
        stockGrabberSubject.setIbmPrice(3.65);
        //like setting a new price for a stock
        stockGrabberSubject.setAaplPrice(32.56);
        //a notification is called
        stockGrabberSubject.setGooglPrice(45.65);

        StockObserver observer2 = new StockObserver(stockGrabberSubject);

        //every time a change occurs
        stockGrabberSubject.setIbmPrice(31.65);
        //like setting a new price for a stock
        stockGrabberSubject.setAaplPrice(12.56);
        //a notification is called
        stockGrabberSubject.setGooglPrice(95.65);

        //as soon as I unregister observer1, he no longer receives updates
        stockGrabberSubject.unregister(observer1);

        stockGrabberSubject.setIbmPrice(3.65);
        stockGrabberSubject.setAaplPrice(32.56);
        stockGrabberSubject.setGooglPrice(45.65);

    }
}
