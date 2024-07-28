import scala.io.StdIn._

object StudentRecordManager{

  def getStudentInfo():(String, Int, Int, Double, Char)={
    println("Enter student's name:");
    val name = readLine();
    println("Enter marks obtained:");
    val marks = readInt();
    println("Enter total possible marks:");
    val totalMarks = readInt();
    
    val percentage = (marks.toDouble / totalMarks) * 100;
    
    val grade = percentage match{
      case p if p >= 90 => 'A';
      case p if p >= 75 => 'B';
      case p if p >= 50 => 'C';
      case _ => 'D';
    }
    
    return (name, marks, totalMarks, percentage, grade);
  }
  
  def printStudentRecord(record:(String, Int, Int, Double, Char)):Unit={
    val (name, marks, totalMarks, percentage, grade) = record;
    println(f"\nName: $name%-10s Mark: $marks%-10d Percentage: ${percentage.toInt}"+"%"+" "*10+f"Grade: $grade\n");
  }
  
  def validateInput(name: String, marks: Int, totalMarks: Int):(Boolean,Option[String])={
    if(name.isEmpty){
        return (false,Some("Name can not be empty!!!"));
    }
    if(marks < 0 || marks > totalMarks){
        return (false,Some("Marks should be positive and not exceed total marks!!!"));
    }
    else{
        return (true,Some("Inputs are valid!!!"));
    }
  }
  
  def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = {
    var valid = false;
    var studentInfo: (String, Int, Int, Double, Char) = null;
    
    while (!valid) {
      val tempInfo = getStudentInfo();
      val (name, marks, totalMarks, _, _) = tempInfo;
      val (isValid, errorMessage) = validateInput(name, marks, totalMarks);
      if(isValid){
        valid = true;
        studentInfo = tempInfo;
      } 
      else{
        println(errorMessage.getOrElse("Invalid input.Re-enter!!!"));
      }
    }
    return studentInfo;
  } 

  
  def main(args: Array[String]): Unit = {
    println("Enter option:\n1.Input and print record\n2.Exit");
    var op=readInt();
    while(op!=2){
        op match{
            case 1 =>val studentRecord=getStudentInfoWithRetry();
                     printStudentRecord(studentRecord); 
        }
        println("Enter option:\n1.Input and print record\n2.Exit");
        op=readInt();   
    }
  }
}
