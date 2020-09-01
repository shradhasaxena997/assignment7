import org.scalatest._
class ListOfElementTest extends FlatSpec {
"List" should "not have size 0" in {
 val list:List[Int]=List(15,9,18,27,0,36,45,78,5,7,8,10,17)         
}
it should "have all the integer value" in{
val list:List[Int]=List(1,2,3)
}
it should "not accept any string" in{
val list:List[Int]=List("hello","hi")
}
"sorted" should "give the sorted list of given elements" in{
list.sorted
}
".take" should "take the first 5 elements from the list"in{
list.take(5)
}
"for" should "iterate all the elememts in the list" in{
for(i<-list)
}
it should "print all the elements between 9 and 18 by multiplying by 5" in{
if(i>9 && i<18){println(i*5)
}
"List" should "produce NoSuchElementException when head is invoked" in { 
 intercept[NoSuchElementException] {                                
 List.empty.head}
 }
ignore should "be empty" in { 
assert(List.empty.isEmpty)
}
it should "not be non-empty" ignore { 
assert(!List.empty.nonEmpty)
}
"A non-empty List" should "have the correct size" in { 
assert(List(1, 2, 3).size == 3)
}
it should "return a contained value when head is invoked" is (pending)
}
}

