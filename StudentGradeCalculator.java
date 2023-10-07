package StudentGrade;

import java.util.*;

public class StudentGradeCalculator {
    static Scanner sc = new Scanner(System.in);

    public static float totalMarks(float[]arr, int n){
        float sum = 0;
        for(int i =0 ;i< n;i++){
            sum += arr[i];
        }
        return sum;
    }

    public static float avgPercentage(float[] arr,int n ){
        float totalObtain = totalMarks(arr,n);

        float avg = totalObtain / n;

        float total = n*100;

        float percentage = (totalObtain / total) * 100;

        return percentage;
    }

    public static void display(float [] arr, int n ){
        int ind =1;
        for(int i = 0; i < n; i++){

            if(70 <= arr[i] && arr[i]<= 100){
                System.out.println(" For Subject "+ ind +" grade : A");
            } else if (60 <= arr[i] && arr[i]<69.9) {
                System.out.println(" For Subject "+ ind +" grade : B");
            } else if (50 <= arr[i] && arr[i]<59.9) {
                System.out.println(" For Subject "+ ind +" grade : C");
            } else if (40 <= arr[i] && arr[i]<49.9) {
                System.out.println(" For Subject "+ ind +" grade : D");
            } else{
                System.out.println(" For Subject "+ ind +" grade : E");
            }
            ind++;
        }
    }

    public static void main(String[] args) {
        System.out.print(" Enter the Number of Subjects : ");
        int n = sc.nextInt();

        float []arr = new float[n];
        int ind = 1;
        for(int i = 0; i < arr.length; i++ ){
            System.out.print(" Enter Subject "+ ind +" Marks : ");
            arr[i]=sc.nextFloat();
            ind++;
        }

        float totalMarks = totalMarks(arr,n);
        float avgPercentage = avgPercentage(arr,n);
        System.out.println(" Total Marks You have obtained : "+ totalMarks + " Out Of "+ n*100);
        System.out.println(" Percentage : "+ avgPercentage+" % ");
        display(arr,n);
    }
}
