### OpenAPI Client

This Maven project generates native Java REST client stubs from a provided YAML OpenAPI description.

### Prerequisites

* Java 11+
* Maven 3+

### Setup

* IDE: Import repo, Run Maven `clean install`.
* No IDE: Start `mvn clean install`, afterwards all API client classes are generated in `target\openapi`, add those to classpath.  

### Run

_Note: To run this project, the [REST server part](https://github.com/WildCodeSchool/sea-openapi-server) must be running locally on port 8080._

* Start `ApiClientSample`
