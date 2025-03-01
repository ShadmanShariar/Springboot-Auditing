package com.springboot_auditing.springboot_auditing.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {

    private static final Logger logger = LoggerFactory.getLogger(AuditorAwareImpl.class);

    @Override
    public Optional<String> getCurrentAuditor() {
        String auditor = "system";
        logger.info("Auditing action by user: {}", auditor);
        return Optional.of(auditor);
    }
}



