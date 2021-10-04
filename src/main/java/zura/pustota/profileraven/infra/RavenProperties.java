package zura.pustota.profileraven.infra;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.util.List;

@Data @Component
@ConfigurationProperties(prefix = "raven")
public class RavenProperties {
    List<String> where;
    boolean on;
}
