    //var: 함수레벨로 적용되는 변수, let, const : var, let, const는 block 레벨의 값을 지정.
    var name = 'HwangHwang';

    function myfunc()
    {
        var name = 'Hong'; //만약에 var가 없으면. 밖에 있는 네임도 홍으로 출력됨. 함수 안에서만 유효한 값을 가짐.
        console.log(name); //함수 안에 선언한 '홍'을 출력.
        console.log(this); //함수안에서 쓰여진 this는 윈도우 객체. 
    }

    myfunc();
    console.log(name); //밖에 있는 전역변수로 선언한 '황황'을 출력.

    
    let age = 20;
    //function myfunc2()
    {
        let age = 22;
        console.log(age);
    }
    //myfunc2();
    console.log(age); //let으로 선언하면 블럭 안에서 유효한 값을 가지고, 블럭 밖에서는 먼저 선언된 20의 값을 가져옴. 적용 범위가 블럭이냐 함수냐의 차이. 
    console.log(window);
    let obj = {
        id: 'Hong',
        age: 20,
        show: function(){
            console.log(this);
        }
    }
    obj.show();

document.body.addEventListener('click', function(){
    console.log(this);

})
    //각각  //function myfunc2() //myfunc2(); 이 함수가 있고 없고에 따라 블럭으로 지정된 var와 let의 차이가 보임. 
    //var는 윈도우에 소속되고 let은 안됨.
    //var는 중복으로 선언이 가능하고, let은 불가. 웬만하면 let 또는 const로 사용.

    //this가 쓰여지는 영역에 따라 가리키는 대상이 달라짐.
    // 1. 전역 영역: window 객체.
    // 2. 함수에서 쓰여지면 : window 객체.
    // 3. 객체 : object
    // 4. 이벤트 : 이벤트를 받는(실행되는) 대상.

    //console.log(this); //그냥 this라고 쓰면 윈도우 범위. 윈도우 객체.



   // let show = 'Hello';

    // function show(){
    //     console.log('show');
    // }

    //()실행
    let show = function(){ // 61열을 주석해제하면 show가 중복되어서 에러 남. 63~65열도 주석인 상태.
        console.log('show');
        //return undefined; 
        return '반환값'; //반환값을 적어주지 않으면 undefined 이 반환됨. 그래서 반환하려는 반환값을 적어줘야한다.
    }
    console.log(show()); // ()는 함수를 실행하겠다는 의미.

    (function(){
        console.log('익명함수');
    })() //이렇게 () 만으로도 함수 실행이 가능함..대신 72~74열 첨부터 끝}까지를 괄호(  )로 묶어줬음.

    
    //함수 이름 짓는 규칙.
    function showMyName(){
        console.log('홍길동');
    }

    
    //상수선언. (상수는 한번 값을 선언하면 바꿀 수 없음.)
    const height = 167.9;
    //height = 189; //이렇게 값을 재선언하는 문장을 넣으면 오류가 생김. 바꿀 수가 없는 값이므로.

    const friend = {
        name: '홍길동',
        phone: '010-1111'
    }
    friend.phone = '010-2222'; //새로운 값 할당은 불가. 하지만 속성의 값을 바꾸는 것은 가능.         
    console.log(friend.phone);

    // friend = {} //이렇게도 쓰면 안됨. 상수는 변경 불가. "friend = {}" <= 아무 내용이 없는거를 프렌드에 넣어주겠다는 의미.
