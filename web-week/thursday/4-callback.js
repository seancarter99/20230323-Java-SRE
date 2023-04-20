// Callback functions are simply functions that will be invoked at a later point in time

// setTimeout
// A function takes a function and a time. After the time elapses, the function will be invoked

setTimeout(() => {
    console.log('Inside setTimeout');
}, 3000); // After 3 second

console.log('Howdy');

// while(true) {
//     // Blocking operation
// }

// setInterval

// Similar to setTimeout, but it repeats the process on that time interval

// setInterval(() => {
//     console.log(new Date()); // Gets the current time
// }, 1000);

// clearInterval
// When we want to stop setInterval from executing at a certain point, we can clearInterval

// Count down from 10 every second. After 1, stop counting

let count = 10;

const countdownId = setInterval(() => {
    if (count <= 0) {
        console.log('Liftoff!');
        clearInterval(countdownId);
    }
    console.log(`Current Count: ${count}`);
    count--;
}, 1000);