object demo{
    def normalWorking(normalHours:Double):Double={
        250*normalHours;
    }

    def overtimeWorking(otHours:Double):Double={
        85*otHours;
    }
    
    def grossSalary(normalHours:Double,otHours:Double):Double={
        normalWorking(normalHours)+overtimeWorking(otHours);
    }

    def taxPayment(normalHours:Double,otHours:Double):Double={
        grossSalary(normalHours,otHours)*0.12;
    }

    def finalSalary(normalHours:Double,otHours:Double):Double={
        grossSalary(normalHours,otHours)-taxPayment(normalHours,otHours);
    }

    def main(args:Array[String]):Unit={
        println("Final Weekly salary of an employee who works 40 (normal) and 30(OT) hoursper week = " + finalSalary(40,30));
    }
}