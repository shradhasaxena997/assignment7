import org.scalatest._
class employeeDetailsTest extends FlatSpec with Matchers {
"Map" should have "keys and value"in{
Map[Int,Double]=Map(1->200)
}
it should have"value for every key"in{
Map[Int,Double]=Map(2->500)
}
it should have "key for every value" in{
Map[Int,Double]=Map(6->700)
}
it should not have "same keys for different value" in{
Map[Int,Double]=Map(1->500,1->400)
}
it should not have "same values for different keys" in{
Map[Int,Double]=Map(1->500,2->500)
}
it should have "Integer value as key and String is not accepted" in{
Map[Int,Double]=Map(1->200)
}
it should not have "String as key" in{
Map[Int,Double]=Map("key"->200)
}
it should have "Integer or Double value as value and String is not accepted" in{
Map[Int,Double]=Map(1->200)
}
it should not have "String as value" in{
Map[Int,Double]=Map(1->"value")
}
it should "iterate each key in foreach" in{
employee.keys.foreach()
}
it should "chech the value assosiated with key" in{
employee(x)>35000
}
it should "print the key assosiated with the value if iterated with employee.keysforech" in{
println(x)
}
it should "check condition on value assosiated with each key" in{
x=>if(employee(x)*0.75)>25000
}
it should "iterate each value in foreach" in{
employee.values.foreach()
}
it should "print the value assosiated with the key if iterated with employee.values.forech" in{
println(x)
}
it should not have "null key value pair"{
Map[Int,Double]=Map()
}
it should "throughException if there is no key or value" in{
Map[Int,Double]=Map()
}
}