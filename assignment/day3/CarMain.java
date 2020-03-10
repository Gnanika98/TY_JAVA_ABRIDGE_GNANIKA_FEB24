package com.capgemini.assignment.day3;

public class CarMain {
public static void main(String[] args) {
	Car[] car=new Car[3];
	Car c1=new Car("Benz","black",678900.23);
	Car c2=new Car("Audi","white",75646.34);
	Car c3=new Car("ferrari","blue",63982.3);
	car[0]= c1;
	car[1]=c2;
	car[2]=c3;
		printCarDetails(car);
	//Car [] c1=getCar();
	//printCarDetails(car);
	
	
}
static void printCarDetails(Car[] c1) {
for(int i=0;i<c1.length;i++) {
System.out.println("name - "+c1[i].brand );
System.out.println("color- "+c1[i].color);
System.out.println("cost- "+c1[i].cost);
System.out.println("***************************");
}
}
//static Car[] getCar() {
	// [] car =new Employee [4];
	//Car c1=new Car(101,"swapna",907.5);
	//Car  s2=new Car(102,"sneha",896.7);
	//Car s3=new Car(103,"srija",7634);
	//Car  s4=new Car(104,"vijji",7442.9);
	//car [0]=s1;
	//car[1]=s2;
	//car [2]=s3;
//	car[3]=s4;
	
	

}