include "../../include/default.groovy"
director {
    unitsFromRepository("http://central.maven.org/maven2/.m2e/connectors/m2eclipse-tycho/0.7.0/N/0.7.0.201309291400") {
        installableUnit {
            id "org.sonatype.tycho.m2e.feature.feature.group"
        }
    }
}