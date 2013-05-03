include "../../include/default.groovy"
include "../../include/repository-eclipse.groovy"
director {
	install {
		unitsFrom "sts-maven.groovy"
	}
}