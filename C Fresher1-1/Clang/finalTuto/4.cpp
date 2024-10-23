#include <stdio.h>

int main() {
  int n;

  printf("กรุณาใส่จำนวนจำนวนเต็ม: ");
  scanf("%d", &n);

  int numbers[n];

  printf("กรุณาใส่ตัวเลข:\n");
  for (int i = 0; i < n; i++) {
    scanf("%d", &numbers[i]);
  }

  for (int i = 0; i < n; i++) {
    printf("%d = ", numbers[i]);

    for (int j = 2; j < numbers[i]; j++) {
      if (numbers[i] % j == 0) {
        printf("%d,", j);
      }
    }
    printf("\b \n");
  }
  return 0;
}
