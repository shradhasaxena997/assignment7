import scala.collection.mutable.Map
object frequencyUsingMap {
  def main(args: Array[String]){
    val str = "i am indian"
    var counts = new scala.collection.mutable.HashMap[Char,Int]
    for (i <- str) {
      if (counts.contains(i))counts.put(i, counts(i) + 1)
       else
         counts.put(i, 1)}
    println(counts.-(' '))
    }
  }