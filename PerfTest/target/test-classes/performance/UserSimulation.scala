package performance

import io.gatling.core.Predef._

import scala.concurrent.duration._
import com.intuit.karate.gatling.PreDef._
import io.gatling.core.structure.ScenarioBuilder


class UserSimulation extends Simulation{

  val getSingleUser: ScenarioBuilder = scenario("get all users").exec(karateFeature("classpath:performance/SingleUser.feature"))

  setUp(getSingleUser.inject(rampUsers(100).during(2000 millisecond)))
}
