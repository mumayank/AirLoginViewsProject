# Air Login Views Library
[![](https://jitpack.io/v/mumayank/AirLoginViewsProject.svg)](https://jitpack.io/#mumayank/AirLoginViewsProject)
<span class="badge-paypal"><a href="https://www.paypal.me/mumayank" title="Donate to this project using Paypal"><img src="https://img.shields.io/badge/paypal-donate-yellow.svg" alt="PayPal donate button" /></a></span>

An Android library which helps you get custom views for your app's login page, like enter Email ID or enter Password view.

|   |  |
| ------------- | ------------- |
| ![alt text](https://github.com/mumayank/AirLoginViewsProject/blob/master/github_pics/1.jpg "Logo")  | ![alt text](https://github.com/mumayank/AirLoginViewsProject/blob/master/github_pics/2.jpg "Logo")  |
| ![alt text](https://github.com/mumayank/AirLoginViewsProject/blob/master/github_pics/3.jpg "Logo") | ![alt text](https://github.com/mumayank/AirLoginViewsProject/blob/master/github_pics/4.jpg "Logo")  |
| ![alt text](https://github.com/mumayank/AirLoginViewsProject/blob/master/github_pics/5.jpg "Logo") | ![alt text](https://github.com/mumayank/AirLoginViewsProject/blob/master/github_pics/6.jpg "Logo")  |


# Setup

In root build.gradle
```gralde
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' } // this line
  }
}
```

In app build.gradle
```gradle
dependencies {
  implementation 'com.github.mumayank:AirLoginViewsProject:LATEST_VERSION' // this line
}
```
where LATEST_VERSION is [![](https://jitpack.io/v/mumayank/AirLoginViewsProject.svg)](https://jitpack.io/#mumayank/AirLoginViewsProject)

# Usage

In `styles.xml`, extend your base theme to any MaterialComponents theme
```xml
<style name="AppTheme" parent="Theme.MaterialComponents.Light.DarkActionBar">
```

In the login layout file, embedd login views as follows:
```xml
<com.mumayank.airloginviews.EmailView
        android:id="@+id/airLoginViewsEmailView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />

<com.mumayank.airloginviews.PasswordView
    android:id="@+id/airLoginViewsPasswordView"
    android:layout_width="match_parent"
    android:layout_height="wrap_content" />
```

In your activity:
```kotlin
// get email view's text as
airLoginViewsEmailView.emailET.text.toString()

// get password view's text as
airLoginViewsPasswordView.passwordET.text.toString()
```
