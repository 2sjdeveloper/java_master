//class6.js (class6,7 함께 사용), 교재 : 모듈-147쪽

function sum(num1, num2) {
    return num1 + num2;
}

function getMax(num1, num2) {
    return num1 > num2 ? num1 : num2;
}

const friend = {
    name: "hong",
    age: 20,
    showInfo() {
        return `이름은 ${this.name}, 나이는 ${this.age} 입니다.`;
    }
}

export { friend, sum, getMax }; //class7에서 사용할 정보? 들을 export 해줌. 중괄호, 함수, 객체, 변수 등등 가능.