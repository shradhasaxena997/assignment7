import org.scalatest._

class ListOfTableTest extends FlatSpec {
  "List" should "not have size 0" in {
 val list:List[Int]=List(15,9,18,27,0,36,45,78,5,7,8,10,17)         
}
it should "have all the integer value" in{
val list:List[Int]=List(1,2,3)
}
it should "not accept any string" in{
val list:List[Int]=List("hello","hi")
}
"for" should "iterate all the elements in the list"in{
for(i<-i to 4)
}
"size" should "give the length of the list" in{
list.size
}
"list.size" should "not have the 0 value" in{
list.size
}
"number" should "take a integer value whose table you want to print" in{
val number=StdIn.readInt()
}
it should "not be null" in{
val number=StdIn.readInt()
}
  "An empty List" should "have size 0" in {
    assert(List.empty.size == 0)            
  }
  it should "produce NoSuchElementException when head is invoked" in { 
    intercept[NoSuchElementException] {                                
      List.empty.head
    }
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
 }

