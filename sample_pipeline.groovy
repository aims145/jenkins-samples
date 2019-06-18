pipelineJob('buildjob') {
    definition {
        cps {
            script(readFileFromWorkspace('sample_pipeline_script.groovy'))
            sandbox()
        }
    }
}