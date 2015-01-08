package com.andrewreitz.spock;

import spock.lang.Specification;

class SpockTestingSpec extends Specification {
  def "should use spock"() {
    given:
    def a = 2

    when:
    def b = a * a

    then:
    b == 4
  }

  def "should fail"() {
    expect:
    5 == 4
  }
}
