
import org.scalatest._
class frequencyUsingMapTest extends FlatSpec with Matchers {
  "str" should have "a String"in{
val str="hello all"
}
it should not have"empty value"in{
val str=" "
}
"counts" should "initialise empty Map"in{
 var counts = new scala.collection.mutable.HashMap[Char,Int]
}
it should have "keys of character type" in{
 var counts = new scala.collection.mutable.HashMap[Char,Int]
}
it should have"values of Integer type" in{
var counts = new scala.collection.mutable.HashMap[Char,Int]
}
"for" should "iterate each character at string" in{
for(i<-str)
}
"counts.put()" should "add the key value in map"{
count.put(i,1)
}
"counts-(' ')" should "remove/delete the key of space which is treated as characters in the string" in{
counts.-(' ')
}
}