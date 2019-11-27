package levelUpTask.automation.core.testdata.config

import levelUpTask.automation.core.testdata.DataBox
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.orm.jpa.JpaTransactionManager
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean

@Configuration
class DataBoxConfig {
    @Bean
    LocalEntityManagerFactoryBean getEntityManagerFactoryBean() {
        final LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean()
        factoryBean.setPersistenceUnitName('LOCAL_PERSISTENCE')
        factoryBean
    }

    @Bean
    JpaTransactionManager getJpaTransactionManager() {
        final JpaTransactionManager transactionManager = new JpaTransactionManager()
        transactionManager.setEntityManagerFactory(entityManagerFactoryBean.object)
        transactionManager
    }

    @Bean
    DataBox getDataBox() {
        new DataBox()
    }

}
