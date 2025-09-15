# FirstApp (Jetpack Compose)

This project converts `welcome_mock.html` into a native Android app built with Kotlin and Jetpack Compose, without using WebView.

## Features
- Two screens: "Scans" and "My card".
- Bottom navigation to switch between screens.
- Material 3 theme with brand colors similar to the HTML mock.

## Build & Run
1. Open this folder in Android Studio (Giraffe or newer).
2. Let Gradle sync. Ensure you have JDK 17.
3. Run the app on an emulator or device (minSdk 24).

## Structure
- `app/src/main/java/com/example/firstapp/MainActivity.kt`: App entry and UI.
- `app/src/main/java/com/example/firstapp/ui/theme/`: Compose theme colors.
- `app/src/main/res/values/`: App resources.

## Notes
- The UI is built with Compose and does not use WebView.
- You can adjust font sizes, spacing, or add animations to better match your exact design.
