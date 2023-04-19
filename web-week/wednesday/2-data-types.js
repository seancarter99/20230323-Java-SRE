/**
 * Even though JS is NOT a strongly typed language, JS DOES have types
 * 
 * We don't the declare the types, but the variables know their types
 * 
 * Primitives:
 * - number (integers AND floats)
 * - string (chars AND strings)
 * - boolean
 * - undefined (The abscence of a value. "I didn't give it a value or it doesn't exist")
 * - null (Null is something you intentionally set for a variable)
 * - BigInt (Huge numbers) (1n)
 * - Symbol (More for JS as an identifier. Function symbol, JS knows this is a function if it has the symbol)
 * 
 * Non-Primitives:
 * - object (objects, arrays, functions, etc.)
 */


// typeof operator to get the type

console.log(typeof 1n); // 1f for float

// Casting
// int x = (int) 42.0;
let x = 50;

// Cast to a string
x = String(x);
// x = ""+x;
console.log(typeof x);

// Cast to a boolean
// x = Boolean(x);
x = !!x; // !!50 -> !false -> true 
console.log(typeof x);