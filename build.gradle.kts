buildscript {
  repositories {
    google()
    mavenCentral()
  }
}

plugins {
  alias(libs.plugins.kotlin.jvm) apply false
  alias(libs.plugins.shadow) apply false
}
