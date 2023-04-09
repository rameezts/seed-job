def gitUrl = "https://github.com/example/project.git"

job("Project-A-Build-job") {
    description "Builds MyProject from master branch."
    parameters {
        stringParam('COMMIT', 'HEAD', 'Commit to build')
    }
    scm {
        git {
            remote {
                url('${gitUrl}')
                branch "origin/master"
            }
            
        }
    }
    steps {
        shell "Look: I'm building master!"
    }
}
