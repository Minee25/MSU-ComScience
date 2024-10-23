#include <stdio.h>
#include <ctype.h>

int main() {
  char input[20];

  printf(">> ");
  scanf("%s", &input);

  // ลูปหาว่ามีตัวอักษรกี่ตัวใน input
  for (int i = 0; i < input[i]; i++) {
    // หาว่าไม่เป็นตัวเลขหรือไม่
    if (isdigit(input[i]) == false) {
      printf("%c", input[i]); // ไม่เป็นก็ printf ออกมา
    }
  }
}