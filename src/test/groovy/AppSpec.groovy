/*
 * This Spock specification was generated by the Gradle 'init' task.
 */
import spock.lang.Specification

class AppSpec extends Specification {
    def "application has a greeting"() {
        setup:
        def app = new App()

        when:
        def result = app.greeting

        then:
        result != null
    }

    def "application has a greeting"() {
        setup:
        def app = new App()

        when:
        def result = app.greeting

        then:
        result == null
    }

}