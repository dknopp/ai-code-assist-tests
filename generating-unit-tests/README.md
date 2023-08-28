AI Coding Assistanst and Unit Test Generation
================================================================

Summary
----------------------------------------------------------------

With the rise of ChatGPT there has been a renewed interest in AI based coding assistansts as well as unit test 
generators. This repo documents an evaluation of several tools and approaches to code/unit test generation using AI.

Tools:

 * ChatGPT
 * Diffblue Cover
 * Github Copilot
 * Tabnine
 * Custom python script

Tests/Evaluations:

 * General evaluation - Some basic use cases where evaluated for each tool
 * Unit test scenarios - Some more complex unit test scenarios were evaluated for each tool
 * Leet code problems - A hard leet code problem was run through one of the tools to see how it would perform
 * Prompt/Chat - Various chat conversations asking for unit test, web clients, and other code suggestions have been 
   recorded.
 * CLI tools - Diffblue cover and a custom python script were evaluated for CLI use
 * Code/language support - Python, Java, and Kotlin where tested with various tools
 * Feature/gaps notes - for specific tools notable features and gaps may be noted.

Test/Evaluation Results:

 1. Manual conversation with ChatGPT usint the open-ai interface
    
    [A Conversation with ChatGPT](chatgpt.md)

 2. Evaluation of Diffblue Cover

    [An Evaluation of Diffblue Cover](diffblue-cover.md)

 3. Custom python script for generating unit tests

    [Python DIY Assistant](pydiy-assistant.md)

 4. Evaluation of Github Copilot

    [An Evaluation of Github Copilot](github-copilot.md)

 5. Evaluation of Tabnine

    [An Evaluation of Tabnine](tabnine.md)
    
 6. Challenging Unit Test Scenarios

    [Challenging Unit Test Scenarios](challenging-unit-test-scenarios.md)

Code/File Contents:
 * spring-boot-demo: a spring boot starter to use as an experimental test bed for seeing how AI tools generate unit 
    tests or provide other code suggestions. This subproject also has a simple kotlin class used for testing.
 * pydiy_assistant: a simple python script that uses chatgpt to generate unit tests for a given code file. This 
    demonstrates the complexity, or rather the lack of complexity, involved in using chatgpt as a backend for work
    assistants.
 * leetcode_problems: a collection of problem(s) from leetcode to see how well various tools could solve them.


Overall Evaluation / Conclusion
----------------------------------------------------------------

AI coding assistants are effective at generating base case tests for simple code, used effectively they can also
provide a starting point for more complex tests. However, they are not a replacement for a human developer. *Note that
the previous sentance was suggested by github co-pilot and has been deemed accurate by the author.*

When it comes to complex code, and generating beyond base case tests, AI coding assistants struggle in a number of 
ways. The most common result is a complete failure of the tool to generate anything beyond a base case even when 
prompted to do so. Less common, but more concerning, is the generation of numerous cases beyond a base case that at 
first glance appear to be correct, but upon closer inspection prove to be incredibly inaccurate. 

It's clear that AI coding assistants can not help generate unit test in any capacity beyond what can be considered to
be really good auto-complete. Developers will still have to generate the majority of tests beyond base cases, and
wholey write tests for more complicated code paths.

Even so, there may be value in using AI coding assistants.

As a general coding assistant, the IDE tools evaluated are enjoyable to use as an end user and do seem to save time not
only in writing unit tests but code, readmes, and other documentation. They feel like a really good auto-complete, and
occasionally save time by short-circuiting a read/search of code documentation or referenced/dependent code files.
Since there is no way to use these tools specifically for unit tests and they provide value beyond that any use of IDE
coding assistants should be as is.

Command line tools such as Diffblue cover and any custom scripts present an additional use case that could provide
value when working with legacy code.

Testing legacy code
----------------------------------------------------------------

For the purposes of this argument legacy code will mean any code not under test. Specifically we will consider code
that does not have unit tests written for it. Since AI coding assistants are generally good at creating base case unit
tests a command line script or product like Diffblue cover could be used to quickly generate base case tests for a 
large legacy code base. 

Diffblue cover present this use case in partnership with Goldman Sachs here: https://www.diffblue.com/goldman-sachs/

In this case time is potentially saved since:
 * Going from no tests to base case tests is a significant improvement
 * Existing developers may have limited knowledge of what various parts of the code is suppossed to do
 * AI unit tests, provided they are passing and actually testing a valid case capture the behavior of the code in its
   current state.
 * Even a small percentage of bad tests is okay if a large percentage of the code is now accurately tested.
 * Reviewing and editing the generated code may be easier than starting from scratch.

Notable features
----------------------------------------------------------------

Enterprise Considerations
----------------------------------------------------------------