import { createContext } from "react";

// This is the style object to read from in the context
export const themes = {
    light: {
        background: '#EEEEEE',
        color: 'black'
    },
    dark: {
        background: '#222222',
        color: 'white'
    }
}

// The context itself
const ThemeContext = createContext();

export default ThemeContext;