plugins {
    id("com.android.application")
}

android {
    namespace = "br.com.controleveiculos"
    compileSdk = 35

    defaultConfig {
        applicationId = "br.com.controleveiculos"
        minSdk = 23
        targetSdk = 35
        versionCode = 23
        versionName = "23.0"
    }
}

dependencies {
    implementation("androidx.webkit:webkit:1.14.0")
}
