package designpatterns.observerpattern;

import java.util.ArrayList;

public class StockGrabberSubject implements Subject {

    //I will keep the list of Observers in an ArrayList
    private ArrayList<Observer> observers;

    //individual price of each stock
    private double ibmPrice;
    private double aaplPrice;
    private double googlPrice;

    public StockGrabberSubject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        //to show which observeris going to be deleted from the list, we'll get it's index
        int index = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (index+1) + " has been deleted");
        observers.remove(deleteObserver);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(ibmPrice, aaplPrice, googlPrice));
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setAaplPrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObserver();
    }

    public void setGooglPrice(double googlPrice) {
        this.googlPrice = googlPrice;
        notifyObserver();
    }
}
