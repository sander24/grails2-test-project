package grailstestproject

import helloworld.Person

class HelloController {

    def index() {
      def p = new Person(firstName: "Fred", age: 40, lastVisit: new Date())
      p.save()
      
      // access instance field, print to console
      println(p.firstName)
      
      // call instance method, print to console
      println(p.name())
      
      [ person: p ]
    }
}
