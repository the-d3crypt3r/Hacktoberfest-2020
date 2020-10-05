public class Student 
{
	private int roll_no;
	private double subjects[];
	Student (double subjects[],int roll_no)
	{
		this.subjects = new double[3];
		for (int i = 0; i < subjects.length; i++)
		{
			this.subjects[i] = subjects[i];
		}
		this.roll_no = roll_no;
	}
	public void setRoll_no(int roll_no)
	{
		this.roll_no = roll_no ;
	}
	public int getRoll_no()
	{
		return roll_no;
	}
	public void setSubjects(double subjects[])
	{
		this.subjects = new double[3];
		for (int i = 0; i < subjects.length; i++)
		{
			this.subjects[i] = subjects[i];
		}
	}
	public double[] getSubjects()
	{
		return subjects;
	}
	public static void findTotal(Student obj[])
	{
		int i, j, sum = 0;
		for (i = 0; i < obj.length; i++)
		{
			sum = 0;
			for (j = 0; j < 3; j++)
			{
				sum += obj[i].subjects[j];
			}
			
			System.out.println("Total marks obtained by Student_"+(i+1)+" is "+sum);
		}
	}
	public static void findMax_marks(Student obj[])
	{
		int i, j = 0, roll;
		double max;
		for (i = 0; i < 3; i++)
		{
			max = obj[0].subjects[i];
			roll = obj[0].getRoll_no();
			for (j = 1; j < obj.length; j++)
			{
				if(max < obj[j].subjects[i])
				{
					max = obj[j].subjects[i];
					roll = obj[j].getRoll_no();
				}
			}
			System.out.println("Highest Marks in Subject_"+(i+1)+" is "+max+" Roll_no: "+roll);
		}
	}
	public static void findMax_total(Student obj[])
	{
		int total[] =new int[obj.length];
		int max, i, sum, j, roll;
		for (i = 0; i < obj.length; i++)
		{
			sum = 0;
			for (j = 0; j < 3; j++)
			{
				sum += obj[i].subjects[j];
			}
			total[i] = sum;
		}
		max = total[0];
		roll = 1;
		for (i = 1; i < total.length; i++)
		{
			if (max < total[i])
			{
				max = total[i];
				roll = i+1;
			}
		}
		System.out.println("Highest Total marks is obtained by Roll_no: "+roll);
	}
}

//There needs a main class or function to be added:

import java.util.Scanner;
public class StudentMain 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter No. of Students: ");
		n = sc.nextInt();
		double arr[] = new double[3];
		Student stud[] = new Student[n];
		System.out.println("Enter Marks of Students");
		for (int i = 0; i < n; i++)
		{
			System.out.println("Student "+(i+1)+" :");
			for (int j = 0; j < 3; j++)
			{
				System.out.print("Subject "+(j+1)+": ");
				arr[j] = sc.nextDouble();
			}
			stud[i] = new Student(arr,i+1);
		}
		System.out.println("");
		Student.findTotal(stud);
		System.out.println("");
		Student.findMax_marks(stud);
		System.out.println("");
		Student.findMax_total(stud);
		sc.close();
		
	}
}
// create two seperate files of two classes- one for student class and another is main class
