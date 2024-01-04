//class4.js

const friend = {
    name: "홍길동",
    age: 20,
    hobbies: ['독서', '운동', '영화'],
    pets: [{ 
        name: '야옹이', 
        gender: 'M',
        friends: ['검정냥이','빨강냥이']
    }, { 
        name: '멍멍이', 
        gender: 'F' 
    }],
    showHobby() {
        return `${this.hobbies[0]},${this.hobbies[1]},${this.hobbies[2]},`;
    }
}
console.log(friend.name);
console.log(friend.age);
console.log(friend.hobbies);
console.log(friend.hobbies[0]);
console.log(friend['pets'][0]);
console.log(friend['pets'][0].name);
console.log(friend['pets'][0]['name']);
console.log(friend['pets'][0]['friends']);
console.log(friend['pets'][0]['friends'][0]);

friend['pets'][0]['friends'][2] = '노랑냥이';
console.log(friend['pets'][0]['friends']);

//delete friend.age; //특정 속성(age)을 삭제.
console.log(friend); 

friend.ages = 20; //속성 추가.

friend.showFriends = function(){
    console.log(this); //this는 friend 가리킴.
}

//참조값을 복사
const fcopy = friend;
fcopy.age = 22;
console.log(fcopy);


//객체를 복사 : assign
const fcopy2= Object.assign({bloodType:'O'}, friend); //bloodType 속성 추가 
fcopy2.age = 24;
console.log(fcopy2);


//속성추가
Object.defineProperty(friend, 'height', {
    get: function(){ // get : 값을 불러온다
        return this._height;
    },
    set: function(value){ // set : 값을 담는다.
        if(value <= 0){
            alert('error');
        }else{
            this._height = value;
        }
    }
});
friend.height = 162;
console.log(friend.height);