# backjoon 단위 테스트에 유용한 템플릿

> 입력 값 받기 [링크](https://github.com/Hyune-c/algorithm/blob/master/src/test/java/baekjoon/template/TemplateTest.java)

###### public static String[] getInput(boolean needInputLength)
- 입력 값을 받기 위한 template 메소드로 매개 변수로 inputLength 의 필요를 체크 합니다.
- 리턴 값으로는 입력 값이 String[] 형태가 나갑니다.
    - needInputLength 가 true 면 String[0] 값에 inputLength 가 들어간 후 입력 값이 들어갑니다.
    - needInputLength 가 false 면 String[] 는 입력 값으로 시작합니다.
