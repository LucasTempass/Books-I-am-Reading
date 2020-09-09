package EventNotification;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.TimeUnit;

public class Producer implements Runnable {
    
    private SubmissionPublisher<Event> publisher;
    private String name;
    
    public Producer(SubmissionPublisher<Event> publisher, String name) {
        this.publisher = publisher;
        this.name = name;
        
    }
    
    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            publisher.submit(new Event("Event number " + i, this.name, new Date()));
            try {
                TimeUnit.SECONDS.sleep(random.nextInt(3));
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
    
}