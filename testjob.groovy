job('demo1') {
    
    parameters {
    stringParam("Name", "Ajay")
    
    }
    steps {
       println('Hello from a Job DSL script!')
    }
}
