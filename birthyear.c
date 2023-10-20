#include <stdio.h>

int main()
{
    int present, birthyear, age;
    
    present = 2023;
    
    
    printf("Enter your age:");
    scanf("age");
    printf("Birthyear Present:\n");
    while (scanf("%d", &age) == 1) {
        birthyear = present - age;
        printf("%4d %9d\n", birthyear, present);
        
    
    }
}
