import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.support.AnnotationConsumer;

import java.util.Random;
import java.util.stream.Stream;

public class RandomIntProvider implements ArgumentsProvider, AnnotationConsumer<RandomIntSource> {
    
    private int amount;
    
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        Random random = new Random();
        return Stream.generate(random::nextInt).map(Arguments::of).limit(amount);
        
    }
    
    @Override
    public void accept(RandomIntSource sized) {
        amount = sized.amount();
    }
    
}
