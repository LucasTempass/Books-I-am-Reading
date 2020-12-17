import org.junit.jupiter.api.DisplayNameGenerator;

import java.lang.reflect.Method;

class CamelCaseGenerator extends DisplayNameGenerator.Standard {
    
    public CamelCaseGenerator() { }
    
    private String format(String input) {
        return formatDigits(input).replaceAll("([A-Z])", " $1").replaceAll("_", "").trim();
    }
    
    private String formatDigits(String input) {
        return input.replaceAll("([a-z])([0-9])", "$1 $2");
    }
    
    @Override
    public String generateDisplayNameForClass(Class<?> testClass) {
        return format(testClass.getSimpleName());
    }
    
    @Override
    public String generateDisplayNameForNestedClass(Class<?> nestedClass) {
        return format(nestedClass.getSimpleName()).toLowerCase();
    }
    
    @Override
    public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
        return "f(x): " + format(testMethod.getName()).toLowerCase();
    }
    
}