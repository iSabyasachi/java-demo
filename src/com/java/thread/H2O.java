package com.java.thread;

public class H2O {
    private int h;

    public H2O() {
        h = 0;
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
		synchronized (this) {
            while(this.h >= 2){
                wait();
            }
            ++this.h;           
            releaseHydrogen.run();
            notifyAll();
        }
        
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {        
        synchronized (this) {
            while(this.h < 2){
                wait();
            }
            this.h = 0;           
            releaseOxygen.run();
            notifyAll();
        }
		
    }
}
