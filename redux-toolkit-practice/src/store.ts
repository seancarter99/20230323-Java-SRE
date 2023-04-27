import { configureStore } from '@reduxjs/toolkit';
import counterReducer from './slices/counterSlice';

//            Create my store using these reducers
const store = configureStore({
    reducer: {
        // If you just use the variable name
        // It's shorthand for { counter: counter }
        counter: counterReducer
    }
});

export default store;