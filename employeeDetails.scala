import scala.collection.mutable.Map
object employeeDetails{
  val employee:Map[Int,Double]=Map(1->2000,2->5000,3->10000,4->20000,5->25000,6->30000,7->40000,8->45000)
  def main(args: Array[String]) {
    employee.keys.foreach{
      x=>if(employee(x)>35000)println("Employee Id of the employee who has salary greater than 35000 is  "+ x);}
      employee.keys.foreach{
        x=>if((employee(x)*0.75)>25000)println("Employee Id of the employee who has take-home greater than 25000 is  "+x)
      }
      }
  }