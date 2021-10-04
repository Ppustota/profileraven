package zura.pustota.profileraven.infra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

import static zura.pustota.profileraven.infra.ProfileConstants.WINTER_IS_COMING;
import static zura.pustota.profileraven.infra.ProfileConstants.WINTER_IS_HERE;

public class ProfileDetectorEPP implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        if(environment.getActiveProfiles().length==0 && getTemperature()<-200){
            environment.setActiveProfiles(WINTER_IS_HERE);
        }
        else {
            environment.setActiveProfiles(WINTER_IS_COMING);
        }
    }

    private int getTemperature() {
        return -190;
    }
}
