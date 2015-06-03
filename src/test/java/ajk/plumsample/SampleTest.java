package ajk.plumsample;

import ajk.consul4spring.CatalogResolver;
import ajk.consul4spring.DnsResolver;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static java.lang.Thread.sleep;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SampleController.class)
@WebIntegrationTest(randomPort = true, value = {"spring.profiles.active:consul"})
public class SampleTest {
    @Autowired
    private CatalogResolver catalogResolver;

    @Autowired
    private DnsResolver dnsResolver;

    @Value("${consul.dnsPort}")
    private int dnsPort;

    @Test
    public void resolveService() throws InterruptedException {
        // sleep for 6 seconds so that the heartbeat will beat at least once
        sleep(6);

        String serviceResolution = catalogResolver.resolveByNameAsClusterDefinition("plumsample");
        assertThat(serviceResolution, is(dnsResolver.readNonLoopbackLocalAddress() + ":0"));
    }
}
