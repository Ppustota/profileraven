package zura.pustota.profileraven.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zura.pustota.profileraven.annotation.ConditionONRaven;
import zura.pustota.profileraven.annotation.ConditionalOnProduction;
import zura.pustota.profileraven.infra.RavenProperties;
import zura.pustota.profileraven.infra.RavenSender;

@Configuration
@EnableConfigurationProperties(RavenProperties.class)
public class MyConfig {
    @Bean
    @ConditionalOnMissingBean
    @ConditionONRaven
    public RavenSender ravenSender(RavenProperties ravenProperties){
        return new RavenSender(ravenProperties);
    }
}
