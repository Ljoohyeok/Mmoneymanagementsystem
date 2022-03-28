package Mmoneymanagementsystem;

import java.util.HashSet;
//HashSet을 사용하기 위해 import를 사용해 외부 class를 불러온다.
public class WordCountings {

    public static void main(String[] args) {
    	int countings = 0;
    
        String poem = " Then took the other "
                + " As just as fair "
                + " And having perhaps the better claim "
                + " Because it was grassy and wanted wear "
                + " Though as for that the passing there "
                + " Had worn them really about the same ";
        		// 문자열형 변수 song에 노래가사 할당
    
        String[] wording;
        wording = poem.split(" ");
        //split을 사용하여 song에 들어있는 문자열을 공백 단위로 끊어서 배열 words에 저장해줌.
        HashSet<String> set = new HashSet<String>();
        //HashSet 생성
    
        for(String word:wording){
        	if(set.add(word)) countings ++;
        }
        System.out.printf("중복된 단어를 제외한 총 단어 수 : %d\n", countings);
        //반복문을 활용하여 공백단위로 끊은 문자열 수를 카운트 해준 후 출력
        countings = 0;
        //변수 count 초기화
        for(String word:wording){
            if(set.add(word.toLowerCase())) countings ++;
        }
        System.out.printf("대문자가 소문자로 변경된 단어의 수 : %d", countings);
        //대문자를 소문자로 변경후 개수만큼 카운트 하고 출력해준다.
    
    }

}