#  MyRESTApp

**MyRESTApp** è un'applicazione Android, che offre un sistema di login e un menù con tre funzionalità principali: accesso a Netflix via WebView, ricerca di film per titolo attraverso API OMDb e gestione CRUD.

---

## 🛠 Funzionalità

### 🔐 Login
- La schermata iniziale presenta un form di login.
- Credenziali predefinite:
    - **Email**: `admin@gmail.com`
    - **Password**: `123456`
- La password viene criptata e verificata usando l'algoritmo **MD5**.
- Al login riuscito, l'utente viene reindirizzato al menù principale.

---

### 📋 Menù Principale

Dopo il login, l'utente accede a una schermata con tre pulsanti principali:

1. **🌐 Vai su Netflix**
    - Apre il sito ufficiale di Netflix utilizzando una WebView.

2. **🔍 Ricerca Film**
    - Permette di cercare film inserendo il **titolo** in un campo di input.
    - Mostra i risultati.

3. **🛠 Gestione CRUD**
    - Schermata per eseguire operazioni CRUD (Create, Read, Update, Delete).
---

## Tecnologie Utilizzate

- **Android SDK 35**
- **Java/Kotlin**
- **WebView**
- **MD5** per autenticazione

---

## Crediti

@amendola-scuola
