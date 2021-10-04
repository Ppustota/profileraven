package zura.pustota.profileraven.infra;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class MyApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        if(applicationContext.getEnvironment().getActiveProfiles().length==0){
            throw new RuntimeException("Can't start with default profile");
        }
    }
}
