// function6.js
const args = [4, 5, 6];
function sum(num1 = 0, num2 = 0, ...args) {
    let result = 0;
    result = num1 + num2;
    if (args.length > 0) {
        args.forEach(val => {
            result += val;
        })
    }
    return result;

}
console.log(sum(10, 20, 30, ...args)); //...args == 변수안의 값들을 펼치겠다는 의미. 제일 마지막에만 쓸 수 있음.

const ary1 = [10, 20];
const ary2 = ary1.concat(args); //concat : 문자열,배열에서 두 문자열,배열을 합칠때 씀.
console.log(ary2);

const ary3 = [...ary1, ...args];
console.log('ary3 : ' + ary3);

const obj1 = { name: "Hong", age: 20 }
const obj2 = { name: "Hwang", height: 170 }


const obj3 = { ...obj1, ...obj2 }
console.log(obj3); //같은 속성은 뒤의 새로운 값으로 변경되고 다른 값들은 누적됨.

//reduce 메소드
let result = [4, 5, 6].reduce((acc, curItem, idx, ary) => {
    console.log(acc, curItem, idx);
    return acc + curItem;
}, 0);
console.log('결과값: ' + result);

//map 메소드
result = [1, 2, 3, 4].map((item, idx, ary) => {
    console.log(item, idx, ary);
    return item * 2;
});
console.log('결과값 : ', result);



//변수의 스코프 (책 84쪽~)
var name = '어피치';
function run() {
    let name;
    if (true) {
        name = '라이언'; //50열 생략하고 name을 var/let 줄때 값이 다 다름. let : 블럭단위
    }
    console.log(name);
    return name;
}
run();
console.log(name);


//스코프체인
var a = 1;
var b = 5;
function outerFunc() {
    var b; //undefined
    function innerFunc() { //ouoterFunc의 범위 안에서만 innerFunc 사용 가능
        a = b;
    }
    console.log(a); //1.
    a = 3;
    b = 4;
    innerFunc(); //innerFunc() : 이너펑션 호출
    console.log(a, b); // 4, 4
    var b = 2; // 변수위치와 관계없이 var로 선언하면 변수 호이스팅에 의해 위에 값에도 적용됨.
    console.log(b); //2
}
outerFunc();

//에러, 예외처리. 책 92~
const c = 10;
try{
    c=20;
}catch(error){
    console.log(error.message);
}finally{
    console.log(c);
}














