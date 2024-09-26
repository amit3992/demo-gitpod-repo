package com.example.demogitpod.config;

import com.theokanning.openai.service.OpenAiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ChatClientConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChatClientConfiguration.class);
    public static final String OPENAI_API_TOKEN = "OPENAI_API_KEY";

    /**
     * OpenAI api token bean
     */
    @Bean(name = "openAiApiToken")
    @ConditionalOnMissingBean(name = "openAiApiToken")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public String openAiApiToken() {
        return System.getenv(OPENAI_API_TOKEN);
    }

    /**
     * OpenAI Service bean
     */
    @Bean(name = "openAiService")
    @ConditionalOnBean(name = "openAiApiToken")
    @ConditionalOnMissingBean(name = "openAiService")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public OpenAiService openAiService() {
        LOGGER.debug("Creating openAiService bean");
        return new OpenAiService(openAiApiToken());
    }

}
