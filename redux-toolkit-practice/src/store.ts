import { configureStore } from '@reduxjs/toolkit';
import counterReducer from './slices/counterSlice';
import { storeApi } from './api/storeApi';

//            Create my store using these reducers
const store = configureStore({
    reducer: {
        // If you just use the variable name
        // It's shorthand for { counter: counter }
        counter: counterReducer,
        // Instead of choosing the name like above with 'counter' 
        // Whatever the value of storeApi.reducerPath is, that is the name of the property AKA the key
        [storeApi.reducerPath]: storeApi.reducer
    },
    // Middleware is just a function that runs at some point (similar to AOP)
    // Add the storeApi's middleware to the default middleware
    middleware: (defaultMiddleware) => defaultMiddleware().concat(storeApi.middleware)
});

export default store;