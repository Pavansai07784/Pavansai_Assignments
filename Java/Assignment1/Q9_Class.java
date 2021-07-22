import java.util.Scanner;

public class Q9_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);


		int[] stu1 = new int[3]; 
		int[] stu2 = new int[3]; 
		int[] stu3 = new int[3]; 
		System.out.println("Enter the SubjectsMarks  of A,B,C OF Student1");
		for(int i=0;i<3;i++) {			
			stu1[i] = scanner.nextInt();
		}
		System.out.println("Enter the SubjectsMarks  of A,B,C OF Student2");

		for(int i=0;i<3;i++) {
			stu2[i] = scanner.nextInt();
		}
		System.out.println("Enter the SubjectsMarks  of A,B,C OF Student3");

		for(int i=0;i<3;i++) {
			stu3[i] = scanner.nextInt();
		}

		int Total_Stu1 = stu1[0] + stu1[1] + stu1[2];			
		int Total_Stu2 = stu2[0] + stu2[1] + stu2[2];			
		int Total_Stu3 = stu3[0] + stu3[1] + stu3[2];

		float Total_Stu1_Avg = Total_Stu1 / 3;
		float Total_Stu2_Avg = Total_Stu2/ 3;
		float Total_Stu3_Avg = Total_Stu3 / 3;

		int Total_SubA = stu1[0] + stu2[0] + stu3[0];
		int Total_SubB = stu1[1] + stu2[1] + stu3[1];
		int Total_SubC = stu1[2] + stu2[2] + stu3[2];

		float Total_SubA_Avg = Total_SubA / 3;
		float Total_SubB_Avg = Total_SubB / 3;		
		float Total_SubC_Avg = Total_SubC / 3;

		System.out.println("Total Scored by student1:" +  Total_Stu1 + " and Avg:" + Total_Stu1_Avg);
		System.out.println("Total Scored by student1:" +  Total_Stu2 + " and Avg:" + Total_Stu2_Avg);
		System.out.println("Total Scored by student1:" +  Total_Stu3 + " and Avg:" + Total_Stu3_Avg);

		System.out.println("Toatal of Sub-A:" +  Total_SubA + " and AvgScored in sub-A:" + Total_SubA_Avg);
		System.out.println("Toatal of Sub-B:" +  Total_SubB + " and AvgScored in sub-B:" + Total_SubB_Avg);
		System.out.println("Toatal of Sub-C:" +  Total_SubC + " and AvgScored in sub-C:" + Total_SubC_Avg);
	}


}


