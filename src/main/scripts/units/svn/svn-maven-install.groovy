include "../../include/default.groovy"
include "../../include/repository-eclipse.groovy"
director {
	install {
		unitsFrom "svn-maven.groovy"
	}
}