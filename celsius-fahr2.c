#include <stdio.h>
/* this file creates an accurate temperature using floating point*/
/* print celsius to fahrenheit table
    for fahr = 0, 10, ..., 300; floating-point version */
/* celsius to fahr exercise*/

main()
{
    float celsius, fahr;
    int lower, upper, step;
    
    lower = -17; /* lower limit of temperature table */
    upper = 300; /* upper limitn*/
    step = 10; /*step size*/
    
    celsius = lower;
    printf("Celsius Fahrenheit\n");
    while (celsius <= upper) {
        fahr = 32.0 + (celsius * 1.8);
        printf("%5.1f %6.1f\n", celsius, fahr);
        celsius = celsius + step;
    }
}
