#include <stdio.h>

int main() {
  int start, end;

  printf("Number (1): ");
  scanf("%d", &start);  // 1
  printf("Number (2): ");
  scanf("%d", &end);  // 3

  // for (int i = start; i <= end; i++) {
  //   printf("Mom = %d\n", i);
  //   for (int j = 1; j <= 12; j++) {
  //     printf("%d x %d = %d\n", i, j, i * j);
  //   }
  // }
 
  while (start <= end) {
    int i = 1;
    printf("Mom = %d\n", start);
    while (i <= 12) {
      printf("%d x %d = %d\n", start, i, start * i);
      i ++;
    }
    start ++;
  }

  return 0;
}
