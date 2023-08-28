

```powershell
PS C:\Users\djkno\projects\openai-tests\generating-unit-tests\spring-boot-demo> dcover create
INFO  Diffblue Cover 2023.08.01-4f16663-licensed
INFO  
INFO  Detecting environment:
INFO  ----------------------
INFO  Detected Java version 17.0.8
INFO  Selected build system: Gradle
INFO  Selected classpath from build system Gradle
INFO  Selected test framework: JUnit Jupiter
INFO  Selected Java language compliance level: 17
INFO  Selected test validation: enabled
INFO  Prefixes for filtering classes/methods:
INFO  - com.example.demo
INFO  - com.example.demo.components
INFO  - com.example.demo.controllers
INFO  - com.example.demo.services
INFO  Gathering methods to test...
INFO  Found 17 callable methods in 6 classes
INFO  
INFO  Creating tests:
INFO  ---------------
INFO  [1/6] com.example.demo.DemoApplication
INFO  [1/6]   Tests created: 0
INFO  [2/6] com.example.demo.components.SampleComponent
INFO  [2/6]   Tests created: 4
INFO  [3/6] com.example.demo.controllers.DemoRestController       
INFO  [3/6]   Tests created: 1
INFO  [4/6] com.example.demo.controllers.DemoWebMvcController     
INFO  [4/6]   Tests created: 1
INFO  [5/6] com.example.demo.services.DemoService
INFO  [5/6]   Tests created: 2
INFO  [6/6] com.example.demo.services.DemoService2
INFO  [6/6]   Tests created: 2
INFO  
INFO  Summary:
INFO  --------
INFO  Total:                                              17 methods
INFO  10 tests created for:                               10 methods
INFO  
INFO  Tested indirectly via other methods:                 6 methods
INFO      6 T005: Trivial constructor
INFO  Not unit-testable:                                   1 method
INFO      1 T006: Main method
INFO  
INFO  Running validation command.
INFO  This can take a couple of minutes.....
INFO  All 10 created tests were successfully validated.
INFO  Log file: C:\Users\djkno\projects\openai-tests\generating-unit-tests\spring-boot-demo\.diffblue\log\user-20230823T132928.log
INFO  Finished in 59s
```