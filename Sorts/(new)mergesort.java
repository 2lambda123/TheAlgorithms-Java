package algorithm_homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class mergesort {
		
    public static void merge (int[] array1, int[] array2, int[] array3) {

    	 int array1index = 0;
         int array2index = 0;
         int array3index = 0;     
         while (array1index < array1.length && array2index < array2.length ) {
         	if ( array1[array1index] < array2[array2index]) {
             	array3[array3index] = array1[array1index];
                     array1index++; } 
             else {
             	array3[array3index] = array2[array2index];
                     array2index++; }
             array3index++; 
         }
         if(array1index < array1.length) {
             while (array1index < array1.length) {
             	array3[array3index] = array1[array1index];
             	array1index++;
                     array3index++;
             }
         }
         if(array2index < array2.length) {
             while (array2index < array2.length) {
             	array3[array3index] = array2[array2index];
             	array2index++;
                     array3index++;
             }
         }
}

public static void merge_sort (int[] array) {
        int n = array.length;       
        if (n == 1) return;       
        int[] array1 = new int[n/2];
        int[] array2 = new int[n - n/2];
        for (int i = 0; i< n/2; i++) {
                array1[i] = array[i];
        }
        for (int i = 0; i< n - n/2; i++) {
                array2[i] = array[i + n/2];
        }       
        merge_sort(array1);
        merge_sort(array2);      
        merge(array1, array2, array);
}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader reader = new FileReader("C:\\Users\\CSE\\Desktop\\homwork\\input.txt");
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
    		  long start = System.currentTimeMillis(); //�����ϴ� ���� ���
    		  merge_sort(array);
    		  long end = System.currentTimeMillis(); //���α׷��� ������ ���� ���
    		  System.out.println( "���� �ð� : " + ( end - start )/1000.0 +"��");
    		  String st_list = "";
    		  FileWriter writer = new FileWriter("C:\\Users\\CSE\\Desktop\\homwork\\201302491_output.txt");
    		  // ������ ������ ������ ���� ����
    		  for (int i = 0; i < array.length; i++) {
    		   st_list = st_list + " " + array[i];
    		   // �迭���� �ϳ��� �ҷ��� �ڿ��� �������� �����Ѵ�( ���Ͽ� ������ string���� �־�� �ϱ� ������ )
    		  }
    		  writer.write(st_list);
    		  writer.close();
    		  System.out.println("��������");
    		     	    		  
	}

}

