package github.andye.intellijsbbeansissue;

import org.springframework.batch.core.explore.JobExplorer;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.stereotype.Component;

@Component
public class TestComponent {
    private final JobLauncher jobLauncher;
    private final JobExplorer jobExplorer;

    public TestComponent(JobLauncher jobLauncher, JobExplorer jobExplorer) {
        this.jobLauncher = jobLauncher;
        this.jobExplorer = jobExplorer;
    }
}
