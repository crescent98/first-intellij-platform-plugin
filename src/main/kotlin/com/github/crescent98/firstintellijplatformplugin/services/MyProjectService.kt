package com.github.crescent98.firstintellijplatformplugin.services

import com.intellij.openapi.project.Project
import com.github.crescent98.firstintellijplatformplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
