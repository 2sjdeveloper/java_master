//class7.js (class6,7 함께 사용), 교재 : 모듈-147쪽

import { friend, sum, getMax } from './class6.js'; //class6.js 에서 받아 올 정보들을 import 해줌.
let n1 = 10,
    n2 = 20;
console.log(sum(n1, n2));
console.log(getMax(n1, n2));

console.log(friend.showInfo());

// 백틱 (책 176쪽)
// `` <<백틱을 쓰면 긴 문장도 작성 가능. 엔터도 포함해줌. ''(작은따옴표)랑 달라.


//날짜 (책 183쪽)
let day = new Date(2020, 4, 5, 10, 10, 10); // Date() 이렇게 하면 현재 날짜 나옴.

Date.prototype.dateFormat = function () {
    console.log(this); //yyyy-MM-dd HH:mm:ss
    let yyyy = this.getFullYear(); //한번에 붙여서 적으면 길어서 yyyy, MM, dd 등 변수 선언해서 나눠줌.
    let MM = ('0' + (this.getMonth()+1)).slice(-2); //slice(-2) : 뒤에서부터 두글자 짜른다.
    let dd = ('0' + (this.getDate())).slice(-2);
    let HH = ('0' + (this.getHours())).slice(-2);
    let mm = ('0' + (this.getMinutes())).slice(-2);
    let ss = ('0' + (this.getSeconds())).slice(-2);
    return yyyy + '년' + MM + '월' + dd + '일 ' + HH + '시' + mm + '분' + ss + '초';
}
console.log(day.dateFormat());