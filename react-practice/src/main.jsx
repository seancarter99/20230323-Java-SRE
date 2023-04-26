import React from 'react'
import ReactDOM from 'react-dom/client'
import { I18nextProvider } from 'react-i18next'
import App, { x as y } from './App.jsx'
import i18n from './utils/i18n.js'

ReactDOM.createRoot(document.getElementById('root')).render(
  // Provides the translation context for my entire app
  <I18nextProvider i18n={i18n}>
    {/* Calls the App function and renders its returned JSX */}
    <App />
  </I18nextProvider>
)
