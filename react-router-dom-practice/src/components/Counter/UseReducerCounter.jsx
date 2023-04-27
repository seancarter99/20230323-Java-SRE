import { useReducer, useRef } from "react";
// useReducer

/**
 * useReducer is to useState
 * It also gives us "state"
 * It is built for more complicated state management
 * 
 * 
 * A reducer is simply a function that takes in the previous state AND an action
 * Then, returns the next version of the state depending on the action
 * 
 * INCREMENT
 * DECREMENT
 * SET
 */

export default function UseReducerCounter() {

    // function dispatch(action) {
//         reducer(state, action);
    // }

    //              oldState  action
    const reducer = (state, action) => {
        console.log(action);
        switch(action.type) {
            case 'INCREMENT':
                return {...state, count: state.count + 1};
                /// return ...;
            case 'DECREMENT':
                // state = {count: 0}
                // return {count: 0, count: 0 + 1}
                // return {count: 1}
                return {...state, count: state.count - 1};
            case 'SET':
                // User passes in a number, and we update the count to that number
                // action.payload -> Parameter passed to us
                return {...state, count: action.payload}
            default: // None of the recognized action types matched the user's action request
                // Just use old version of the state
                return state; // {count: 0} -> 0
        }
    }

    //    stateVar  function to talk to reducer    reducer,    initialState
    // const [state, dispatch] = useReducer(() => {}, {count: 0, name: ''});
    const [state, dispatch] = useReducer(reducer, {count: 0});

    const inputRef = useRef();

    // dispatch takes an action as a parameter
    // dispatch({type: 'INCREMENT'})
    // dispatch({type: 'DECREMENT'})
    // dispatch({type: 'SET', payload: 5})


    return (
        <>
            <h1>useReducer</h1>
            <h2>Count: {state.count}</h2>
            <button onClick={() => dispatch({type: 'INCREMENT'})}>+</button>
            <button onClick={() => dispatch({type: 'DECREMENT'})}>-</button>
            <input type="number" ref={inputRef} />
            {/* inputRef -> {current: <input value="100" />} */}
            <button onClick={() => dispatch({type: 'SET', payload: Number(inputRef.current.value)})}>Set Count</button>
        </>
    );
}