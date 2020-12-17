import org.junit.jupiter.api.MethodDescriptor;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.MethodOrdererContext;

import java.util.Comparator;

public class MethodName implements MethodOrderer {
    
    private static final Comparator<MethodDescriptor> comparator = Comparator.comparing(MethodDescriptor::getDisplayName);
    
    public void orderMethods(MethodOrdererContext context) {
        context.getMethodDescriptors().sort(comparator);
    }
    
}
