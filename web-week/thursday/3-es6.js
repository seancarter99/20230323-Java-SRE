// ES stands EcmaScript
// ES6 was a hallmark addition to JS (2015)

// Arrow functions
[1, 2, 3].map(() => 'Hello'); // Takes no params and it returns Hello

/**
 * For only one parameter the () are optional
 * For zero or 2+ params, the () are required
 * 
 * For one line functions, the {} are optional
 * For zero or 2+ line functions, the {} are required
 * 
 * If there are {} for the function, the line is returned (not allowed)
 * If {} are present, return keyword is required to return (otherwise void)
 * 
 * 
 * a => a * 2 (Valid)
 * a => a
 * a, b => a * b
 * (a) => {} (Valid) Does nothing
 */

// This is pretty common for function definition
const myFn = () => {
    // This in an arrow function actually refers to the window object. Same as global scope
};

// Spread Operator
// ...
// Takes an iterable and fans it out

const charArray = [..."Johnny"]; // ["J", "o", "h", "n", "n", "y"]
console.log(charArray);

// Combine arrays with spread
const newArray = [...charArray, '!']; // Creates a new array with the old array and a ! at the end

console.log(newArray);


// Spread with objects
// Objects are NOT iterable, but they are special exception

const obj = {
    firstName: 'Sean',
    lastName: 'Carter'
}

// Copying the contents of the old object into a new one
const newObj = {
    firstName: 'Shawn', // This is a default value if the object doesn't contain a firstName
    ...obj,
    favColor: 'Blue'
}

console.log(newObj);

// Destructuring
// Object Destructuring

// Declares two variables with those names and assigns them with the value in the object
const {firstName, favColor} = newObj;
console.log(firstName);


// With a function
const printPersonDetails = ({firstName, favColor}) => {
    // console.log(`First Name: ${personObj.firstName}`);
    console.log(`First Name: ${firstName}`);
    console.log(`Favorite Color: ${favColor}`);
}

printPersonDetails({favColor: 'Blue', firstName: 'Sean'});

// Array Destructuring
const nums = [6, -10, 50, 8];
const [num1, num2, num3] = nums;

// Skipping elements
const [,,,num4] = nums;

// Rest Operator
// ...
// Rest takes many items and consolidates into one

// Array destructuring with rest

const daysOfTheWeek = ['Monday', 'Tuesday', 'Wednesday'];
const [monday, ...otherDays] = daysOfTheWeek;

console.log(monday);
console.log(otherDays); // ['Tuesday', 'Wednesday']
//                                                           Everything from 4th param on is stored in an array
const printTop3Movies = (firstPlace, secondPlace, thirdPlace, ...runnerUps) => {
    console.log('The top movie is: ' + firstPlace); // 1
    console.log(`The second place movie is: ${secondPlace}`); // 2
    console.log(`The third place movie is: ${thirdPlace}`); // 3
    console.log(`The runner ups are: ${runnerUps}`); // All the others
}

const movies = ['Fast and Furious', 'The Dark Knight', 'Harry Potter', 'The Whale', 'John Wick 4', 'The Way of the Water', 'Avatar', 'The Godfather', 'Goodfellas'];

// printTop3Movies('Fast and Furious', 'The Dark Knight', 'Harry Potter', 'The Whale', ...);
printTop3Movies(...movies);

//                                               rest is all the other properties stored in an object
const spreadWithObject =  ({firstName, lastName, ...rest}) => {

}

// Nullish Coalescing Operator
// || &&
// ??

const portVal = null;

// Based on the value of the variable, use its value, but if it's null/undefined, use some default
const port = portVal ?? 8080; // Use portVal if not null/undefined, otherwise, use 8080

console.log(port);


// Optional Chaining
// ?.
// Useful for using the . notation on an object multiple layers deep

const nestedObj = {
    prop: {
        address: {
            street: '4th Street',
            number: 60
        }
    }
}

nestedObj.prop = undefined;
// Printing the street number
// If it would break, just use undefined
let number = nestedObj.prop?.address?.number;

number = number ?? 1;