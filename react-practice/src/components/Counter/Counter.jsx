import { useState, useEffect, useContext } from "react";
import ThemeContext from "../../contexts/theme";

// This component can't unrender itself
// But.. it's parent can
export default function Counter() {

    // console.log('Hello!'); // Don't do this

    // React does NOT recognize this variable as "state"
    // let count = 0;

    // useState takes the default value of the state as a parameter
    // useState returns an array with the 0 index as the state variable and the 1 index as the setter for it
    const [count, setCount] = useState(0);
    const theme = useContext(ThemeContext);

    /**
     * useState() {
     *  function setterForThatState() {
     *   // Invoke ReactDOM
     * }
     * 
     *  return [userState, setterForThatState]
     * }
     */

    /**
     * useEffect
     * 
     * Allows us to tap into a component's lifecycle
     * 
     * 1. Component Initialization (on mount)
     * 2. State Update (did update)
     * 3. Component Destruction (will unmount)
     * 
     * When a item in a useEffect's dependency list changes, it will rerun the useEffect callback
     */

    // This useEffect runs on mount AND on every update to state
    // useEffect(() => {
    //     console.log('Inside useEffect!');
    // }); 

    // This useEffect ONLY runs on mount
    // This is the standard useEffect for data fetching
    // useEffect(() => {
    //     console.log('Component Mounted!');
    //     // fetches the JSON data from the backend
    // }, []);

    // This useEffect runs each time count changes AND on mount
    // In a form, each time the user changes input, rerun form validation (ie. does password conform)
    useEffect(() => {

    }, [count]);

    // Teardown
    // If a useEffect returns a function, that function will be called before it unmounts from the DOM
    useEffect(() => {
        const intervalKey = setInterval(() => {
            console.log(new Date());
        }, 1000);

        return () => {
            // Tear down logic
            // Clear Interval
            clearInterval(intervalKey);
        }
    }, []);

    function increment() {
        // 2 options for invoking setter
        // 1. Pass a value that will become the new value of the state
        setCount(count + 1);
        // 2. Pass a function to invoke and what it returns will be the new value of the state
        // setCount(copyOfTheState => copyOfTheState + 1);
        console.log(count);
    }

    return (
        // This is a fragment. It provides us a way to return multiple JSX elements
        // Fragments are NOT rendered in the HTML document

        <div style={theme}>
            {/* This is a JSX comment. It does NOT appear in the browser */}
            <h1>Current Count: {count}</h1>
            <button onClick={increment}>+</button>
            <button>-</button>
        </div>
    );
}