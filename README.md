### OpenAPI Client

This Maven project generates native Java REST client stubs from a provided YAML OpenAPI description.

### Prerequisites

* Java 11+
* Maven 3+

### Setup

Start `mvn clean install`, afterwards all API client classes are generated in `target\openapi`

### Run

To run this project, the [REST server part](https://github.com/WildCodeSchool/sea_openapi_server) must be running locally on port 8080. 