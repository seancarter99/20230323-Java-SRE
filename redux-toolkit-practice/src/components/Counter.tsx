import { useRef } from 'react';
import { useSelector, useDispatch } from 'react-redux';
import { increment, decrement, set } from '../slices/counterSlice';

export function Counter() {
    // useSelector allows us to read a particular set of state from my store
    // const store = useSelector(store => store); // Gives the entire store
    const {count} = useSelector((store: any) => store.counter);
    // dispatch is the same as we used with useReducer
    const dispatch = useDispatch();

    const inputRef = useRef<HTMLInputElement>(null);

    console.log(count);
    return (
        <>
            <h1>Counter: {count}</h1>
            <button onClick={() => dispatch(increment())}>+</button>
            <button onClick={() => dispatch(decrement())}>-</button>
            <input type="number" ref={inputRef} />
            <button onClick={() => dispatch(set(Number(inputRef?.current?.value)))}>Set Count</button>
        </>
    )
}