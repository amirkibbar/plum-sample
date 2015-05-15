package ajk.plumsample;

import ajk.consul4spring.config.ConsulProperties;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.boot.SpringApplication.run;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@SpringBootApplication
@EnableScheduling
@EnableConfigurationProperties({SampleProperties.class, ConsulProperties.class})
@ComponentScan(basePackages = {"ajk.consul4spring", "ajk.plumsample"})
@RestController
public class SampleController {
    @RequestMapping(method = GET, value = "/hello")
    public String sayHello() {
        return "hello";
    }

    public static void main(String[] args) throws Exception {
        run(SampleController.class, args);
    }
}
