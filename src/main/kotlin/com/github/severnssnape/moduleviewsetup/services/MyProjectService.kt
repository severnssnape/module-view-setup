package com.github.severnssnape.moduleviewsetup.services

import com.github.severnssnape.moduleviewsetup.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
