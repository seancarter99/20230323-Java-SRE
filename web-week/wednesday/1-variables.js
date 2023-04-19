// int x = "";

/**
 * 3 Different Variable Definitions
 * 
 * var - Function scoped OR global scoped (depending on where you declare it)
 * let - Block scoped variable
 * const - Block scoped variable AND no reassignment (final keyword in Java)
 */

console.log(x);
var x = 10; // Variable hoisting

/**
 * Variable Hoisting is the "hoisting" the declaration to the top of the variable's scope
 * 
 * For let and const, the area between the actual initialization and the top of its scope is the
 * 
 * "Temporal Dead Zone". It's value, if tried to be accessed, will throw an Error
 */

// Global Scoped
var y = 10; // For var, you can redeclare the same variable multiple times

function myFunction() {
    var x = 50; // Function scoped
    console.log(x); // 10 or 50?
    if (false) { // This block never runs
        var myVar = "Sean"; // Function Scoped
        const myLet = "Sean"; // Block scoped variable (top of if it is declared)
    }
    console.log(myVar); // undefined
    // console.log(myLet); // Throw an error (not defined)
}

myFunction();

const a = 'a';

// a = 'a'; // Reassignment is not allowed for const