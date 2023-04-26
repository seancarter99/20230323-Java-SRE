import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { AppNav } from './components/Navigation';
// import { Home } from './pages/Home';
// import { AboutMe } from './pages/AboutMe';
// import { Error } from './pages/Error';
import { Home, AboutMe, Error } from './pages';

export default function App() {
    return (
        <BrowserRouter>
            <AppNav />
            <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/about-me" element={<AboutMe />} />
                <Route path="*" element={<Error />} />
            </Routes>
            {/* <Footer /> */}
        </BrowserRouter>
    )
}