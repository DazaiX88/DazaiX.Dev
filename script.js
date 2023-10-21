/*
let js = 'amazing';
console.log(40 + 8 + 23 - 10);

console.log("Delon");
console.log(23);

let firstName = "Delon";
console.log(firstName);
console.log(firstName);
console.log(firstName);

let _new = 27;


let javascriptIsFun = true;
console.log(javascriptIsFun);

// console.log(typeof true);
console.log(typeof javascriptIsFun);
// console.log(typeof 23);
// console.log(typeof 'jonas');

javascriptIsFun = 'yes';
console.log(typeof javascriptIsFun);

let year;
console.log(year);
console.log(typeof year);

year = 1991;
console.log(typeof year);

console.log(typeof null);


let age = 30;
age = 31;

const birthYear = 1991
// birthYear = 1990;
// const jobs;

var job = 'programmer';
job = 'teacher';

lastName = 'tyson';
console.log(lastName);


const now = 2037;
const ageJonas = now - 1991;
const ageSarah = now - 2018;
console.log(ageJonas, ageSarah);

console.log(ageJonas * 2, ageJonas / 10, 2 ** 3);
// 2** 3 means 2 to the power of 3 = 2 * 2 *2

// Math operators
const firstName = 'Jonas';
const lastName = 'Tyson';
console.log(firstName + ' ' + lastName);

// Assignment operators
let x = 10 + 5; // 15
x += 10; // x = x + 10 = 25
x *= 4; // x = x * 4 = 100
x++; // x = x + 1= 101
x--;
x--;
console.log(x);

// Comparison operators
console.log(ageJonas > ageSarah); // >, <, >=, <=
console.log(ageSarah >= 18);

console.log(now - 1991 > now - 2018);


const now = 2037;
const ageJonas = now - 1991;
const ageSarah = now - 2018;
console.log(now - 1991 > now - 2018);

let x, y;
x = y = 25 - 10 - 5; // x = y = 10, x = 10
console.log(x, y);

const averageAge = (ageJonas + ageSarah) / 2;
console.log(ageJonas, ageSarah, averageAge);
*/

//stores in variable for BMI
const massMark = 78;
const heightMark = 1.69;
const massJohn = 85;
const heightJohn = 1.76;
// Calculates BMI

const BMIMark = massMark / heightMark ** 2;
const BMIJohn = massJohn / (heightJohn * heightJohn);
const markHigherBMI = BMIMark > BMIJohn;
// console.log(BMIMark, BMIJohn);
// console.log(BMIMark > BMIJohn);
console.log(BMIMark, BMIJohn, markHigherBMI);
console.log(BMIJohn);