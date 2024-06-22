public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    Employee(String name, double salary, double workHours, int hireYear){
        this.name= name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    double tax(double income){
        if (income<=1000){
            return income;
        }else{
            return income *0.03;
        }
    }
    double bonus(double hour){
        if (hour>=40){
            return (hour-40)*30;
        }else{
            return 0;
        }
    }
    double raiseSalary(int starting_year, double income){
          if ((2021-starting_year)>=19){
            return income*0.15;
        }
          if((2021-starting_year)>=9){
             return income*0.1;
        }else{
              return income*0.05;
          }

    }

    void tooString(){
        System.out.println("name: "+ this.name);
        System.out.println("salary: "+ this.salary);
        System.out.println("working hours: "+ this.workHours);
        System.out.println("starting year: " + this.hireYear);
        System.out.println("tax: "+ tax(this.salary));
        System.out.println("bonus: "+ bonus(this.workHours));
        System.out.println("salary increase: "+ raiseSalary(this.hireYear,this.salary));
        System.out.println("The salary with taxes and bonus: "+ (this.salary -tax(this.salary)+bonus(this.workHours)));
        System.out.println("The total salary: "+ (this.salary -tax(this.salary)+bonus(this.workHours)+raiseSalary(this.hireYear,this.salary)));
    }

}
