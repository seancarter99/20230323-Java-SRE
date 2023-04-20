// In JS, we can interface the HTML using the DOM tree
// DOM is just an in memory representation of the HTML tree
// DOM stands for Document object model

const createBoxButton = document.getElementById('create-box-button'); // Returns one element matching that id
let boxNumber = 0;

// They monitor for when a user specific action occurs and runs a callback function when it does
createBoxButton.addEventListener('click', () => {
    boxNumber++;
    console.log('Event triggering');
    // Create a new div
    const div = document.createElement('div');

    // Give it the class name of box
    div.setAttribute('class', 'box');
    // Adding text to the box
    div.innerText = `<script></script>`

    // Add it to the container div
    const container = document.getElementById('box-container');
    container.appendChild(div);
});


// AJAX XHR
// fetch
// axios

// window.addEventListener('DOMContentLoaded', main);