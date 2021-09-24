folderForJobs="Test1/Test2"
job("${folderForJobs}/Test3") {
    
    parameters {
    stringParam("Name", "Ajay")
    
    }
    steps {
       println('Hello from a Job DSL script!')
    }
}
