//js/array3.js

import { members, titles }
    from './data.js';

console.log(members);
console.log(titles);

let str = titles.reduce((acc, title, idx) => {
    if (idx == 0) {
        acc += '<tr>';
    }
    acc += '<th>' + title + '</th>';
    if (idx == titles.length - 1) {
        acc += '</tr>';
    }
    return acc;
}, ''); //초기값은 문자를 넣을거기 때문에 공백.
console.log(str); //str이란 먼가.. 콘솔에 찍어보기.
document.getElementById('theader').innerHTML = str; //<tr><th.../th></tr>


//돔으로 만들기. (뭘.. ㅜㅜ?)
const tbody = document.getElementById('tbody'); //초기값을 위한 변수 지정.
members.reduce((acc, member) => {
    let tr = document.createElement('tr');
    for (let prop in member) { //in : 객체일 경우 in
        let td = document.createElement('td'); //칼럼 만들기..
        td.innerText = member[prop];
        tr.appendChild(td);
    }
    acc.appendChild(tr);
    return acc;
}, tbody); //초기값으로 tbody 지정.


//map, filter
//map : A를 A'로 매핑해서 새로운 배열을 생성해서 반환 , filter : 특정 조건을 필터링해서 가져와서 새로운 배열을 생성해서 반환한다.(=새로운 배열을 만든다.)

//data.js 에서 lastname 이랑 firstname을 하나로 합쳐서 name으로 만들기.
let result = members.map((item, idx) => { //이 값을 받아와서
    let obj = {} //새로운 배열을 만들어준다.
    obj.id = item.id;
    obj.name = item.first_name + '-' + item.last_name;
    obj.email = item.email;
    return obj;
});

// result = members.filter(item => {return item.gender == 'Female'});
result = members.filter(item => item.gender == 'Female') //윗 문장을 이렇게 생략해서 표현 가능.
    .map((item, idx) => { // 윗문장의 마지막에 ;(세미콜론)을 안적어야됨. ".filter", ".map" 둘 다 members에 적용.
        let obj = {}
        obj.id = item.id;
        obj.name = item.first_name + '-' + item.last_name;
        obj.email = item.email;
        return obj;
    }) //여기도 세미콜론 하면 안됨.
    .map(item => item.name);
console.log("hello 에서 e의 인덱스 값 : " + 'hello'.indexOf('e'));

result.push('charles');
result.push('Hong');
result.push('charles');

console.log(result);
console.log(result.indexOf('Roby-Rhubottom'));

console.log('charles의 인덱스 값 : ' + result.indexOf('charles'));
console.log(result.indexOf('charles', 6)); //시작 위치를 지정해주면 인덱스 값을 저기서부터 찾는다는 의미. 왜냐믄 지금 여기 목록에 charles가 두개(인덱스 5번, 7번) 있는데, 시작점을 지정 안하면 처음 나오는 chales의 인덱스값(5)을 반환함.



//자습..? 책 207쪽부터~
console.log('ㅡㅡㅡㅡ자습ㅡㅡㅡㅡ')

const arr1 = [{ name: '프로도', age: 3 }, { name: '라이언', age: 5 }, { name: '콘', age: 5 }, { name: '무지', age: 4 }, { name: '네온', age: 2 }];

const found = arr1.find(el => el.age == 4);
console.log(found);

let arr_filtered1 = arr1.filter(el => el.name == '라이언');
let arr_filtered2 = arr1.filter(el => el.age > 3);
console.log(arr_filtered1);
console.log(arr_filtered2);


let arr_filetred4 = arr1.map(function (el) {
    return el.age > 3 ? el : null;
});
console.log(arr_filetred4);


let bool_some = arr1.some(el=>el.name=='프로도');
console.log(bool_some)

