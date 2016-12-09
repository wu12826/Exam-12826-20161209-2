package hand.Exam_12826_20161209_2;

import java.util.Scanner;

public class SalaryTest {
public static void main(String[] args) {
	double tax=0;
	System.out.println("请输入工资：");
	Scanner scan=new Scanner(System.in);
	int salary=scan.nextInt();
	int over=salary-3500;
	if(over<0){
		tax=0;
	}else if(over<=1500){
		tax=over*0.03;
	}else if(over<=4500){
		tax=over*0.1;
	}else if(over<=9000){
		tax=over*0.2;
	}else if(over<=35000){
		tax=over*0.25;
	}else if(over<=55000){
		tax=over*0.3;
	}else if(over<=80000){
		tax=over*0.35;
	}else if(over>80000){
		tax=over*0.45;
	}
	
   System.out.println("所需要缴纳的税费为："+tax);
}

}
