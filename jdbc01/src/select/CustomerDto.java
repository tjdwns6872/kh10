package select;

public class CustomerDto {
	int client_no;
	String client_id;
	String client_phone;
	String client_date;
	String client_lastdate;
	int client_mileage;
	String client_rank;
	
	public int getClient_no() {
		return client_no;
	}
	public void setClient_no(int client_no) {
		this.client_no = client_no;
	}
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	public String getClient_phone() {
		return client_phone;
	}
	public void setClient_phone(String client_phone) {
		this.client_phone = client_phone;
	}
	public String getClient_date() {
		return client_date;
	}
	public void setClient_date(String client_date) {
		this.client_date = client_date;
	}
	public String getClient_lastdate() {
		return client_lastdate;
	}
	public void setClient_lastdate(String client_lastdate) {
		this.client_lastdate = client_lastdate;
	}
	public int getClient_mileage() {
		return client_mileage;
	}
	public void setClient_mileage(int client_mileage) {
		this.client_mileage = client_mileage;
	}
	public String getClient_rank() {
		return client_rank;
	}
	public void setClient_rank(String client_rank) {
		this.client_rank = client_rank;
	}
	@Override
	public String toString() {
		return "CustomerDto [client_no=" + client_no + ", client_id=" + client_id + ", client_phone=" + client_phone
				+ ", client_date=" + client_date + ", client_lastdate=" + client_lastdate + ", client_mileage="
				+ client_mileage + ", client_rank=" + client_rank + "]";
	}
	
}

