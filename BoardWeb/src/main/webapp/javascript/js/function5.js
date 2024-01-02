//function5.js

//Array.prototype.forEach();
const ary = ['a', 'b', 'c']
ary.forEach(elem => console.log(elem));

ary.forEach((elem, idx) => {
    if(idx > 0){
        console.log(elem);
    }
})

Array.prototype.sum = function () { //배열의 프로토타입에 메소드를 추가해서 사용할 수 있음. 단, 정의되어져있는 영역 안에서만.
    console.log(this);
    let result = 0;
    this.forEach(function (val) {
        result += val;
    })
    return result;
}
const numbers = [1, 2, 3, 4];
console.log('sum의 결과는 ' + numbers.sum());
