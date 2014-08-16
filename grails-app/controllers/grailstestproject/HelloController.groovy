package grailstestproject

import helloworld.Person
import helloworld.PersonService

class HelloController {

    def PersonService personService

    def index() {
      def p = new Person(firstName: "Fred", age: 40, lastVisit: new Date())
      p.save()
      
      // access instance field, print to console
      println(p.firstName)
      
      // try to call a method of a service
      personService.serviceMethod()
      
      // call instance method, print to console
      println(p.name())
      
      [ person: p ]
    }
}
