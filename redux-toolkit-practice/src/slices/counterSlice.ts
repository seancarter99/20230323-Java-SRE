import { createSlice } from '@reduxjs/toolkit';

const counterSlice = createSlice({
    name: 'counter',
    initialState: {
        count: 0
    },
    reducers: {
        increment: (state) => {
            // Mutate the state directly with redux toolkit
            state.count += 1;
            // return {...state, state.count + 1}
        },
        decrement: state => { state.count -= 1 },
        set: (state, action) => {
            state.count = action.payload;
        }
    }
});

// Actions
// counterSlice.actions is an object containing all of the different actions
// ex. {type: 'INCREMENT'}
export const { increment, decrement, set } = counterSlice.actions;

// Reducer
export default counterSlice.reducer;