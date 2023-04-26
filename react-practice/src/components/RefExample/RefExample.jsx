import { useState, useRef } from 'react';
import { RefInput } from './RefInput';

/**
 * useRef
 * 
 * Similar to useState
 * Returns a reference that is persisted between rerenders
 * Updating the reference does NOT cause a rerender
 * 
 * We can use refs to gain access to a native HTML element
 * In React, we do NOT use document.getElement
 *  
 */

export default function RefExample() {

    // const [count, setCount] = useState(0);
    const [dummyState, setDummyState] = useState(false);
    const count = useRef(0);
    // let regularCount = 0; // NOT persisted between rerenders

    function increment() {
        count.current++;
        // regularCount++;
        console.log(count);
        // console.log(regularCount);
    }

    return (
        <>
            <div>
                Current Count: {count.current}
                {/* Current Count: {regularCount} */}
            </div>
            <button onClick={increment}>+</button>
            <button onClick={() => setDummyState(!dummyState)}>Rerender Component</button>
            <div>
                <RefInput />
            </div>
        </>
    );
}