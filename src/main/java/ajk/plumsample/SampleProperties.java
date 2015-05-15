package ajk.plumsample;

import ajk.consul4spring.DefaultProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

@DefaultProperties
@ConfigurationProperties(prefix = "plum_sample")
public class SampleProperties {
    private String myProperty;

    public String getMyProperty() {
        return myProperty;
    }

    public void setMyProperty(String myProperty) {
        this.myProperty = myProperty;
    }
}
