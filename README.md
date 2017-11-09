Deckard
=======

[![Build Status](https://travis-ci.org/seadowg/deckard-kotlin.svg?branch=master)](https://travis-ci.org/seadowg/deckard-kotlin)

Deckard is the simplest possible Kotlin Android application project that uses Robolectric for testing and Gradle to build. It has one Activity and a single Robolectric test of that Activity.

Deckard imports easily into the latest editions of Android Studio with minimal setup.

Setup
-----

*Note: These instructions assume you have a Java 1.8 [JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html) installed.*

To start a new Android project:

1.	Install [Android Studio 3.0](http://developer.android.com/sdk/index.html).
2.	Download Deckard-Kotlin as a zip [here](https://github.com/seadowg/deckard-kotlin/archive/master.zip) and then extract it on your dev machine.

3.	Import the template into Android Studio by clicking "Import project" and selecting the project directory.

4.	Change the names of things from 'Deckard' to whatever is appropriate for your project. Package name, classes, build.gradle, and the AndroidManifest are good places to start.

5.	Build an app. Win.

### Running on the command line

1. In the project directory you should be able to run the Robolectric tests:
    ```bash
    ./gradlew test
    ```

1. You can also run the Espresso tests:
    ```bash
    ./gradlew connectedAndroidTest
    ```
    Note: Make sure to start an Emulator or connect a device first so the test has something to connect to.

1. Finally you can build a debug `.apk` of the project for installation on phones:
    ```bash
    ./gradlew assemble
    ```
    This will output the file to `build/outputs/apk/*-debug.apk`