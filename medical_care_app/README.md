# MediConnect: Smart Healthcare Management

MediConnect is a professional Android-based healthcare management application for booking doctor appointments, accessing curated medical articles all in one place.  

This project combines Android Studio’s powerful UI capabilities with Firebase for secure authentication and cloud data handling. It does not enforce a specific backend architecture, so you are free to extend or adapt it to your own healthcare solution needs.  

---

## Homepage  
[GitHub Repository](https://github.com/Veda2806/MediConnect)  

---
## 🎥 Demo Video
[![MediConnect Demo](https://raw.githubusercontent.com/Veda2806/MediConnect/main/demo-screenshot.png)](https://drive.google.com/file/d/1TmZImcHxKCacJKlQByTM8SpwhiKFnH15/view?usp=drive_link)



## About This Repository  
This repository contains the complete Android Studio project for MediConnect.  
Some files and settings (such as `.idea/` or Gradle wrapper files) are solely for development in Android Studio and are not part of the user-facing APK.  

The app’s core functionality resides in the `/app` module, which contains Java source files, layouts, and resources.  

---

## Features  
- **Appointment Management** – Book, view, and manage doctor appointments.  
- **Curated Health Articles** – Access verified medical content and tips.   
- **Firebase Integration** – Secure login, authentication, and cloud storage.  
- **User-Friendly Interface** – Clean navigation and responsive design.  

---

## Tech Stack  
- **Frontend:** Android Studio (Java)  
- **Backend:** Firebase, MySQL  
- **Database:** Firebase Firestore / Realtime Database  
- **Build System:** Gradle  

---

## Project Structure  
```
MediConnect/
├── app/                 # Source code
├── gradle/              # Gradle wrapper files
├── build.gradle         # Project-level build configuration
├── settings.gradle      # Module inclusion
├── README.md            # Project documentation
```

---

## Quick Start  

### Prerequisites  
- Android Studio installed  
- Firebase project configured  
- Internet connection  

### Installation  
```bash
git clone https://github.com/Veda2806/MediConnect.git
cd MediConnect
# Open in Android Studio
```

---

## Browser Support  
MediConnect targets **Android 6.0 (Marshmallow)** and above. Functionality may vary on older devices.  

---

## Contributing  
We welcome contributions to MediConnect!  
If you’d like to improve the app, please:  
1. Fork this repository  
2. Create a feature branch (`git checkout -b feature-name`)  
3. Commit changes (`git commit -m 'Add feature-name'`)  
4. Push to your branch and open a Pull Request  

