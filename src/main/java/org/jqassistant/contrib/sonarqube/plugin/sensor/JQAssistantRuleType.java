package org.jqassistant.contrib.sonarqube.plugin.sensor;

/**
 * The rule types supported by jQAssistant.
 */
public enum JQAssistantRuleType {

    CONCEPT {
        @Override
        public String getKey() {
            return JQAssistantRulesRepository.INVALID_CONCEPT_KEY;
        }
    },
    CONSTRAINT {
        @Override
        public String getKey() {
            return JQAssistantRulesRepository.CONSTRAINT_VIOLATION_KEY;
        }
    };

    public abstract String getKey();
}
