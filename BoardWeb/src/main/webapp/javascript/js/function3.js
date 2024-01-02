//function3.js
//객체생성: {} : 중괄호를 통한 객체 생성 : 값을 직접 입력하여 객체를 생성.
let obj1 = {
    name: "홍길동", //키 : 속성
    age: 20,
    showInfo: function () {
        return '이름은 ' + this.name + ', 나이는 ' + this.age;
    }
}

let obj2 = {
    name: "홍길동", //키 : 속성
    age: 20,
    showInfo: function () {
        return '이름은 ' + this.name + ', 나이는 ' + this.age;
    }
}

console.log(obj1.name);
console.log(obj1['age']);
console.log(obj1.showInfo());

//함수를 통해 객체 선언/생성 : 생성자 함수.
function Member(name, age) {
    this.name = name;
    this.age = age;
    this.showInfo = function () {
        return '이름은 ' + this.name + ', 나이는 ' + this.age; //this가 없으면 전역변수로 선언된 name을 불러오게 됨.
    }
}

//new를 통해 간단하게 객체를 추가 가능. 
let obj3 = new Member("김명철", 22); //new가 없으면 그냥 함수. new가 없으면 this.~의 속성이 없음. 그냥 함수..
let obj4 = new Member("이형섭", 22);
console.log(obj3.showInfo());
console.log(obj4.showInfo());