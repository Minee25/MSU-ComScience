// 67011212030
// ∑—°…‘≥ ¡«≈ ∂¢
#include <stdio.h>

int main() {
    int salary, ageWork;
    float newSalary, totalSalary, oneYear;
    char *experince;

    printf("Enter your salary: ");
    scanf("%d", &salary);
    printf("Enter your ageWork: ");
    scanf("%d", &ageWork);

    if (ageWork < 10) {
        newSalary = salary * 7.125 / 100;
        totalSalary = salary + newSalary;
        experince = "Junior";
    } else {
        newSalary = salary * 13.25 / 100;
        totalSalary = salary + newSalary;
        experince = "Senior";
    }
    oneYear = totalSalary * 12;

    printf("\n");
    printf("Experience: %s\n", experince);
    printf("Salary: %d\n", salary);
    printf("NewSalary: %.2f\n", newSalary);
    printf("TotalSalary: %.2f\n", totalSalary);
    printf("OneYear: %.2f\n", oneYear);
}
