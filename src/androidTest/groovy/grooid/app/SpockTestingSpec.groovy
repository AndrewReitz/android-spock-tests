package grooid.app;

import spock.lang.Specification;

class SpockTestingSpec extends Specification {
  def "should use spock"() {
    given:
    def a = 2

    when:
    def b = a * a

    then:
    noExceptionThrown()
  }
}
