package com.gumshoe.demo.spock

import spock.lang.Specification

class ExampleSpecification extends Specification {
    // Spock framework allows you to use Strings as method names
    def "should be simple assertion"() {
        // Spock does not use assertions or the assert keyword, and instead uses "simple checks"
        // This example is not a realistic test case but it shows the basic of a Spock test
        // It's always helpful to see a test fail first. Spock provides helpful error messages/
        expect:
        1 == 0
    }
}
