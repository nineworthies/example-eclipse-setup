include "include/default.groovy"
include "include/repository-eclipse.groovy"
director {
	install {
		unitsFrom "common-units.groovy"
		unitsFrom "units/wireframesketcher/wireframesketcher.groovy" 
	}
}