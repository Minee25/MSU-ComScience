#include <stdio.h>

int main() {
    char grade, name[20], *result;

    // Input
    printf("Enter your name: ");
    scanf("%s", &name);
    printf("Enter your grade: ");
    scanf(" %c", &grade);

    // Process
    if (grade == 'A' || grade == 'a') {
        result = "Excellence";
    } else if (grade == 'B' || grade == 'b') {
        result = "Good";
    } else if (grade == 'C' || grade == 'c') {
        result = "Fair";
    } else if (grade == 'D' || grade == 'd') {
        result = "Pass";
    } else if (grade == 'F' || grade) {
        result = "Fail";
    } else {
        result = "Unknown Grade";
    }

    // Output
    printf("Grade: %c\n", grade);
    printf("Text: %s\n", result);
    printf("Name: %s\n", name);
}






