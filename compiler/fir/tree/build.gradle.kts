/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

plugins {
    kotlin("jvm")
    id("jps-compatible")
}

jvmTarget = "1.6"

dependencies {
    compile(project(":core:descriptors"))
    // Necessary only to store bound PsiElement inside FirElement
    compileOnly(intellijCoreDep()) { includeJars("intellij-core", "annotations") }
}

sourceSets {
    "main" { projectDefault() }
    "test" {}
}