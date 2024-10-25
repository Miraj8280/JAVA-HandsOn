## Find Docs with Odd Pages
Create class Document with below attributes:

id - int
title - String
folderName - String
pages - int

Write getters, setters and parameterized constructor as required. Create class Solution with main method. Implement static method - docsWithOddPages in Solution class. This method will take array of Document objects and return another array with Document objects which has odd number of pages. This method should be called from main method and display values of returned objects as shared in the sample (in ascending order of id attribute).

Before calling this method, use Scanner object to read values for four Document objects referring attributes in the above sequence. Next call the method and display the result.

Consider below sample input and output:

## Input
    1
    resume
    personal
    50
    2
    question1
    exams
    55
    3
    question2
    exams
    45
    4
    India
    misc
    40

## Output (each line has values separated by single space):
    2 question1 exams 55
    3 question2 exams 45