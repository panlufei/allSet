package com.github.panlufei.allset.services

import com.intellij.openapi.project.Project
import com.github.panlufei.allset.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
