include "../../include/default.groovy"
include "../../include/repository-eclipse.groovy"
director {
	install {
		unitsFrom "svn-connector-svnkit16.groovy"
	}
}