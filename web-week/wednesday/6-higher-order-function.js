/**
 * Higher Order Function (HOF)
 * 
 * A function that either takes a function as a parameter OR returns a function
 */

// Loops over an array and performs some function on each item

function processItems(action, items) {
    // for (int num : nums)
    for (let item of items) {
        let ret = action(item); // Action is just some function that takes a parameter
        console.log(`Returned value: ${ret}`);
    }
    // for (let i = 0; i < array.length; i++) {

    // }
}

function printItem(item) {
    console.log(item);
    // If a function returns nothing, JS returns undefined for us
}
const nums = [1, 3, 7];

// This passes in the return of printItem
// processItems(printItem());

processItems(printItem, nums);

// Define the function inline
processItems(function(item) { return item * 2}, nums); // 

// Arrays have built in HOFs

/**
 * forEach - Loops for each element in an array and performs some action on each item of the array. Returns nothing
 * map - Same as for each, but the return from map is a new array with the returned values from our callback function
 * filter - Takes a function that returns true or false. If true, the item is kept. If false, the item is removed
 *           Returns a new array only consisting that met the criteria
 * reduce - Takes a function that reduces/consolidates the array to a single value
 */

const fruits = ['Strawberry', 'Mango', 'Strawberry', 'Grape', 'Watermelon', 'Lemon', 'Tomato', 'Guava', 'Apple', 'Pineapple', 'Canteloupessss', 'Honeydew', 'Blueberry', 'Blackberry', 'Raspberry'];

fruits.forEach(function(fruit, index, copyOfFruitsArray) {
    console.log(`Fruit at index ${index}: ${fruit}`);   
});

const upperCasedFruits = fruits.map(function(fruit) {
    return fruit.toUpperCase();
});

console.log(fruits); // Original array is always unchanged
console.log(upperCasedFruits);

const berries = fruits.filter(function(fruit) {
    return fruit.toLowerCase().includes('berry');
});

console.log(berries);

const numbers = [10, -20, 30, 8, 5];

// Find the total sum of the array
const sum = numbers.reduce(function(acc, num) {
    // Add the current sum with the num currently being looked at
    // The return will be 'acc' in the next iteration of the loop
    return acc + num;
});
console.log(sum);

// Find the max of an array
const max = numbers.reduce(function(currMax, num) {
    return currMax > num ? currMax : num;
    // return Math.max(currMax, num);
});

console.log(max);


// String them together (pipeline or assembly line)

// You can't use forEach because it doesn't return an array
const bestFruit = fruits
                    .map(function(fruit) { return fruit.toUpperCase() })
                    .filter(function(fruit) { return !fruit.includes('APPLE')})
                    .reduce(function(bestFruit, fruit) {
                        return bestFruit.length > fruit.length ? bestFruit : fruit;
                     });
console.log(bestFruit); 