import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class POOPROJECT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<Employee> c = new ArrayList<Employee>();
	      List<ProductionWorker> c1 = new ArrayList<ProductionWorker>();
	      Scanner s = new Scanner(System.in);
	      Scanner s1 = new Scanner(System.in);
	      Scanner s2 = new Scanner(System.in);
	      int ch;
	      do{
	         System.out.println("1.INSERT-Employee");
	         System.out.println("2.INSERT-ProductionWorker");
	         System.out.println("3.DISDLAY");
	         System.out.println("4.SEARCH");
	         System.out.println("5.DELETE");
	         System.out.println("6.UPDATE");
	         System.out.print("Enter Your Choice : ");
	         ch = s.nextInt();

	         switch(ch){
	            case 1:
	               System.out.print("Enter Employee ID : ");
	               int eno = s.nextInt();
	               System.out.print("Enter Employee Name : ");
	               String ename = s1.nextLine();
	               System.out.print("Enter Salary : ");
	               int salary = s.nextInt();

	               c.add(new Employee(eno,ename,salary));
	            break;
				case 2:
	               System.out.print("Enter ProductionWorker ID : ");
	               int eno1 = s.nextInt();
	               System.out.print("Enter ProductionWorker Name : ");
	               String ename1 = s1.nextLine();
	               System.out.print("Enter Salary : ");
	               int salary1 = s.nextInt();
				   System.out.print("Enter ProductionWorker shift (Day:1 | Night:2) : ");
	               int shift = s2.nextInt();
	               c1.add(new ProductionWorker(eno1,ename1,salary1,shift));
	            break;
	            case 3:
	               System.out.println("----------------------------");
	               Iterator<Employee> i = c.iterator();
	               while(i.hasNext()){
	                  Employee e = i.next(); 
	                  System.out.println(e.toString());
	               }
				   Iterator<ProductionWorker> j = c1.iterator();
	               while(j.hasNext()){
	                  ProductionWorker e = j.next(); 
	                  System.out.println(e.toString());
	               }
	               System.out.println("----------------------------");
	            break;
	            case 4:
	               boolean found = false;
	               System.out.print("Enter Employee id to Search :");
	               int empno = s.nextInt();
	               System.out.println("----------------------------");
	               i = c.iterator();
	               while(i.hasNext()){
	                  Employee e = i.next();
	                  if(e.getEmpno() == empno)  {
	                     System.out.println(e);
	                     found = true;
	                  }
	               }
	               j = c1.iterator();
	               while(j.hasNext()){
	                  ProductionWorker e = j.next();
	                  if(e.getEmpno() == empno)  {
	                     System.out.println(e);
	                     found = true;
	                  }
	               }
	               if(!found){
	                  System.out.println("Employee Not Found");
	               }
	               System.out.println("----------------------------");
	            break;

	            case 5:
	               found = false;
	               System.out.print("Enter Employee id to Delete :");
	               empno = s.nextInt();
	               System.out.println("----------------------------");
	               i = c.iterator();
	               while(i.hasNext()){
	                  Employee e = i.next();
	                  if(e.getEmpno() == empno)  {
	                     i.remove();
	                     found = true;
	                  }
	               }
	               j = c1.iterator();
	               while(j.hasNext()){
	                  ProductionWorker e = j.next();
	                  if(e.getEmpno() == empno)  {
	                     j.remove();
	                     found = true;
	                  }
	               }
	               if(!found){
	                  System.out.println("Employee Not Found");
	               }else{
	                  System.out.println("Employee is Deleted Successfully...!");
	               }

	               System.out.println("----------------------------");
	            break;
	            case 6:
	               found = false;
	               System.out.print("Enter Employee id to Update :");
	               empno = s.nextInt();
	               
	               ListIterator<Employee>li = c.listIterator();
	               while(li.hasNext()){
	                  Employee e = li.next();
	                  if(e.getEmpno() == empno)  {
	                     System.out.print("Enter new Name : ");
	                     ename = s1.nextLine();

	                     System.out.print("Enter new Salary : ");
	                     salary = s.nextInt();

	                     li.set(new Employee(empno,ename,salary));
	                     found = true;
	                  }
	               }
	               
					ListIterator<ProductionWorker>li1 = c1.listIterator();
	               while(li1.hasNext()){
	                  ProductionWorker e = li1.next();
	                  if(e.getEmpno() == empno)  {
	                     System.out.print("Enter new Name : ");
	                     ename = s1.nextLine();

	                     System.out.print("Enter new Salary : ");
	                     salary = s.nextInt();

						 System.out.print("Enter new shift (Day:1 | Night:2) : ");
	                     shift = s2.nextInt();

	                     li1.set(new ProductionWorker(empno,ename,salary,shift));
	                     found = true;
	                  }
	               }

	               if(!found){
	                  System.out.println("Employee Not Found");
	               }else{
	                  System.out.println("Employee is Updated Successfully...!");
	               }

	               
	            break;

	            

				
				
	         }
	      }while(ch!=0);
	   }
	}

