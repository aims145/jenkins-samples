nestedView('project-a') {
    views {
        listView('overview') {
            jobs {
                regex(/buildjob.*/)
            }
            columns {
                status()
                weather()
                name()
                lastSuccess()
                lastFailure()
            }
        }
        buildPipelineView('pipeline') {
            selectedJob('buildjob')
        }
    }
}