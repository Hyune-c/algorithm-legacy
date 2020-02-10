# 1160. Find Words That Can Be Formed by Characters   
[링크](https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/)

## 문제 설명

You are given an array of strings words and a string chars.

A string is good if it can be formed by characters from chars (each character can only be used once).

Return the sum of lengths of all good strings in words.

> Example 1:
```
Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: 
The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
```
> Example 2:
```
Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation: 
The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
``` 

Note:

- 1 <= words.length <= 1000
- 1 <= words[i].length, chars.length <= 100
- All strings contain lowercase English letters only.

## 풀이
> 알고리즘

- chars 를 Character 단위로 count 할 수 있는 MyhashMap 을 만듭니다.
- isInside() 안에서 myHashMap 에 변화를 주지 않도록 객체를 새로 생성하여 매개 변수로 넣어줍니다.
 
    
## Test    


## 마치며...
HashMap 의 상속과 Overriding 을 사용해볼 수 있는 좋은 문제 였던 것 같습니다.

