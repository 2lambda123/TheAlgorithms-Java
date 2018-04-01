package algorithm_homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Loopinvariant {
	  public static int search(int[] arr, int target) {
          int first = 0;
          int last = arr.length;
          int mid;
          while (first <= last) {
              mid = (first + last) / 2;
              if (target == arr[mid]) {return mid; }
             else {
                   if (target < arr[mid]) {last = mid - 1;}
                   else {first = mid + 1;}
                  }
          }         
          return -9999;
	  }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader reader = new FileReader("C:\\Users\\CSE\\Desktop\\�б�\\�˰���\\�ǽ�4\\invariant_data.txt");
    	BufferedReader rd = new BufferedReader(reader);
    	  int index = 0;
    	  int maxsize;
    	  String line = null;
    	  String getLine = "";
    	  while ((line = rd.readLine()) != null) {
    		   System.out.println(line);
    		   getLine = getLine + line;
    		   // �о ���� String�� �����Ų��
    		  }
    		  rd.close();
    		  StringTokenizer st = new StringTokenizer(getLine, " ");
    		  maxsize = st.countTokens();
    		  int[] array = new int[maxsize];
    		  while (st.hasMoreTokens()) {
    		  array[index]=Integer.parseInt(st.nextToken());
    		   // ©���� �������� �迭�� ����
    		  index++;
    		  } 
    	  System.out.println("ã���� �迭 ���� �Է��Ͻø� �ε����� ��µ˴ϴ�.");
    	  Scanner aScanner = new Scanner(System.in);
    	  int number = aScanner.nextInt();
    	  int answer = 0;
    	  answer = search(array,number);
    	  System.out.println("ã�� index : " + answer);	  
	}

}
