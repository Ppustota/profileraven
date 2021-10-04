package zura.pustota.profileraven.annotation;

import org.springframework.context.annotation.Conditional;
import zura.pustota.profileraven.infra.OnRavenCondition;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Conditional({OnRavenCondition.class})
public @interface ConditionONRaven {
}
