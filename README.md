### mapstruct 와 일반 dto 매핑 비교
test 확인

사용방법은 인터넷에 널려있으니 생략하고, 

일단 getXxx() setXxx() 의 메소드 이름    
그러니까 자바 빈 표준 규약을 '강제' 하고 있는데    
많이 알려져있다시피 xName 이라던지 hEllo 라던지 attribute 이름이   
자바 빈 표준 규약을 적용했을때 생기는 문제가 그대로 발생할수 있을거 같음.

참고 : https://blog.naver.com/PostView.nhn?blogId=adamdoha&logNo=222295678750

암튼 같은 문제를 가지고 있는 jackson도 `@JsonProperty`, `@JsonGetter`, `PropertyNamingStrategy` 같은 방안을 제시하는데

mapstruct 는 source와 target을 지정하는 방식으로 제공하고 있긴 하지만 record style의 네이밍을 따르고 있을때는
이걸 지정하는거랑 그냥 수동으로 매핑해주는거랑 별 차이가 없을거같음.

물론 수동으로 `DefaultAccessorNamingStrategy`를 제공하고 있긴 한데 spi를 다루어야 하는 부분이라 이렇게까지 해야하나 하는 생각까지 듬

그냥 자바빈 표준 규약 따르면 되는거 아닌가 하는 생각이 들수도 있는데,    
네이밍 규약을 그냥 라이브러리따위에 따라가고 싶지도 않고, getXxx setXxx 같은 멍청한 이름을 사용하고 싶지도 않음.

개인적인 생각이지만 dto도 객체인데 객체지향적인 메소드명을 줘야한다고 생각하고.  
entity가 get, set 의 이름을 사용한다면 좀 더 심각하다 생각함.

누군가 lombok 사용하면서 request dto 객체에 기본 생성자 만들지 않고 json 데이터를 받을수 없다고 했던게 생각났음

그냥 잘 알고 사용하자 