# MyBookApp

MyBookApp is a simple Android (Java) application built for learning MVC development (Java+XML) that demonstrates multi-activity navigation, implicit intents, object passing between activities, resource management, and lifecycle state handling.

---

## Features

- **Multi-Activity Navigation**: The app consists of three activities demonstrating navigation between screens.
- **Object Passing**: Book objects (title, author, year) are passed between activities using Serializable.
- **Resource Management**: Supports alternative resources such as language-specific colors and layouts.
- **User-Friendly UI**: Simple and clean interface for inputting and viewing book details.

---
## Demo Video
Video link to view the app features and implementation: https://youtu.be/5EGAWQkevic

Video link for phone screen (Emulator) recording:   https://youtu.be/_ZtWIdsCH9U    

## Project Structure
BookApp/
├─ app/                     # Contains source code and resources
│   ├─ src/main/java/        # Java source code
│   ├─ src/main/res/         # Layouts, images, values
│   └─ AndroidManifest.xml   # App manifest
├─ gradle/                   # Gradle wrapper
├─ gradlew                   # Gradle wrapper script (Windows)
├─ gradlew.bat               # Gradle wrapper script (Unix/Linux/Mac)
├─ build.gradle              # Project-level Gradle file
├─ settings.gradle           # Project settings
├─ gradle.properties         # Optional project properties



> **Note**: The `build/`, `.gradle/`, `.idea/` folders and `local.properties` file are excluded to keep the repository clean.

---

## Installation


1. Clone the repository:

git clone https://github.com/YourUsername/MyBookApp.git


2. Open the project in Android Studio.

3. Let Gradle sync the project (Android Studio will download necessary dependencies).

4. Run the app on an emulator or a connected Android device.

## Usage

1. Launch the app.

2. Enter book details (title, author, year) in the first activity.

3. Navigate to the next activity to view or edit book details.

4. Explore object passing and alternative resources.

## Requirements

1. Android Studio (latest stable version recommended)

2. Java JDK (included with Android Studio)

3. Minimum SDK: 21 (Android 5.0 Lollipop)

4. Target SDK: Latest available in Android Studio
