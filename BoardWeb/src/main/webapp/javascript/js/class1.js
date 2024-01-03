//class.js

const obj1 = {
    name: "hong",
    age: 20,
    showInfo() {
        return `이름은 ${this.name}이고 나이는 ${this.age}입니다.`; //작은따옴표 아니고 `` 백틱 써야됨.
    }
}

//클래스 생성.
class Member {
    constructor(name, age) { //생성자(매개값)
        this.name = name;
        this.age = age;
    }
    titles = ['이름', '나이'];
    showTitle(){
        this.titles.forEach(item => {
            console.log(item);
        })
    }
    showInfo() {
        return `이름은 ${this.name}이고 나이는 ${this.age}입니다.`; //작은따옴표 아니고 `` 백틱 써야됨.
    }
}

Member.prototype.showName = function(){
    return `이름은 ${this.name} 입니다.`;
}

const obj2 = new Member('홍길동', 20);
console.log(obj2.showInfo());
console.log(obj2.showTitle());
console.log(obj2.showName());
