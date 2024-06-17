package desenvolvimento.api.spotify.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient (
        name = "GoogleClient",
        url = "http://google.com"
)
public interface GoogleClient {

    @GetMapping
    String helloWorld();

}
