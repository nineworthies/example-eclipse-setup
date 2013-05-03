include "../../include/default.groovy"
director {
	unitsFromRepository ("http://aws.amazon.com/eclipse") {
		installableUnit {
			id "com.amazonaws.eclipse.core.feature.feature.group"
		}
		installableUnit {
			id "com.amazonaws.eclipse.sdk.feature.feature.group"
		}
		installableUnit {
			id "com.amazonaws.eclipse.ec2.feature.group"
		}
		installableUnit {
			id "com.amazonaws.eclipse.elasticbeanstalk.feature.feature.group"
		}
	}
}