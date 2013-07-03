import javaToScala.CountingService
import org.scalatest._
import org.scalatest.matchers.ShouldMatchers

class CountingServiceSpec extends FlatSpec with ShouldMatchers {

  "The counting service" should "increment values" in {

    //scala infers the type of this variable to be a CountingService, so we don't have to declare the type
    val countingService = CountingService.getInstance()
    countingService.increment()
    countingService.increment()

    countingService.getCount should equal (2)
  }
}
