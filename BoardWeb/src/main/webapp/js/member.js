/**
  * member.js 
 */

$(document).ready(function() {
	//회원목록 출력
	$.ajax('memberListJson.do', {
		method: 'get',
		//data: {bno: 1, rno: 2},//'bno=1&rno=2'
		dataType: 'json', //서버의 데이터 포맷을 지정.
		success: function(result) {

			$(result).each((idx, member) => {  //each : 자바스크립트의 forEach랑 같은 기능
				//tr생성, td생성
				let img = '';
				if (member.image) {
					img = $('<img />').attr({ 'src': 'images/' + member.image, 'style': 'width:150px' });
				}
				let tr = $('<tr />').append($('<td />').text(member.id),
					$('<td />').text(member.name),
					$('<td />').text(member.responsibility),
					$('<td />').html(img) //attr() : 함수
				);
				$('#list').append(tr);
			});
		},
		error: function(err) {
			console.log(err);
		}
	})

	$('input[type="file"]').on('change', function(e) {
		console.log(e.target.files[0])
	})


	//회원등록
	$('#addBtn').on('click', function() {
		let formData = new FormData(); // multipart/form-data :
		formData.append('id', $('input[name="id"]').val());
		formData.append('pw', $('input[name="pw"]').val());
		formData.append('name', $('input[name="name"]').val());
		formData.append('image', $('input[name="image"]')[0].files[0]);

		$.ajax('memberAddJson.do', {
			method: 'post',
			data: formData,
			processData: false,
			contentType: false,
			dataType: 'json',
			success: function(result) {
				console.log(result); //retCode, vo 값도 넘어옴

				if (result.retCode == 'OK') {
					alert('처리됨');
					let img = '';

					if (result.vo.image) {
						img = $('<img />').attr({ 'src': 'images/' + result.vo.image, 'style': 'width:150px' });
					}
					let tr = $('<tr />').append($('<td />').text(result.vo.id),
						$('<td />').text(result.vo.name),
						$('<td />').text(result.vo.responsibility),
						$('<td />').html(img) //attr() : 함수
					);
					$('#list').append(tr);
				} else if (result.retCode == 'NG') {
					alert('처리중 에러')
				}
			},
			error: function(err) {
				console.error(err);
			}
		})
	})
})