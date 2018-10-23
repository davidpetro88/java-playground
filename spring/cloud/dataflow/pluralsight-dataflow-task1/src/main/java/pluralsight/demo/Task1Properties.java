package pluralsight.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("task1")
public class Task1Properties {
	
	/**
	 * The path to get the source doc from
	 */
	private String sourceFilePath;
	
	/**
	 * The path to put the destination doc 
	 */
	private String destinationFilePath;
	
	/**
	 * Property to drive the exit code
	 */
	private String controlMessage;

	public String getSourceFilePath() {
		return sourceFilePath;
	}

	public void setSourceFilePath(String sourceFilePath) {
		this.sourceFilePath = sourceFilePath;
	}

	public String getDestinationFilePath() {
		return destinationFilePath;
	}

	public void setDestinationFilePath(String destinationFilePath) {
		this.destinationFilePath = destinationFilePath;
	}

	public String getControlMessage() {
		return controlMessage;
	}

	public void setControlMessage(String controlMessage) {
		this.controlMessage = controlMessage;
	}
	

}
