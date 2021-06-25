import org.gradle.api.JavaVersion.VERSION_1_8

plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "com.huynn109.template"
        minSdkVersion(19)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        val baseUrl = "baseUrl"
        getByName("debug") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            buildConfigField("String", baseUrl, "\"http://huynn109.com/\"")
        }
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            buildConfigField("String", baseUrl, "\"http://huynn109.com/\"")
        }
    }

    compileOptions {
        targetCompatibility = VERSION_1_8
        sourceCompatibility = VERSION_1_8
    }

    buildFeatures {
        viewBinding = true
    }

}

dependencies {
    val multidexVersion = "1.0.3"
    val koinVersion = "2.2.3"
    val kotlinVersion = "1.5.0"
    val retrofitVersion = "2.5.0"
    val materialComponentVersion = "1.1.0-alpha10"
    val appCompatVersion = "1.1.0"
    val coreKtxVersion = "1.1.0"
    val constraintLayoutVersion = "1.1.3"
    val lifecycleVersion = "2.1.0"
    val rxAndroidVersion = "2.1.1"
    val rxJavaVersion = "2.2.10"
    val okhttpVersion = "3.14.2"
    val materialDialogVersion = "3.0.2"
    val timberVersion = "4.7.1"

    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation("com.android.support:multidex:$multidexVersion")

    // Kotlin
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion")
    implementation("androidx.core:core-ktx:$coreKtxVersion")

    // Google
    implementation("androidx.constraintlayout:constraintlayout:$constraintLayoutVersion")
    implementation("com.google.android.material:material:$materialComponentVersion")
    implementation("androidx.appcompat:appcompat:$appCompatVersion")

    // RxJava
    implementation("io.reactivex.rxjava2:rxandroid:$rxAndroidVersion")
    implementation("io.reactivex.rxjava2:rxjava:$rxJavaVersion")

    // Koin
    implementation("io.insert-koin:koin-core:$koinVersion")
    implementation("io.insert-koin:koin-android:$koinVersion")
    implementation("io.insert-koin:koin-android-viewmodel:$koinVersion")

    // Android jetpack
    implementation("androidx.lifecycle:lifecycle-extensions:$lifecycleVersion")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion")
    // Optional : Kotlin extension (https://d.android.com/kotlin/ktx)

    // Networking
    implementation("com.squareup.retrofit2:retrofit:$retrofitVersion")
    implementation("com.squareup.retrofit2:adapter-rxjava2:$retrofitVersion")
    implementation("com.squareup.retrofit2:converter-gson:$retrofitVersion")
    implementation("com.squareup.okhttp3:okhttp:$okhttpVersion")
    implementation("com.squareup.okhttp3:logging-interceptor:$okhttpVersion")

    // Log helper
    implementation("com.jakewharton.timber:timber:$timberVersion")

    // UI
    implementation("com.afollestad.material-dialogs:core:$materialDialogVersion")
    implementation("com.afollestad.material-dialogs:lifecycle:$materialDialogVersion")
}
