# library-android-deeplink

#### Installation

###### Step 1. Add the JitPack repository to your build file
```
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

###### Step 2. Add the dependency
```
dependencies {
    implementation 'com.github.thalesbm:library-android-deeplink:1.0.6'
}
```

------

#### How to use?

###### Use the command below to run a deeplink
```
adb shell am start -a android.intent.action.VIEW -d "deeplinksample://client"
```

