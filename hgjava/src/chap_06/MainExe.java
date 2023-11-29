package chap_06;

public class MainExe {

	public static void main(String[] args) {
		
		//한 페이지 글 몇개 들어가는지 만들기 
		String[] strs = { "111", "22222", "3333", "4444", "5.sdfga", "6.ajshfkdl", "7.ashfkdl", "8.afjs;d" };
		int page = 1;
		int start = (page - 1) * 5;
		int end = page * 5;
		
		for (int i = 0; i < strs.length; i++) {
			if (i >= start && i < end) {
				System.out.println(strs[i]);
			}
		}
		int cnt = 36;

		int totalPage = (int) Math.ceil(cnt / 5.0);
		System.out.println(totalPage);

		for (int i = 1; i <= totalPage; i++) {
			System.out.print(i + " ");
		}

	}// main

}// class
