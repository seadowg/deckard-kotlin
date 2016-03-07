# Deckard
[![Build Status](https://travis-ci.org/robolectric/deckard.svg?branch=master)](https://travis-ci.org/robolectric/deckard)
[![Circle CI](https://circleci.com/gh/robolectric/deckard.svg?style=svg)](https://circleci.com/gh/robolectric/deckard)

Deckard is the simplest possible Android application project that uses Robolectric/Espresso for testing and Gradle to build. It has one Activity, a single Robolectric test of that Activity, and an Espresso test of that Activity.

Deckard imports easily into the latest editions of Android Studio with minimal setup.

## Setup

*Note: These instructions assume you have a Java 1.8 [JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html) installed.*

To start a new Android project:

1. Install [Android Studio 1.5.1](http://developer.android.com/sdk/index.html).
2. Run the [Android SDK Manager](http://developer.android.com/tools/help/sdk-manager.html) and install `API 23`, `Build-tools 23.0.2` and the support library. You can also install the packages from the terminal, using [android](https://developer.android.com/tools/help/android.html) from your `sdk/tools/` directory:
```bash
android update sdk --all --no-ui --filter build-tools-23.0.2 && \
android update sdk --all --no-ui --filter android-23 && \
android update sdk --all --no-ui --filter extra-android-support && \
android update sdk --all --no-ui --filter extra-android-m2repository
```
3. Download Deckard from GitHub:
```bash
wget https://github.com/robolectric/deckard/archive/master.zip
unzip master.zip
mv deckard-master my-new-project
```
4. Create a `local.properties` [file](http://tools.android.com/tech-docs/new-build-system/user-guide#TOC-Simple-build-files) in the root of the project that points to
5. In the project directory you should be able to run the Robolectric tests:
```bash
./gradlew clean test
```
6. You should also be able to run the Espresso tests:
```bash
./gradlew clean connectedAndroidTest
```
Note: Make sure to start an Emulator or connect a device first so the test has something to connect to.
7. Change the names of things from 'Deckard' to whatever is appropriate for your project. Package name, classes, build.gradle, and the AndroidManifest are good places to start.
8. Build an app. Win.

## Android Studio Support

### Compatibility
Deckard is designed to run against Android Studio 1.5.1 with [Unit Testing support](https://sites.google.com/a/android.com/tools/tech-docs/unit-testing-support) enabled in Studio's Gradle settings.

### Importing
Import the project into Android Studio by selecting 'Import Project' and selecting the project's `build.gradle`. When prompted, you can just pick the default gradle wrapper.

### Running the Robolectric Test
To run Robolectric tests (example can be found in DeckardActivityTest) open Studio's
"Build Variants" pane and change the "Test Artifact" to "Unit Tests". You can then run
Robolectric tests using the JUnit test runner.

### Running the Espresso Test
To run Espresso tests (example can be found in DeckardEspressoTest) open Studio's
"Build Variants" pane and change the "Test Artifact" to "Android Instrumentation Tests".
You can then run Espresso tests using the Android test runner.
