package ajk.plumsample;

import ajk.consul4spring.ConsulTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SamplePropertiesRepository {
    @Autowired
    private ConsulTemplate consulTemplate;

    public SampleProperties load() {
        return consulTemplate.findAndConvert(SampleProperties.class, "/config/current");
    }
}
