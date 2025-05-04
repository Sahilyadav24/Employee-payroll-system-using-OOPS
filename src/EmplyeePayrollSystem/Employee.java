package EmplyeePayrollSystem;
//we have used access modifiers and abstraction

abstract public class Employee {


    private String name;
    private int id;
    public Employee(String name, int id){//we made parametrized constructor whenever constructor calls then name and id will assign to these variables
        this.id=id;
        this.name=name;

    }
    public String getName(){//we have used encapsulation here because we have made name and id private anybody can not asses them outside the class
        //to achive some security so anybody can not acces it and change it directly we have only provided get method to just watch it and not change it
        return name;
    }
    public int getid(){
        return id;
    }

    public abstract double calculatesallary();//here we made abstract method that's why we made whole class abstract

    @Override
    public String toString(){ //we have override this toString method because it is inbuild method of java we we have to use it accoring to our needs
        return"Employee[name = "+name+ ",id = "+id+ " salary = "+calculatesallary()+"]";
    }

    

}