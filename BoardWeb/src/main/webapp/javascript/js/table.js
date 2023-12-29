// table.js
// for(let prop in obj1) {      }
// table 생성. start.
let tbl = document.createElement('table');
tbl.setAttribute('border', 1); // attribute 추가.
tbl.setAttribute('id', 'list'); //id :어트리뷰트, 매개값:list
tbl.appendChild(makeHead());
tbl.appendChild(makeBody());
document.querySelector('body').appendChild(tbl);
// table생성 end.

// 추가 버튼 클릭 이벤트.
document.getElementById('addBtn').addEventListener('click', function () {
    let id = document.getElementById('uid').value;
    let name = document.getElementById('uname').value;
    let phone = document.getElementById('uphone').value;

    if (!id || !name || !phone) {
        alert('값을 입력하시오.');
        return;
    }

    //let obj = {id: id, name: name, phone: phone} //객체속성: 객체값
    let obj = { id, name, phone } //객체속성: 객체값. 두개가 같으면 하나만 적어줘도 된다. 
    //document.querySelector('#list>tbody') //id값이 리스트인 요소의 하위에 있는 tbody를 가져온다. (6열에)
    document.querySelector('#list>tbody').appendChild(makeTr(obj));
    document.getElementById('uid').value = '';
    document.getElementById('uname').value = '';
    document.getElementById('uphone').value = '';
    document.getElementById('uid').focus();
})

//변경버튼 클릭 이벤트 등록
//document.getElementById('editBtn').addEventListener('click', function(){ //이렇게 적어도 됨.
document.querySelector('#editBtn').addEventListener('click', function(){
    //찾을 값:
    let findId = document.getElementById('uid').value;
    let phone = document.getElementById('uphone').value;

    //찾을 대상.
    // let target = document.querySelectorAll('#list tr') //하위요소 할 때 >랑 ' '(공백) 차이. >는 바로 하위요소. ' '(공백)은 바로 아래 하위요소가 아니라 하위 어딘가..
    let target = document.querySelectorAll('#list>tbody>tr') //id를 뺀 나머지 3개 tr만 가져와야돼서 tr 경로를 지정해줌(id는 수정할거 아니니까..)
    //console.log(target);  //확인차 출력해본거. 
    target.forEach(function(item, idx, ary){//반복문 target의 갯수만큼 forEach가 ()안의 함수를 실행해줌. 함수의 매개값은 정해져있음.
        //item : 배열에 들어있는 요소. 지금은 tr. idx: 인덱스값(0,1,2), ary : 배열 그 자체.
        //console.log(item, idx, ary)
        let tr = item; //item 변수 이름을 tr로 바꿈.
        console.log(tr.children[0].innerText, findId)
        if(tr.children[0].innerText == findId){
           tr.children[2].innerText = phone; //아이디 값을 찾아서 휴대폰 번호를 바꿈....
        }    
    })
})

//선택삭제 이벤트 시작 (체크박스 체크한것만 선택삭제하기. 추가변경 테이블에 선택삭제 있음.)
document.querySelector('#delBtn').addEventListener('click', function(){
    document.querySelectorAll('#list>tbody>tr>td>input:checked').forEach(function(item){ //여기서 input 태그는 체크박스 하나밖에 없음.":" == 추가적인 속성. checked된 추가적인 속성을 가져온다.
        //console.log(item);
        item.parentElement.parentElement.remove(); //부모요소..

    })


})





function makeHead() {
    // thead 시작.
    let thd = document.createElement('thead');

    // tr.
    let tr = document.createElement('tr');

    // th*3.
    for (let prop in obj1) {
        let th = document.createElement('th');
        th.innerText = prop.toUpperCase();
        tr.appendChild(th);
    }
    // 삭제.
    let th = document.createElement('th');
    th.innerText = '삭제';
    tr.appendChild(th);

    th = document.createElement('th'); //체크박스. 인풋태그. setAttribute 해서 타입은 체크박스.
    th.innerText = '선택삭제';
    tr.appendChild(th);


    thd.appendChild(tr);
    return thd;
}

function makeBody() {
    // tbody 시작.
    let tbd = document.createElement('tbody');

    for (let friend of friends) {
        tbd.appendChild(makeTr(friend));
    }
    return tbd;
}

function makeTr(obj = {}) { //obj에 객체가 들어옴.
    //<tr><td>user1</td><td>홍길동</td><td>010-1111</td></tr>
    // tr.
    let trb = document.createElement('tr');
    trb.addEventListener('click', function () { //클릭시 이벤트 등록
        console.log(this.children[1].innerText); //console.log == 콘솔창에 출력한다. this가 trb. children==하위요소. [1] ==배열의 두번째 요소. [0,1,2]까지 가능.
        document.getElementById('uid').value = this.children[0].innerText; //chileren == 자식. [배열]
        document.getElementById('uname').value = this.children[1].innerText; //엘리먼트:요소, 유네임:속성, 밸류:값.
        document.getElementById('uphone').value = this.children[2].innerText;
        //document.querySelector('#uphone').value = this.children[2].innerText; //이렇게 써도 됨.

    })
    // td.
    for (let prop in obj) {
        let td = document.createElement('td');
        td.innerText = obj[prop];
        trb.appendChild(td);
    }

    //삭제버튼 생성
    let td = document.createElement('td');
    let btn = document.createElement('button');
    // button 이벤트 등록.
    btn.addEventListener('click', function (e) { // 이벤트핸들러.
        e.stopPropagation(); //밑에 설명 있음. 138열~141열.
        console.log(this.parentElement.parentElement.remove());
    });
    btn.innerText = '삭제';
    td.appendChild(btn);
    trb.appendChild(td);

    
    //체크박스 생성. //체크박스. 인풋태그. setAttribute 해서 타입은 체크박스.
    
    //수지씨랑 같이 한거.
    // let td1 = document.createElement('td');
    // let checkbox = document.createElement('input');
    // checkbox.setAttribute("type", "checkbox");
    // td1.appendChild(checkbox);
    // trb.appendChild(td1);

    td = document.createElement('td');
    td.setAttribute('align', 'center');
    let chkbox = document.createElement('input');
    chkbox.addEventListener('click',function(e){ //e:이벤트값이 매개값으로 들어옴. 자동적으로 이미 정해진거.
        console.log(e);
        e.stopPropagation(); //상위요소로 이벤트가 전파되는것을 차단. 이렇게 해서 체크박스에 체크했을 때 위의 추가/변경창에 아이디,이름,연락처가 입력되는 것을 막아줌.
    })
    chkbox.setAttribute('type','checkbox');
    td.appendChild(chkbox);
    trb.appendChild(td);




    return trb;
}