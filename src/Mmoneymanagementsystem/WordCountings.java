package Mmoneymanagementsystem;

import java.util.HashSet;
//HashSet�� ����ϱ� ���� import�� ����� �ܺ� class�� �ҷ��´�.
public class WordCountings {

    public static void main(String[] args) {
    	int countings = 0;
    
        String poem = " Then took the other "
                + " As just as fair "
                + " And having perhaps the better claim "
                + " Because it was grassy and wanted wear "
                + " Though as for that the passing there "
                + " Had worn them really about the same ";
        		// ���ڿ��� ���� song�� �뷡���� �Ҵ�
    
        String[] wording;
        wording = poem.split(" ");
        //split�� ����Ͽ� song�� ����ִ� ���ڿ��� ���� ������ ��� �迭 words�� ��������.
        HashSet<String> set = new HashSet<String>();
        //HashSet ����
    
        for(String word:wording){
        	if(set.add(word)) countings ++;
        }
        System.out.printf("�ߺ��� �ܾ ������ �� �ܾ� �� : %d\n", countings);
        //�ݺ����� Ȱ���Ͽ� ��������� ���� ���ڿ� ���� ī��Ʈ ���� �� ���
        countings = 0;
        //���� count �ʱ�ȭ
        for(String word:wording){
            if(set.add(word.toLowerCase())) countings ++;
        }
        System.out.printf("�빮�ڰ� �ҹ��ڷ� ����� �ܾ��� �� : %d", countings);
        //�빮�ڸ� �ҹ��ڷ� ������ ������ŭ ī��Ʈ �ϰ� ������ش�.
    
    }

}