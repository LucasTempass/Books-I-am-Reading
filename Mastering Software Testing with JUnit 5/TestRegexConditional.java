import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.lang.reflect.Method;

public class TestRegexConditional implements ExecutionCondition {
    
    public static final String STARTS_WITH_UNDERLINE = "^_.*$";
    public static final String ENDS_WITH_UNDERLINE = "^.*_$";
    
    private String disablePattern;
    
    public TestRegexConditional(String disablePattern) {
        this.disablePattern = disablePattern;
    }
    
    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
        if (isDisable(context.getTestMethod().orElse(null)))
            return ConditionEvaluationResult.disabled("");
        return ConditionEvaluationResult.enabled("");
        
    }
    
    public boolean isDisable(Method method) {
        if (method == null)
            return false;
        return method.getName().matches(disablePattern);
        
    }
    
}
