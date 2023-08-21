AI Coding Assistanst and Unit Test Generation
================================================================

Summary:

With the rise of ChatGPT there has been a renewed interest in AI based coding assistansts as well as unit test 
generators. This repo documents an evaluation of several tools and approaches to code/unit test generation using AI.

Tool/Approach:

 1. Manual conversation with ChatGPT usint the open-ai interface
    
    [A Conversation with ChatGPT](chatgpt.md)

 2. Evaluation of Diffblue Cover

    [An Evaluation of Diffblue Cover](diffblue-cover.md)

 3. Custom python script for generating unit tests

    [Python DIY Assistant](pydiy-assistant.md)

 4. Challenging Unit Test Scenarios

    [Challenging Unit Test Scenarios](challenging-unit-test-scenarios.md)

 5. Evaluation of Tabnine

    [An Evaluation of Tabnine](tabnine.md)

Contents:
 * spring-boot-demo: a spring boot starter to use as an experimental test bed for seeing how AI tools generate unit 
    tests or provide other code suggestions.
 * pydiy_assistant: a simple python script that uses chatgpt to generate unit tests for a given code file. This 
    demonstrates the complexity, or rather the lack of complexity, involved in using chatgpt as a backend for work
    assistants.