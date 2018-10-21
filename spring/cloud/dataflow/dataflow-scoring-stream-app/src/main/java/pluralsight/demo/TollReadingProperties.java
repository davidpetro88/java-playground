package pluralsight.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties("fraud")
@Validated
public class TollReadingProperties {

	/**
	 * The limit before we worry about actual fraud.
	 */
	private Integer fraudThreshold = 10;

	public Integer getFraudThreshold() {
		return fraudThreshold;
	}

	public void setFraudThreshold(Integer fraudThreshold) {
		this.fraudThreshold = fraudThreshold;
	}
}
