// Function generates a counter that maintains its own count and exposes increment and decrement functions

// Encapsulation through closures
function counterFactory() {
    let currentCount = 0;

    function increment() {
        currentCount++;
    }

    function decrement() {
        privateHelper();
        currentCount--;
    }

    function getCount() {
        return currentCount;
    }

    function privateHelper() {
        console.log('Helper!');
    }

    // What I return from this function is "public"
    // What isn't returned is "private"

    return {
        // Returns the actual function itself. DOES NOT call it
        increment,
        decrement,
        getCount
    }
}

const myCounter = counterFactory();
console.log(myCounter.getCount());
myCounter.increment();
myCounter.increment();
myCounter.increment();

console.log(myCounter.getCount()); // 3
myCounter.decrement();
