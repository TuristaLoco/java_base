package application;

import entities.EmployeeSalary;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;


public class ProgramEmployeeSalary {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<EmployeeSalary> list= new ArrayList<>();

        System.out.println("How many employees will be registered?");
        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            System.out.println("Employee #" + (i+1) + ":");
            System.out.print("id: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)){
                System.out.println("Id already taken! Try Again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            EmployeeSalary emp = new EmployeeSalary(id, name, salary);

            list.add(emp);
        }

        System.out.print("Enter the employee id that will have a increase in salary: ");
        int idSalary = sc.nextInt();

        EmployeeSalary emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

        if(emp == null){
            System.out.println("This id does not exist!");
        }else{
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of Employees: ");
        for(EmployeeSalary e : list){
            System.out.println(e);
        }

//        Integer pos = position(list, idSalary);
//
//        if(pos == null){
//            System.out.println("This id does not exist!");
//        }else{
//            System.out.println("Enter the percentage: ");
//            double percent = sc.nextDouble();
//            list.get(pos).increaseSalary(percent);
//        }
//
//        System.out.println();
//        System.out.println("List of Employees: ");
//        for(EmployeeSalary emp : list){
//            System.out.println(emp);
//        }

        sc.close();
    }
    public static Integer position(List<EmployeeSalary> list, int id){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<EmployeeSalary> list, int id){
        EmployeeSalary emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
