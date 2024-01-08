/**
 * service.js
 */

function makeLi(reply = {}) {	
	//console.log(reply);
	//start
			let li = document.createElement('li');
			let span = document.createElement('span');
			span.innerText = '글번호: ' + reply.replyNo;
			li.appendChild(span);
			span = document.createElement('span');
			span.innerText = ', 글내용: ' + reply.reply;
			li.appendChild(span);
			//작성자 나타나게. ReplyListJson.java도 같이 추가해줘야됨.
			li.appendChild(span);
			span = document.createElement('span');
			span.innerText = ', 작성자: ' + reply.name;
			li.appendChild(span);
			
			//삭제버튼.
			let btn = document.createElement('button'); //버튼을
			btn.addEventListener('click', function(){ //클릭하면 아래의 이벤트가 실행됨.
				//댓글번호 삭제 후 db에서 삭제(아작스 호출 필요) 후 화면에서 제거.
				let delHtp = new XMLHttpRequest();				
				delHtp.open('get', 'delReplyJson.do?rno='+reply.replyNo) //get : 요청 방식(get 또는 post)
				delHtp.send() //요청
				delHtp.onload = function(){ //이하. 요청이 처리되면 받아오는 값들
					let result = JSON.parse(delHtp.responseText)
					// console.log(result); 먼지 모르겠으면 콘솔에 쳐보기. 
					if(result.retCode == 'OK'){
						alert('삭제됨');
						//btn.parentElement.remove();
						//bno(게시글번호), page(페이지정보) => 페이지리스트, 페이징리스트를 새로 그려줌.
						showList(pageInfo);
					}else if(result.retCode =='NG'){
						alert('처리중 에러');
					}					
				}
			})
			btn.innerText ='삭제';
			li.appendChild(btn);
			return li;
}