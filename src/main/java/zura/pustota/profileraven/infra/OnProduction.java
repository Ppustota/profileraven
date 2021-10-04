package zura.pustota.profileraven.infra;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import java.util.Random;


public class OnProduction implements Condition {
    Random random = new Random();
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
//        int guess = random.nextInt(100);
        int guess = 2;
        return guess % 2 == 0;
    }
}
