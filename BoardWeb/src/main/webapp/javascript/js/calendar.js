// calendar.js
let days = ['Sun', 'Mon', 'Tue', 'Wed', 'Thr', 'Fri', 'Sat']

let lastDate = getLastDate(3);
let firstDay = getFirstDay(1);
console.log(lastDate, firstDay);

//달력 생성
makeCalendar(3); //1,2,3월 달력 만듦. 숫자 바꾸면 월도 바뀜.

function makeCalendar(month) {
    makeTitle(days, document.getElementById('theader'));
    makeBody(month, document.getElementById('tbody'))

}

function getLastDate(month) {
    //월 입력 => 마지막날을 반환. 31,29,31,30....
    switch (month) {
        case 1:
            return 31;
            break;
        case 2:
            return 29;
            break;
        case 3:
            return 31;
            break;

    }

}

function getFirstDay(month) {
    //월 입력 => 1일의 위치(공백이 몇개인지 반환);
    switch (month) {
        case 1:
            return 1;
            break;
        case 2:
            return 4;
            break;
        case 3:
            return 5;
            break;
    }
}
//header 생성
function makeTitle(dayAry = [], pos = {}) {
    let tr = document.createElement('tr');
    dayAry.forEach(function (field) {
        console.log(field);
        let th = document.createElement('th');
        th.innerText = field;
        tr.appendChild(th);
    })
    pos.appendChild(tr);
}

//날짜 생성
function makeBody(month = 1, pos = {}) {
    let tr = document.createElement('tr');

    //공백.
    let firstDay = getFirstDay(month);
    for (let i = 0; i < firstDay; i++) {
        let td = document.createElement('td');
        td.innerText = "";
        tr.appendChild(td);
    }

    //날짜 출력
    let lastDate = getLastDate(month);
    for (let i = 1; i <= lastDate; i++) {
        //토요일: blue, 일요일:pink
        let td = document.createElement('td');
        td.innerText = i;
        tr.appendChild(td);

        if((firstDay + i) % 7 == 0){
            td.setAttribute('style', 'background-color: skyblue');
        }else if((firstDay + i) % 7 == 1){
            td.setAttribute('style', 'background-color: pink');
        }

        if ((firstDay + i) % 7 == 0) {
            pos.appendChild(tr);
            tr = document.createElement('tr');
        }
    }
    pos.appendChild(tr);
}