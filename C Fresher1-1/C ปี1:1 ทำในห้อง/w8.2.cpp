#include <stdio.h>

int main() {
    char text, *choice;

    printf("[c] Circle\n");
    printf("[r] Rectangle\n");
    printf("[t] Triangle\n");
    printf("[x] Exit\n");

    printf("Please select choice: ");
    scanf(" %c", &text);

    if (text == 'c' || text == 'C') {
        choice = "Circle";
    }
    else if (text == 'r' || text == 'R') {
        choice = "Rectangle";
    }
    else if (text == 't' || text == 'T') {
        choice = "Triangle";
    }
    else if (text == 'x' || text == 'X') {
        choice = "Exit";
    }
    else {
        choice = "Invalid choice!";
    }

    printf("You select choice = %s\n", choice);
}
