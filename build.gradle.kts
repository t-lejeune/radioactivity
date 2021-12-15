plugins {
    java
    kotlin("jvm") version "1.5.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    testImplementation("org.assertj:assertj-core:3.15.0")
    testImplementation("io.cucumber:cucumber-java8:7.0.0")
    testImplementation("io.cucumber:cucumber-picocontainer:7.0.0")
    testImplementation("io.cucumber:cucumber-junit:7.0.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
