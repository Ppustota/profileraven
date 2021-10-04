package zura.pustota.profileraven.annotation;

import org.springframework.context.annotation.Conditional;
import zura.pustota.profileraven.infra.OnProduction;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Conditional({OnProduction.class})
public @interface ConditionalOnProduction {
}
