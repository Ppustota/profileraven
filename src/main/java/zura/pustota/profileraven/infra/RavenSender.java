package zura.pustota.profileraven.infra;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
@RequiredArgsConstructor
public class RavenSender implements ApplicationListener<ContextRefreshedEvent> {
        private final RavenProperties ravenProperties;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ravenProperties.getWhere()
                .forEach(s -> System.out.println("Raven sent to " + s));
    }
}
