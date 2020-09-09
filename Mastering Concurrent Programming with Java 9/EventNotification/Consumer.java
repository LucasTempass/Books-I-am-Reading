package EventNotification;

import java.util.Random;
import java.util.concurrent.Flow;
import java.util.concurrent.TimeUnit;

public class Consumer implements Flow.Subscriber<Event> {
    
    private String name;
    private Flow.Subscription subscription;
    
    public Consumer(String name) {
        this.name = name;
    }
    
    private void showMessage(String txt) {
        System.out.println(Thread.currentThread().getName() + ":" + this.name + ":" + txt);
    }
    
    private void processEvent(Event event) {
        Random random = new Random();
        try {
            TimeUnit.SECONDS.sleep(random.nextInt(3));
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
    
    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        this.subscription.request(1);
        this.showMessage("Subscription OK");
        
    }
    
    @Override
    public void onNext(Event event) {
        this.showMessage("An event has arrived: " + event.getSource() + ": " + event.getDate() + ":" + event.getMessage());
        this.subscription.request(1);
        processEvent(event);
        
    }
    
    @Override
    public void onError(Throwable throwable) {
        showMessage(throwable.getMessage());
    }
    
    @Override
    public void onComplete() {
        this.showMessage("Completed.");
    }
    
}
