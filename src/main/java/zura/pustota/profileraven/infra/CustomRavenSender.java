package zura.pustota.profileraven.infra;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class CustomRavenSender extends RavenSender{
    @Autowired
    private RavenProperties ravenProperties;

    public CustomRavenSender(RavenProperties ravenProperties) {
        super(ravenProperties);
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("Is missing bean working?");
       ravenProperties.getWhere().forEach(s -> System.out.println(s + " is unreachable"));
    }
}
