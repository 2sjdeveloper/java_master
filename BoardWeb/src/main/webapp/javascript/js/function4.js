//function4.js

//달력을 생성하는 객체.
const cal = {
    days: ['Sun', 'Mon', 'Tue', 'Wed', 'Thr', 'Fri', 'Sat'],
    makeCalendar: function (month) { //메소드 선언. 속성 : 펑션
        this.makeTitle(this.days, document.getElementById('theader'));
        this.makeBody(month, document.getElementById('tbody'));
    },

    makeTitle: function (fields, pos) {
        let tr = document.createElement('tr');
        fields.forEach(function (field) {
            let th = document.createElement('th');
            th.innerText = field;
            tr.appendChild(th);
        })
        pos.appendChild(tr);

    },

    makeBody: function (month, pos) {
        let tr = document.createElement('tr');

        //공백.
        let firstDay = this.getFirstDay(month);
        for (let i = 0; i < firstDay; i++) {
            let td = document.createElement('td');
            td.innerText = "";
            tr.appendChild(td);
        }

        //날짜 출력
        let lastDate = this.getLastDate(month);
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
    }, // end of makeBody.

    getFirstDay(month) { //새롭게 추가된 메소드 선언 방법.
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
    }, //end of getFirstDay

    getLastDate(month) {
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
    } // end of getLastDate.
}
cal.makeCalendar(2);