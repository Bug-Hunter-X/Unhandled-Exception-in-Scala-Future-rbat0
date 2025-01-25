```scala
import scala.concurrent.{ExecutionContext, Future}

class MyClass(implicit ec: ExecutionContext) {
  def myMethod(i: Int): Future[Int] = Future {
    if (i == 0) throw new Exception("Zero is not allowed")
    i * 2
  }.recover { 
    case e: Exception => 0 // Handle exception, return a default value
  }
}
```