#include <stdio.h>
/* this file creates an accurate temperature using floating point*/
/* print Fahrenheit-celsius table
    for fahr = 0, 10, ..., 300; floating-point version */

main()
{
    float fahr, celsius;
    int lower, upper, step;
    
    lower = 0; /* lower limit of temperature table */
    upper = 300; /* upper limitn*/
    step = 10; /*step size*/
    
    fahr = lower;
    while (fahr <= upper) {
        celsius = (5.0/9.0) * (fahr - 32.0);        printf("%3.0f %6.1f\n", fahr, celsius);
        fahr = fahr + step;
    }
}
