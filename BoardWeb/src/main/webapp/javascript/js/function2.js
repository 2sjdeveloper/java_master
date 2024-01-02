//function2.js
let members = `[{"id":1,"first_name":"Marlon","last_name":"Donn","email":"mdonn0@intel.com","gender":"Male","salary":1895},
{"id":2,"first_name":"Melantha","last_name":"Jacop","email":"mjacop1@seattletimes.com","gender":"Female","salary":9759},
{"id":3,"first_name":"Sophia","last_name":"Ferretti","email":"sferretti2@vinaora.com","gender":"Female","salary":4990},
{"id":4,"first_name":"Lelah","last_name":"Leversuch","email":"lleversuch3@google.pl","gender":"Female","salary":8865},
{"id":5,"first_name":"Pavlov","last_name":"Fairbourn","email":"pfairbourn4@comsenz.com","gender":"Male","salary":5376},
{"id":6,"first_name":"Mathew","last_name":"Stawell","email":"mstawell5@businessinsider.com","gender":"Male","salary":5546},
{"id":7,"first_name":"Elfie","last_name":"Foulser","email":"efoulser6@ihg.com","gender":"Female","salary":4184},
{"id":8,"first_name":"Veronike","last_name":"Fassmann","email":"vfassmann7@imgur.com","gender":"Female","salary":4813},
{"id":9,"first_name":"Anton","last_name":"Withrop","email":"awithrop8@usa.gov","gender":"Male","salary":4270},
{"id":10,"first_name":"Charisse","last_name":"Whitchurch","email":"cwhitchurch9@reverbnation.com","gender":"Female","salary":3006},
{"id":11,"first_name":"Siffre","last_name":"Wodham","email":"swodhama@miitbeian.gov.cn","gender":"Male","salary":7392},
{"id":12,"first_name":"Lucho","last_name":"Zute","email":"lzuteb@tripadvisor.com","gender":"Male","salary":9886},
{"id":13,"first_name":"Kendell","last_name":"Childerhouse","email":"kchilderhousec@cnn.com","gender":"Male","salary":8938},
{"id":14,"first_name":"Gregoire","last_name":"Grand","email":"ggrandd@altervista.org","gender":"Male","salary":5551},
{"id":15,"first_name":"Arlyn","last_name":"Rawling","email":"arawlinge@i2i.jp","gender":"Female","salary":559}]`;

let memberAry = JSON.parse(members); //JSON.parse : 문자열 -> 객체 로 변환.

console.log(memberAry[14]);

let titles = ['아이디', '이름', '성씨', '이메일', '성별', '급여'];
function makeHeader(fields = [], pos = {}) {
    let tr = document.createElement('tr');
    fields.forEach(function (field) {
        console.log(field);
        let th = document.createElement('th');
        th.innerText = field;
        tr.appendChild(th);
    })
    pos.appendChild(tr);
}
makeHeader(titles, document.getElementById('theader'));


function makeBody(data = [], pos = {}) {
    data.forEach(function (item) {
        let tr = document.createElement('tr');
        //tr에 속성지정.
        if (item.gender == 'Male') {
            tr.setAttribute('style', 'background-color: aqua');
        } else if (item.gender == 'Female') {
            tr.setAttribute('style', 'background-color: pink');
        }
        console.log(item);
        for (let prop in item) { //for ~ in. 값의 명칭? 제목?을 가져옴..
            let td = document.createElement('td');
            td.innerText = item[prop]; //item의 값을 가져옴.
            tr.appendChild(td);
        }
        pos.appendChild(tr);
    })
}




makeBody(memberAry, document.getElementById('tbody'));