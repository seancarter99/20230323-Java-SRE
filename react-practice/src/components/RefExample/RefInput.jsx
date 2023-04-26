import { useState, useRef } from 'react';
import toast, { Toaster } from 'react-hot-toast';

/**
 * Controlled vs Uncontrolled Components
 * 
 * Native input tag is UNCONTROLLED
 * 
 * Uncontrolled - React does not have control over it. The element/component manages its own state
 *              - use Refs to gain access to the value of uncontrolled components
 * 
 * Controlled - React telling a component what to do and what value to hold
 *            - Use State to tell a element/component what to be
 */

export const RefInput = () => {
    const [inputVal, setInputVal] = useState('');
    const inputRef = useRef();
    
    function handleInputChange(event) {
        if (!event.target.value.includes('!')) {
            setInputVal(event.target.value);
        }
    }
    // inputRef.current represent the input tag its bound to

    return (
        <>
        {/* By default, input is uncontrolled */}
            <div>
                <label htmlFor="uncontrolled-input">Uncontrolled Input</label>
                <input id="uncontrolled-input" ref={inputRef} />
            </div>

            {/* Controlled Input */}
            <div>
                <label htmlFor='controlled-input'>Controlled Input</label>
                <input id="controlled-input" value={inputVal} onChange={handleInputChange} />
            </div>
            <button onClick={() => {toast(inputRef.current.value)}}>Submit</button>
            <Toaster />
        </>
    );
}