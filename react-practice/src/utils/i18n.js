// A config file containing all of the translations for my app

import i18n from "i18next";
import { initReactI18next } from "react-i18next";

i18n.use(initReactI18next).init({
    // Required
    resources: {
        // Call it what you want
        en: {
            // Required
            translation: {
                "Greeting": "Hello! Welcome to my app!",
                "Description": "This app was developed by Sean.",
                "EN": "English",
                "DE": "German"
            }
        },
        de: {
            translation: {
                "Greeting": "Hallo! Wilkommen in meine App!",
                "Description": "Diese App wurde von Sean entwickelt.",
                "EN": "Englisch",
                "DE": "Deutsch"
            }
        }
    },
    fallbackLng: 'en'
});

export default i18n;