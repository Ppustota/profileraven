package zura.pustota.profileraven.infra;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component @Data
@ConfigurationProperties(prefix = "pais")
public class PaisDebtsProperty {
    List<String> whoPais;
}
