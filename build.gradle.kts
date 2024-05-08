// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false

        id("org.sonarqube") version "4.4.1.3373"



}
sonar {
    properties {
        property("sonar.projectKey", "kmmprojects_kmm-projects")
        property("sonar.organization", "kmmprojects")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}

