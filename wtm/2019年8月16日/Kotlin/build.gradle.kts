group "KotlinGradle"
version "1.0-SNAPSHOT"

apply plugin: "application"
mainClassName = "Kotlin.src.net.println.kotlin.chapter3.calckt"

sourceCompatibility = 1.8

repositories {
    mavenCentral()
}

dependencies {
    testCompile group: 'junit', name: 'junit', version: '4.12'
}
