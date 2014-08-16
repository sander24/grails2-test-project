package helloworld

class Person {

    String firstName
    String lastName = "defaultLastName"
    Integer age
    Date lastVisit
    
    def name () {
      return "$firstName $lastName"
    }

    static constraints = {
    }
}
