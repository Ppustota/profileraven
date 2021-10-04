package zura.pustota.profileraven.infra;

import org.springframework.boot.autoconfigure.condition.AllNestedConditions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import zura.pustota.profileraven.annotation.ConditionalOnProduction;


public class OnRavenCondition extends AllNestedConditions {
    public OnRavenCondition() {
        super(ConfigurationPhase.REGISTER_BEAN);
    }
    @ConditionalOnProperty("raven.where")
    public static class R{}

    @ConditionalOnProperty(value = "raven.on", havingValue = "true")
    public static class C{}

    @ConditionalOnProduction
    public static class B{}

}
