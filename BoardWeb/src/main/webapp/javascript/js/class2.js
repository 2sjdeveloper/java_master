// class2.js



let today = new Date(); // {} new object()
console.log(today.getFullYear());
console.log(today.getMonth()); //월. 0부터 시작
console.log(today.getDate());
console.log(today.getDay()); //요일. 0부터 시작

today = new Date(2023, 1, 0); //(, , 0) : 전 달의 마지막 날. 2023년 2월 0. 2월의 전 달(1월)의 마지막 날.
console.log(today.getDay());


let year = 2024;
let month = 2;


today = new Date(year, month - 1, 1);
today = new Date(year, month, 0);
console.log(today.getDate(), today.getDay());


// function4 에 어제 수업한 달력 만들기 내용 있음. 그건 객체를 가지고 만든거. 여기에는 클래스 형태로 가져옴.

class Calendar {
    constructor(year, month) { //년도, 월 정보 담기 위해 생성자 만듦.
        this.year = year;
        this.month = month;
    }
    days = ['Sun', 'Mon', 'Tue', 'Wed', 'Thr', 'Fri', 'Sat']; //days = << days 라는 속성 선언.

    makeCalendar() { //메소드
        this.makeTitle(document.getElementById('theader')); //make title과 make body를 호출.
        this.makeBody(document.getElementById('tbody')); //년도랑 월은 이미 속성에 담아놔서 필요없음. 삭제했음.
        console.log('달력생성')

    }
    makeTitle(pos) {
        let tr = document.createElement('tr'); //이하는  기능.
        this.days.forEach(function (field) { //
            let th = document.createElement('th');
            th.innerText = field;
            tr.appendChild(th);
        })
        pos.appendChild(tr);

    }
    makeBody(pos = {}) {
        let tr = document.createElement('tr');
        //공백.
        let firstDay = this.getFirstDay();
        for (let i = 0; i < firstDay; i++) {
            let td = document.createElement('td');
            td.innerText = "";
            tr.appendChild(td);
        }

        //날짜 출력
        let lastDate = this.getLastDate();
        for (let i = 1; i <= lastDate; i++) {
            //토요일: blue, 일요일:pink
            let td = document.createElement('td');
            td.innerText = i;
            tr.appendChild(td);

            if ((firstDay + i) % 7 == 0) {
                td.setAttribute('style', 'background-color: skyblue');
            } else if ((firstDay + i) % 7 == 1) {
                td.setAttribute('style', 'background-color: pink');
            }

            if ((firstDay + i) % 7 == 0) {
                pos.appendChild(tr);
                tr = document.createElement('tr');
            }
        }
        pos.appendChild(tr);
    } // end of makeBody
    
    getFirstDay() {
        return new Date(this.year, this.month - 1, 1).getDay();
    }
    getLastDate() {
        //년, 월 : this.year, this.month 사용
        return new Date(this.year, this.month, 0).getDate();
    }
}
const cal = new Calendar(year, month);
cal.makeCalendar();