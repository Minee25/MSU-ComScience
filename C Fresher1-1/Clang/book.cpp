#include <stdio.h>

int main() {
  int readPageBook = 30, page = 0, day = 0;

  printf("Page: ");
  scanf("%d", &page);

  while (page > 0 ) {
    page = page - readPageBook;
    day = day + 1;
  }

  printf("Day: %d", day);
  
  return 0;
}
