package designpatterns.observerpattern.withthreads;

import designpatterns.observerpattern.Subject;

public class GetTheStock implements Runnable { //Runnable enables you to use threads

    private int startTime;
    private String stock;
    private double price;

    private Subject stockGrabberSubject;

    public GetTheStock(int startTime, String stock, double price, Subject stockGrabberSubject) {
        this.startTime = startTime;
        this.stock = stock;
        this.price = price;
        this.stockGrabberSubject = stockGrabberSubject;
    }

    @Override
    public void run() {

    }
}
