// Components are functions
import { useState } from "react";
import { Article } from "./components/Article/Article";
import Counter from "./components/Counter/Counter";
import RefExample from "./components/RefExample/RefExample";
import ThemeContext, { themes } from "./contexts/theme";
import { useTranslation } from "react-i18next";
import './index.css';

// function App() {}

const App = () => {
    console.log('App!')
    const [shouldRender, setShouldRender] = useState(false);
    const [theme, setTheme] = useState(themes.light);

    const { t, i18n } = useTranslation();

    const toggleTheme = () => {
        let newTheme = theme === themes.light ? themes.dark : themes.light;
        setTheme(newTheme);
    }

    const changeLanguage = lng => {
        i18n.changeLanguage(lng);
    }

    return (
        <ThemeContext.Provider value={theme}>
            <h1>Hello World!</h1>
            <button onClick={toggleTheme}>Toggle Theme!</button>
            <button onClick={() => setShouldRender(!shouldRender)}>Toggle Counter</button>
            {/* If shouldRender is truthy, return the right side */}
            {/* If shouldRender is falsy, return the left side */}
            {shouldRender && <Counter />}
            {/* {shouldRender ? <Counter /> : null} */}
            {/* <Counter /> */}
            {/* <Counter /> */}
            <RefExample />

            <Article title="Reasons to Use Angular" author="Sylvia">
                <div>There is no reason</div>
            </Article>
            <Article title="Reasons to Use React" date={new Date().toString()} author="Lily">
                <p>React is awesome!</p>
                <p>End of story!</p>
            </Article>
            <Article title="My Article" date={new Date().toString()} author="Sean">
                <p>{t('Greeting')}</p>
                <p>{t('Description')}</p>
            </Article>
            <div>
                <button onClick={() => changeLanguage('en')}>{t('EN')}</button>
                <button onClick={() => changeLanguage('de')}>{t('DE')}</button>
            </div>
        </ThemeContext.Provider>
    );
}

// Unlike Java, in JS you need to manually export stuff

// Default export
// You may only have one default export per file
// In the other where they import it, they can call it whatever they want
export default App;

// Named export
// When importing, they use destructure syntax and destructure out x
export const x = 10;