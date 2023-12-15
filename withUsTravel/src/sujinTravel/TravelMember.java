package sujinTravel;

public class TravelMember {
	private String travelMember;
	private String memId;
	private String memPw;
	private String memName;
	private String memRights;
	
	//Travel Member : 회원 
	//테이블 : travel_member
	//아이디 : mem_id
	//비밀번호 : mem_pw
	//이름 : mem_name
	//권한 : mem_rights 값을 넣을 때 회원/관리자따로

	
	public TravelMember() {
		
	}

	public String getTravelMember() {
		return travelMember;
	}

	public void setTravelMember(String travelMember) {
		this.travelMember = travelMember;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPw() {
		return memPw;
	}

	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getMemRights() {
		return memRights;
	}

	public void setMemRights(String memRights) {
		this.memRights = memRights;
	}
	


	
	

	
	
	
	
} //end of class

