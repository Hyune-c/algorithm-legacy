# backjoon 단위 테스트에 유용한 템플릿

> 입력 값 받기
[reverselinkedlist](https://github.com/Hyune-c/algorithm/blob/master/src/test/java/baekjoon/template/TemplateTest.java)

###### public static String[] getInput(boolean needInputLength)
- 입력 값을 받기 위한 template 메소드로 매개 변수로 inputLength 의 필요를 체크 합니다.
- 리턴 값으로는 입력 값이 String[] 형태가 나갑니다.
    - needInputLength 가 true 면 String[0] 값에 inputLength 가 들어간 후 입력 값이 들어갑니다.
    - needInputLength 가 false 면 String[] 는 입력 값으로 시작합니다.
    
    
## 보완 해야할 점 & 리팩토링
- inputLength 가 return 에 포함되어야 할 때 처리할 수 있는 더 좋은 방법이 있는가?
    - LinkedList 등의 사용을 고려했으나, 속도 때문에 Scanner 도 사용하지 않는 판국임으로 배열 (or 배열보다 빠른) 로 해보자.
- if 문과 for 문을 한줄로 표현해야 하는가? 
