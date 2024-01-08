<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>인포윈도우 생성하기</title>
    
</head>
<body>
<div id="map" style="width:100%;height:600px;"></div>

<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=1ca2d77f02f4d6712070fb25391ebf60"></script>
<script>
let x = '${param.x}'
let y = '${param.y}'
let org = '${param.org}'
//encodeURI(한글%09%dk%) 머 이렇게 뜨면 한글로.. 어쩌고.. 
var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
    mapOption = { 
        center: new kakao.maps.LatLng(x, y), // 지도의 중심좌표
        level: 3 // 지도의 확대 레벨
    };

var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

var iwContent = '<div style="padding:5px;">'+ org +'<br><a href="https://map.kakao.com/link/map/Hello World!,33.450701,126.570667" style="color:blue" target="_blank">큰지도보기</a> <a href="https://map.kakao.com/link/to/Hello World!,33.450701,126.570667" style="color:blue" target="_blank">길찾기</a></div>', // 인포윈도우에 표출될 내용으로 HTML 문자열이나 document element가 가능합니다
iwPosition = new kakao.maps.LatLng(x, y); //인포윈도우 표시 위치입니다
//    iwRemoveable = true; // removeable 속성을 ture 로 설정하면 인포윈도우를 닫을 수 있는 x버튼이 표시됩니다

// 인포윈도우를 생성하고 지도에 표시합니다
var infowindow = new kakao.maps.InfoWindow({
    map: map, // 인포윈도우가 표시될 지도
    position : iwPosition, 
    content : iwContent

});
      
// 아래 코드는 인포윈도우를 지도에서 제거합니다
// infowindow.close();        
</script>
</body>
</html>