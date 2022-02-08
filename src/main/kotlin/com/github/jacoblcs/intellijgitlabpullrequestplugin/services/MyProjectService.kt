package com.github.jacoblcs.intellijgitlabpullrequestplugin.services

import com.intellij.openapi.project.Project
import com.github.jacoblcs.intellijgitlabpullrequestplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
