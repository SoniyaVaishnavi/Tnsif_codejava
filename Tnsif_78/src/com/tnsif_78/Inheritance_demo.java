package com.tnsif_78;

	//single inheritance 

	class teacher {                        
		String teachername;
		
		teacher(String teachername){
			this.teachername= teachername;
		}
		void show() {
			System.out.println("teacher name : "+ teachername);
		}
	}
		
		
		
		class students extends teacher{
			String studentname;
			
			students(String teachername,String studentname){
				super(teachername);
				this.studentname=studentname;
			}
			void details() {
				show();
				System.out.println("students name : "+studentname);
			}
		}
		
		
		
		//multilevel inheritance
		
		
		class slc{
			void s() {
				System.out.println("I am 10 std student");
				
			}
		}
		
		
		class hsc extends slc{
			void h() {
				System.out.println("I am 12 std student");
				
			}
		}
		
		
		class clg extends hsc{
			
			void c() {
				System.out.println("I am clg student");
			}
		}
		
		
		//multiple inheritance
		
		
		class phone{         //parent 1
			void p() {
				System.out.println("phone");
				
			}
		}
		
		
		class charger{      //parent2
			void r() {
				System.out.println("charger");
			}
		}
		
		
	/*	class batterypower extends phone,charger {    //child
			
	           void b() {
	           System.out.println("power");
	          
			}
			}
			
		
		*/
		
		
		// hierarchical inheritance 
		
		
			class parent{
				void par() {
					System.out.println("parent class");
				}
			}
			
			class child1 extends parent{
				void p() {
					System.out.println("child1");
				}
			}
			
			class child2 extends parent {
				void t() {
					System.out.println("child2");
				}
			}
			
		
		
		
		

		
		
		

		
		
		
		
		
		public class Inheritance_demo{
			
		public static void main(String[] args) {
			
			students s=new students("soniya","vaishnavi");      //single inheritance
			s.details();
			
			
			clg g=new clg();                //multilevel inheritance
			g.h();
			g.s();
			g.c();
			
			
			
			child1 ch=new child1();          //hierarchical inheritance
			ch.p();
			ch.par();
			
			
			child2 cd=new child2();
			 cd.par();
			 cd.t();
			
		        		
		}
	}
		
		
	





