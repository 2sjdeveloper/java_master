//class3.js
//교재 99쪽 실습
const ary = [];
ary.push(1);
ary.push(2);
ary.push(3);
console.log(ary.find(item => { //find : true값을 만족하는 첫번째 요소를 반환.
    return item >= 2;  // 1,2,3중 첫번째로 만족하는 값은 2이므로 2가 반환. 그게ㅔ
}))

//책 99쪽

class Estimate {
    constructor(param) {
        this.unit = param;
    }
    //견적가 얻기 메소드
    getEstimate(unittype, width, height) {
        let priceinfo = this.unit.find(item => item.type == unittype);
        return priceinfo.price * width * height;
    }
    //배열에 요소 추가 메소드
    addUnit(unit) {
        unit.push(unit);
    }
}
let unitinfo = [{ type: "wood", price: 100 }, { type: "iron", price: 300 }, { type: "plastic", price: 200 }];
const estimator = new Estimate(unitinfo);

let result = estimator.getEstimate('plastic', 20, 20);
console.log(result);

//책 111쪽
//1.객체에서 this는 객체 자신
//2. function()에서 this는 전역객체(whindow);

function myFunc(){
    console.log(this);
}
myFunc();


let obj = {};
obj.act = function(){
    this.value = 'default value'; // this : 오브젝트를 가리킴

    function innerAct(){
        this.value = 'innerAct value';
        console.log("this.value: " + this.value);
}

function innerReact(caller){
    caller.value = "innerReact value";
    console.log("this.value: " + this.value);
    console.log("caller.value: " + caller.value);
}
innerAct();
console.log("obj 객체의 this.value: " + this.value);

innerReact(this); // 여기 this는 객체. obj 가리킴.
console.log("obj 객체의 this.value: " + this.vlaue)
}

obj.act();

// window.location.href = "https://www.daum.net";

//클로저 (책 116쪽)
function outerFunc(name){
    let saying = name + ' 안녕!';

    return function(){
        return saying;
    }
}
const closure1 = outerFunc('라이언');
const closure2 = outerFunc('콘');
console.log(closure1());
console.log(closure2());

function getCounter(){
    let cnt = 1;

    return function (){
        cnt++;
        console.log(cnt);
    }
    //increaseCounter();
}
const clo1 = getCounter();
clo1();
clo1();
clo1();