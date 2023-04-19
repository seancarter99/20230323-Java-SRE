/**
 * Closure
 * 
 * A function that retains access to variables and values defined in its outside lexical environment
 */


function outerFn() {
    let x = 10;
    
    function innerFn() {
        console.log(x);
    }

    innerFn();
}

outerFn();

// In JS, functions are first class citizens (you can pass functions as params AND return functions)
function greeterGenerator(name) {

    // I want to return a new function that greets the person with that name
    // Name is optional since we're returning it
    return function() {
        // Using a template string
        console.log(`Hello, ${name}`);
        // console.log('Hello, ' + name);
    }

}

let myFn = function() {} // Also a valid function definition

// greetSylvia IS a function
const greetSylvia = greeterGenerator('Sylvia');
greetSylvia();
const greetSean = greeterGenerator('Sean');
// Even with multiple functions returned, they each hold their own lexical environment (greetSylvia -> Sylvia, Sean -> Sean)
greetSylvia(); // Hello, Sylvia
greetSean();

// You don't have to catch the value in a variable
// greeterGenerator('Padma')() -> function() {console.log('Hello, Padma')}() -> whatever the function runs as
greeterGenerator('Padma')();

// IIFE (Immediately Invoked Function Expression)

(function() {
    console.log('IIFE!');
})();

// This function takes in a value for x and returns a new function that times x by some parameter
function timesX(x) {
    return function(y) {
        return x * y;
    }
}

const times10 = timesX(10);

console.log(times10(2)); // 20
console.log(times10(11)); // 110

const times3 = timesX(3);