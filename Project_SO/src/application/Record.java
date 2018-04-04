package application;

public class Record {
	private String idHospede;
	private String record;
	
	public Record(){
		this.idHospede = "";
		this.record = "";
	}
	
	public Record(String idHospede, String record){
		this.idHospede = idHospede;
		this.record = record;
	}
	
	public void setIdHospede(String idHospede) {
		this.idHospede = idHospede;
	}
	
	public void setRecord(String record) {
		this.record = record;
	}
	
	public String getIdHospede() {
		return this.idHospede;
	}
	
	public String getRecord() {
		return this.record;
	}
}
