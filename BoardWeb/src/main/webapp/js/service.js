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
	btn.addEventListener('click', async function() { //클릭하면 아래의 이벤트가 실행됨.
	//btn.onclick = async function(){
		//댓글번호 삭제 후 db에서 삭제(아작스 호출 필요) 후 화면에서 제거.
		
		const promise = await fetch('delReplyJson.do?rno=' + reply.replyNo)
		const json = await promise.json();
		try {
			if (json.retCode == 'OK') {
				alert('삭제됨');
				showList(pageInfo);
			} else if (result.retCode == 'NG') {
				alert('처리중 에러');
			} 
		} catch (err) {
			console.error(err);
		}
	})

btn.innerText = '삭제';
li.appendChild(btn);
return li;
}
