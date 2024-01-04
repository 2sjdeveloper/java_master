//array1.js
//배열  책 188쪽~
//ary = [] : 배열 선언 방법.

const ary = [1, 2, '3', new Date()]; //타입에 상관 없이 배열 생성 가능. 하지만 이렇게 섞어서 쓰지 않는 것이 좋음.

const numAry = [10, 20, 30, 40];
numAry.push(30); //요소 추가. 마지막 자리에 추가됨.
numAry.unshift(40); //요소를 첫번째 자리에 추가.
numAry.pop(); //마지막 요소 삭제.
numAry.shift(); //첫 요소 삭제.
numAry.splice(1, 2); //(몇번째자리, 몇개) 특정 자리에 있는 요소 삭제. [0,1,2,3.. 번째 위치]. 
numAry.splice(1, 1, 50); //(몇번째자리, 몇개, 대체 할 값) : 대체도 가능.
numAry.splice(1, 0, 50, 60); //(몇번째자리, 몇개, 추가할 값, 추가할 값) : 추가도 가능. 몇개를 0으로 지정. 대체 할 값은 0개이니까 결국 추가를 하겠다는 말. 몇개가 꼭 0이 아니어도 됨.
//numAry.splice(0); // 배열안의 요소를 다 삭제해줌.
console.log(numAry);
console.log(numAry.length);

// numAry.length = 10; //배열의 크기를 10개로 변경
console.log(numAry); //출력하면 empty 6 이라고 6개의 빈 공간이 있다고 출력됨. 

const numAry2 = [50, 60];
const numAry3 = numAry.concat(numAry2); // concat : numAry 배열에 numAry2 배열을 붙여줌. concat은 대신 새로운 배열을 만들어줌.
console.log(numAry3);

//반복문을 써서 numAry에 numAry2의 값을 추가해보기.
console.log('numAry에 numAry2의 값을 추가해보기');
numAry2.forEach(num => numAry.push(num));
console.log(numAry);

