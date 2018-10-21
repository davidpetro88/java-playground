package pluralsight.demo;

public class TollReading {

	private Integer stationid;
	private Integer customerid;
	private String timestamp;
	private Boolean isFraud = false;
	
	public TollReading() {}
	public TollReading(Integer stationid, Integer customerid, String timestamp) {
		this.stationid = stationid;
		this.customerid = customerid;
		this.timestamp = timestamp;
	}
	
	public Integer getStationid() {
		return stationid;
	}
	public void setStationid(Integer stationid) {
		this.stationid = stationid;
	}
	public Integer getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public Boolean getIsFraud() {
		return isFraud;
	}
	public void setIsFraud(Boolean isFraud) {
		this.isFraud = isFraud;
	}
	
}
