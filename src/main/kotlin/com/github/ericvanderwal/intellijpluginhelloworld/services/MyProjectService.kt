package com.github.ericvanderwal.intellijpluginhelloworld.services

import com.github.ericvanderwal.intellijpluginhelloworld.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
