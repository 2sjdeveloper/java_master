package chap_07;

public class FriendExe { // 데이터를 저장하고 처리하는 역할
	static Friend[] storage = new Friend[10];
	

	// 1.등록 2.목록 3.조회

	//1.등록
	public static boolean addFriend(Friend friend) {
		for (int i = 0; i < storage.length; i++) {
			if (storage[i] == null) {
				storage[i] = friend;
				return true;
			}
		}
		return false;
	}

	//2.목록
	public static Friend[] friendList() {
	
		return storage;
	}

	//3.조회
	// 결과값이 null여부로 체크하면 안됨.
	
	public Friend[] searchFriend(String name) { // 이름으로 찾기
		Friend[] result = new Friend[10];
		int j= 0;
		for (int i = 0; i < storage.length; i++) {
			if (storage[i] != null && storage[i].getName().equals(name)) {
				result[j++] = storage[i];	
			}
			
		}
		// 반환 유형이 정해져 있음(=result를 반환할거임)
		
		 // 배열 열개짜리가 새로 만들어져서 반환됨.

		return result;
	}

	// 결과값이 null 여부로 체크
	public Friend searchPhone(String phone) { // 연락처로 찾기
		return null;
	}

}// end of class
