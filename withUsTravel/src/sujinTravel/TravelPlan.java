package sujinTravel;

public class TravelPlan {	
	private int textNo;	
	private String areaCode;
	private String travelCourse;
	private String useTime;
	private String useMoney;
	private String memId;	
	private String travelLike;
	private String textHide;

	

	TravelPlan() {

	}
	
	public TravelPlan(String areaCode, String travelCourse, String useTime, String useMoney, String memId) {
		
		this.areaCode = areaCode;
		this.travelCourse = travelCourse;
		this.useTime = useTime;
		this.useMoney = useMoney;
		this.memId = memId;

	}
	
	void showInfo() {
		System.out.println(textNo + "   " + areaCode + "   " + travelCourse + "   " + useTime + "   " + useMoney + "   " + memId);
	}

	
	public int getTextNo() {
		return textNo;
	}

	public void setTextNo(int textNo) {
		this.textNo = textNo;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getTravelCourse() {
		return travelCourse;
	}

	public void setTravelCourse(String travelCourse) {
		this.travelCourse = travelCourse;
	}

	public String getUseTime() {
		return useTime;
	}

	public void setUseTime(String useTime) {
		this.useTime = useTime;
	}

	public String getUseMoney() {
		return useMoney;
	}

	public void setUseMoney(String useMoney) {
		this.useMoney = useMoney;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getTravelLike() {
		return travelLike;
	}

	public void setTravelLike(String travelLike) {
		this.travelLike = travelLike;
	}

	public String getTextHide() {
		return textHide;
	}

	public void setTextHide(String textHide) {
		this.textHide = textHide;
	}


	


//	2. 여행 계획 테이블 : travel_plan
//	글번호(자동부여) : text_no
//	지역번호코드 : area_code
//	여행코스 : travel_course
//	시간 : use_time
//	비용 : use_money
//	작성자 아이디 : mem_id
//	좋아요 : travel_like
//	글숨김 : text_hide	
	

}
