// array5.js

const ary = [12, 20, 2, 1, 100, 88]
ary.sort((a, b) => {
    //오름차순 정렬: -1, 내림차순 정렬: 1
    if(a < b){
        return -1
    }else{
        return 1;
    }

});
console.log(ary);
console.log("Hong">"Park");
const friends = [
    {name:"Hong", age: 12},
    {name:"Hwang", age: 111},
    {name:"Park", age: 2},
    {name:"Kim", age: 33}
]
friends.sort((a, b) => { //(a=앞에오는값, b=뒤에오는값)
    if(a.name<b.name){ //a.age<b.age 이렇게 해도 됨.
        return -1;
    }else{
        return 1;
    }
})
console.log(friends);