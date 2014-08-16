package grailstestproject

import helloworld.Person

class HelloController {

    def index() {
      def p = new Person(name: "Fred", age: 40, lastVisit: new Date())
      p.save()
      println(p.name)
      
      [ person: p ]
    }
}
