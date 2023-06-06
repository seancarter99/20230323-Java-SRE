import { useState, useEffect } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {
  const [accessToken, setAccessToken] = useState('');

  useEffect(() => {
    fetch('http://localhost:8080/access', { credentials: 'include', method: 'GET' })
      .then(data => data.text())
      .then(token => setAccessToken(token)) // Do not set as state, stored in session storage OR in a HttpOnly cookie
      .catch(() => { /* Redirect to http://localhost:8080/signin */ } );
  }, []);

  return (
    <>
      <div><strong>Access Token: </strong>{accessToken}</div>
    </>
  )
}

export default App
