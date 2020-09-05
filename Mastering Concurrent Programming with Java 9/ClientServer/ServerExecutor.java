package ClientServer;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ServerExecutor extends ThreadPoolExecutor {
    
    private static final long KEEP_ALIVE_TIME = 10;
    private final static int MAX_POOL_SIZE = Runtime.getRuntime().availableProcessors();
    private final static int CORE_POOL_SIZE = Runtime.getRuntime().availableProcessors();
    
    public ServerExecutor() {
        super(MAX_POOL_SIZE, CORE_POOL_SIZE, KEEP_ALIVE_TIME, TimeUnit.SECONDS, new PriorityBlockingQueue<>());
    }
    
    @Override
    protected <T> RunnableFuture<T> newTaskFor(Runnable runnable, T value) {
        return new CommandTask<>((Command) runnable);
    }
    
    @Override
    protected void afterExecute(Runnable runnable, Throwable throwable) {
        super.afterExecute(runnable, throwable);
        CommandTask<?> task = (CommandTask<?>) runnable;
        Command command = task.getCommand();
        if (throwable == null)
            if (!task.isCancelled())
                Server.finishTask(command);
            else
                System.out.println("The task" + command.hashCode() + "of user " + command.getUsername() + " has been cancelled.");
        else System.out.println("The exception " + throwable.getMessage() + " has been thrown.");
        
    }
    
}
