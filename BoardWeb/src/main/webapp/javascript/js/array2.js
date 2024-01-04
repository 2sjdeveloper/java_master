//array2.js

//배열의 합계 구하기 (책 203쪽~)
const numAry = [23, 10, 17, 35, 9];

let result = numAry.reduce((acc, num) => { //acc : 보통 약간 누진값? 같은거 쓸 때 쓰는 변수 이름.
    console.log(`acc: ${acc}, num: ${num}`); //뭐가 acc고 뭐가 num 인지 모르겠으면 콘솔에 출력해보기.
    return acc + num;
}, 0); //여기서 0은 초기값. 초기값을 안주면 배열의 첫번째값이 초기값이 됨.
console.log(`결과: ${result}`);

result = numAry.reduce((acc, num) => {
    return acc > num ? acc : num; // 해석 : acc > num 이 참이면 acc를 실행하고, 거짓이면 num을 실행한다.
}, 0);
console.log(`결과: ${result}`);


//문제 : 위에 배열에서 1. 최소값, 2. 평균 구하기.
//1. 최소값
result = numAry.reduce((acc, num) => {
    return acc < num ? acc : num;
}, numAry[0]);
console.log(`최소값: ${result}`);

//2. 평균
//내가 한거
result = numAry.reduce((acc, num) => {
    return (acc + num);
}, 0)
console.log(`평균: ${result / numAry.length}`);

//교수님 풀이
result = numAry.reduce((acc, num, idx) => {
    if (idx == numAry.length - 1) {
        return (acc + num) / numAry.length
    }
    return (acc + num);
}, 0)
console.log(`평균: ${result}`);


//10보다 큰 값을 새로운 배열에 담아보기.
result = numAry.reduce((acc, num) => {
    //console.log(acc, num);
    if (num > 10) {
        acc.push(num); //push : 추가
    }
    return acc;
}, []);
console.log(`결과: ${result}`);