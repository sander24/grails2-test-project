package helloworld

import grails.transaction.Transactional

@Transactional
class PersonService {

    def serviceMethod() {
      println(" --- service method called")
    }
}
