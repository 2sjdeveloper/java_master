// function1.js

//책 66쪽~ 함수.

//함수 선언식
function sum(num1 = 0, num2 = 0) {  //0 = 초기값 지정. 값이 지정되지 않을 경우 0 사용.
    let result = 0;
    result = num1 + num2; //값을 여러개 넣어줘도 두개만 사용됨. 
    //console.log(result);
    console.log(arguments); //arguments : 매개값으로 들어온 값들을 처리해주는 객체. 매개값이 뭐가 들어올지 모르는 상황에 arguments를 활용. 
    if (arguments.length > 2) {
        for (let arg = 2; arg < arguments.length; arg++) { //웬만하면 매개변수의 갯수와 값의 수를 일치해서 코드를 만드는게 좋음.
            result += arguments[arg];
        }
    }
    return result;
}

let result = sum(11, 22); //function 안의 result와 지금 result가 값이 다름.
result = sum(11, 22, 33, 44, 55, 66); // 공백이면 초기값을 0으로 지정해뒀으므로 0으로 계산됨.
console.log('결과는' + result);


//함수 표현식.
let sum2 = function (num1 = 0, num2 = 0) {
    let result = num1 + num2;
    return result;
}
console.log('결과: ' + sum2(10, 20));
let obj1 = {
    name: "Hong",
    point: 100
}
let obj2 = {
    name: "Hwang",
    point: 80
}
let average = function (obj1 = {}, obj2 = {}) {
    let result = 0;
    result = (obj1.point + obj2.point) / 2;
    return result;
}
console.log('평균값: ' + average(obj1, obj2));
let array1 = [10, 20]
let array2 = [30, 40]
let sum3 = function (ary1 = [], ary2 = []) {
    let result = 0;
    ary1.concat(ary2).forEach(function (val) { //concat : 두개 배열 합치기.
        result += val;
    })
    return result;
}
console.log("배열의 총합: " + sum3(array1, array2));

let myfunc = function (callback) {
    let result = 0;
    let num1 = 10, num2 = 5;
    result = callback(num1, num2);
    return result;
}
let sumfunc = function (n1, n2) {
    return n1 + n2;
}
let minusfunc = function(n1, n2){
    return n1 - n2;
}
console.log('함수결과 ' + myfunc(sumfunc)); //sumfunc 가 myfunc 에 들어감...
console.log('함수결과 ' + myfunc(minusfunc)); //minusfunc 가 myfunc 에 들어감...