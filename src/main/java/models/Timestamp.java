package models;

public class Timestamp {
	
	long timestamp;
	
	public Timestamp() {
		timestamp = (new java.sql.Timestamp(System.currentTimeMillis())).getTime();
	}
	
}
