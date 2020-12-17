import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ExtensionContext.Namespace;
import org.junit.jupiter.api.extension.ExtensionContext.Store;

import java.util.logging.Logger;

public class TestDurationLogger implements BeforeTestExecutionCallback, AfterTestExecutionCallback {
    
    private static final String KEY_START_TIME = "start";
    private static final Logger LOGGER = Logger.getAnonymousLogger();
    
    @Override
    public void beforeTestExecution(ExtensionContext context) {
        getStoreFromContext(context).put(KEY_START_TIME, System.currentTimeMillis());
    }
    
    @Override
    public void afterTestExecution(ExtensionContext context) {
        long duration = System.currentTimeMillis() - getStoreFromContext(context).remove(KEY_START_TIME, long.class);
        LOGGER.info(String.format("%s - duration was %s ms.", context.getDisplayName(), duration));
        
    }
    
    private Store getStoreFromContext(ExtensionContext context) {
        return context.getStore(Namespace.create(getClass(), context.getRequiredTestMethod()));
    }
    
}