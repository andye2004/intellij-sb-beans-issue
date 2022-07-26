package github.andye.intellijsbbeansissue;

import org.springframework.batch.core.configuration.annotation.DefaultBatchConfigurer;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;

@Configuration
@EnableBatchProcessing
public class BatchConfigurer extends DefaultBatchConfigurer {

//    private final TaskExecutor taskExecutor;
//    private final PlatformTransactionManager transactionManager;
//
//    public BatchConfigurer(TaskExecutor inBoundTaskExecutor, EntityManagerFactory entityManagerFactory) {
//        this.taskExecutor = inBoundTaskExecutor;
//        this.transactionManager = new JpaTransactionManager(entityManagerFactory);
//    }
//
//    @NonNull
//    @Override
//    public PlatformTransactionManager getTransactionManager() {
//        return this.transactionManager;
//    }

    @NonNull
    @Override
    protected JobLauncher createJobLauncher() throws Exception {
        return super.createJobLauncher();
    }
}
