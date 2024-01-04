//class5.js

//Map(책 140쪽), Set(책 144쪽)

//Map
console.log("-----Map-----")
const map = new Map();
map.set('홍길동', 20);
map.set('김민수', 22);
map.set('최성우', 25);
map.set('홍길동', 21); //같은 key에 있으면 새로운 값으로 변경됨. 홍길동 20 -> 홍길동 21

//map.delete('최성우'); //delete : 삭제

console.log(map.get('김민수'));
//map.clear(); //clear : 모든 항목 삭제

for (let key of map.keys()) { //반복문 생성
    console.log(`key는 ${key}, value는 ${map.get(key)}`);
}
console.log(map.values());
for (let [item, value] of map.entries()) { //배열로 생성? 값을 받아옴?
    console.log("item: "+item, "value: "+value);
}
//첫번째 매개값이 값, 두번째 매개값이 키.
console.log("forEach");
map.forEach((val, key) => console.log('key : ' + key + ', val : ' + val));


//Set
console.log("-----Set-----")
// console.clear(); //콘솔창 출력 내용들 다 지워줌.

const set = new Set();
set.add('김명철');
set.add('김민수');
set.add('홍성길');
set.add('홍길동');
console.log(set.size); //set의 크기. 위에 항목 네개를 입력했어도 중복값을 허용 안하기때문에 두개의 홍길동이 하나로 인식되어 3으로 출력됨.
set.delete('김민수'); // delete : 삭제
set.forEach(name => console.log(name));

const numAry = [10, 14, 12, 10];
const num = new Set(numAry); //배열을 Set 컬렉션에 담아줌.
num.forEach(number => console.log(number)); //10, 14, 12 로 출력. (중복된 10 제거됨).



//김씨 점수 합계 구하기
map.set('김명철', 80);
map.set('김익수', 70);
map.set('이명철', 80);
map.set('이익김', 85);
map.set('홍길동', 80);

let sum = 0; // 값을 저장하기위한 변수 생성
map.forEach((score, name) => {
    if(name.indexOf('김') == 0){ //== 0 : 이렇게하면  첫글자만 김 인걸 가져옴. 인덱스값을 반환함. 예를 들어 김명철이면 인덱스 순서로 0(김), 1(명), 2(철) 이렇게 됨. 
        sum += score;
    }
})
console.log(`합계점수: ${sum}`);
