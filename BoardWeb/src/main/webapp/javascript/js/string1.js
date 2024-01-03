// js/string1.js

//문자열 (교재 154쪽~)
let str1 = "hello";
console.log(str1, typeof str1); //typeof : 타입을 알아볼 수 있는 명령어
let str2 = new String("hello");
console.log(str2, typeof str2);

console.log(str1 == str2); //담긴 값만 비교
console.log(str1 === str2); //타입까지 같이 비교.

console.log(str2.substring(1, 3)); //hello 에서 순서에 맞는 글자를 가져옴. 


//문자열 공백 제거(교재 158쪽)
let word = "   hello, world   ";

console.log(word.trim());

//const obj= new Object(); {}
//const reg = new RegExp(); /값/0
console.log(word.replace('h', 'H'));
console.log(word.replace(/l/g, 'L')); //g : 글로벌. 전체 글에서 찾는거. 
console.log(word.replace(/\s/g, '')); // \s : 공백을 의미. ==> 공백을 다 찾아서 지우라는 뜻. 

// word = '  how are you   to day  everyone.   ';
// console.log(word.split('  ').filter((val) => { //값이 있는것만 담아줌. 공백은 X
//     return val;
// })).join(' ');

word = '  how are you do day everyone. ';
console.log(word.split('  '). filter(val => val).join('  '));


//문자열 자르기 (160쪽)

const str3 = 'This is the only one story';
console.log("slice(8,11) : " + str3.slice(8,11));

console.log("substring(8,11) : " + str3.substring(8,11));

console.log("substr(8,11) : " + str3.substr(8,11));


//문자열 변환하기(교재 163쪽)
const num1 = 123;
const num2 = 123.45;
const bool = true;
const str = '문자열타입';
const arr = [1,2,'a','b',3];
const obj = {key: 'data', value:15};

console.log(num1.toString());
console.log(num2.toString());
console.log(bool.toString());
console.log(str.toString());
console.log(arr.toString());
console.log(obj.toString());
console.log(obj.key.toString());
console.log(obj.value.toString());


//문자열 찾기(164쪽)
const str4 = 'good morning, good afternoon, good evening, and good night';
console.log(str4.indexOf('even'));
console.log(str4.lastIndexOf('good'));
console.log(str4.lastIndexOf('dawn'));


//문자열 합치기(171쪽)
str1 = '문자열1';
str2 = '문자열2';
console.log(str1.concat(str2));


str1 = '문자열1';
str2 = '문자열2';
console.log(''.concat(str1,str2));
