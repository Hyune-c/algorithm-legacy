# 151. Reverse Words in a String   
[링크](https://leetcode.com/problems/reverse-words-in-a-string/)

## 문제 설명

Given an input string, reverse the string word by word.

> Example 1:
```
Input: "the sky is blue"
Output: "blue is sky the"
```
> Example 2:
```
Input: "  hello world!  "
Output: "world! hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
```
> Example 3:
```
Input: "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 ```

> Note:

A word is defined as a sequence of non-space characters.
Input string may contain leading or trailing spaces. However, your reversed string should not contain leading or trailing spaces.
You need to reduce multiple spaces between two words to a single space in the reversed string.

## 풀이
- trim() 을 통해 양 끝의 공백을 삭제하고 " " 을 구분자로 split 합니다.
- split 된 배열은 공백을 포함하고 있음으로 if 문을 통해 제거하고, 배열을 append 한 후에는 단어를 구분하기 위한 공백을 넣습니다.
- return 값에서 끝의 공백을 제거합니다.
    
## Test    
> SolutionTest


## 마치며 ...

