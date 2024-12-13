# michelin-na-o2c-sdk

[![GitHub Build](https://img.shields.io/github/actions/workflow/status/michelin/michelin-na-o2c-sdk/push_master.yml?branch=master&logo=github&style=for-the-badge)](https://img.shields.io/github/actions/workflow/status/michelin/michelin-na-o2c-sdk/push_master.yml)
[![GitHub release](https://img.shields.io/github/v/release/michelin/michelin-na-o2c-sdk?logo=github&style=for-the-badge)](https://github.com/michelin/michelin-na-o2c-sdk/releases)
[![GitHub commits since latest release (by SemVer)](https://img.shields.io/github/commits-since/michelin/michelin-na-o2c-sdk/latest?logo=github&style=for-the-badge)](https://github.com/michelin/michelin-na-o2c-sdk/commits/main)
[![GitHub Stars](https://img.shields.io/github/stars/michelin/michelin-na-o2c-sdk?logo=github&style=for-the-badge)](https://github.com/michelin/michelin-na-o2c-sdk)
[![GitHub Watch](https://img.shields.io/github/watchers/michelin/michelin-na-o2c-sdk?logo=github&style=for-the-badge)](https://github.com/michelin/michelin-na-o2c-sdk)
[![Docker Pulls](https://img.shields.io/docker/pulls/michelin/michelin-na-o2c-sdk?label=Pulls&logo=docker&style=for-the-badge)](https://hub.docker.com/r/michelin/michelin-na-o2c-sdk/tags)
[![Docker Stars](https://img.shields.io/docker/stars/michelin/michelin-na-o2c-sdk?label=Stars&logo=docker&style=for-the-badge)](https://hub.docker.com/r/michelin/michelin-na-o2c-sdk)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg?logo=apache&style=for-the-badge)](https://opensource.org/licenses/Apache-2.0)

The API Development Kit (ADK) kicks off with real-world use cases from the Order-to-Cash APIs of Michelin North America's operations. It's designed to supercharge your development and testing process by embracing the power of SDKs.

Forget the tedious grind of building API clients manually by deciphering API specifications. With the ADK, you’ll experience a more seamless, native, and developer-friendly approach to software development.

Built on the robust [OpenAPI-Generator](https://github.com/OpenAPITools/openapi-generator), this kit not only simplifies generating SDKs in multiple languages but also showcases how you can do the same for your own APIs, making it a must-have tool for innovation.

And this is just the beginning! We're set to expand the ADK to support additional API-related code generation, including creating API services.

We’re thrilled to invite you to be a part of this journey! Share your ideas, contribute to the project, and help shape the future of API development. Together, let's build something extraordinary!

## Table of Contents


## Get Started

### Install JDK

[OpenJDK](https://adoptium.net/) 17+ is recommended

It is also recommended to use [SDKMAN](https://sdkman.io/) to manage your JDKs

### Clone or Download this project

```
# With SSH key
git clone git@github.com:michelin/michelin-na-o2c-sdk.git

or

git clone https://github.com/michelin/michelin-na-o2c-sdk.git

or
wget -o michelin-na-o2c-sdk.zip https://github.com/michelin/michelin-na-o2c-sdk/archive/refs/heads/main.zip
unzip michelin-na-o2c-sdk.zip
```

### Initialize Maven

If there is no Maven install on your local, you need to initialize it first.

Switch to sub-folder `sdk-generator`

 * In a Bash terminal in Linux, [CygWin](https://www.cygwin.com/), [GitBash](https://git-scm.com/downloads) and so on
``` bash
./mvnw clean install
```

 * In a Windows terminal
``` cmd or PowerShell
mvnw.cmd clean install
```

If there is error prompt regarding JAVA_HOME environment variable

 * Set JAVA_HOME in Windows Terminal

``` cmd
set JAVA_HOME=%USERPROFILE%\.sdkman\candidates\java\21.0.1-tem
```

``` Power Shell
$env:JAVA_HOME="$HOME\.sdkman\candidates\java\21.0.1-tem"
```

 * Set JAVA_HOME in Bash Terminal

``` bash
export JAVA_HOME=$HOME/.sdkman/candidates/java/21.0.1-tem
```


### Generate SDK Source

For the ones who want to directly use our API SDK, you can skip this step.

This step shows how to generate API SDK from OpenAPI spec. You can take the sample of `amn-o2c-sdk-java` so that you can generate your own API SDKs

 * Switch to to sub-folder `sdk-generator`
 * Run the Maven command below

``` bash
./mvnw -f amn-o2c-sdk-java/pom.xml clean generate-sources
```
``` cmd or PowerShell
mvnw.cmd -f amn-o2c-sdk-java\pom.xml clean generate-sources
```

### Use API SDK

Follow the instructions in the SDK [README](/sdk/amn-o2c-sdk-java/README.md)


## Contribution

We welcome contributions from the community! Before you get started, please take a look at
our [contribution guide](/CONTRIBUTING.md) to learn about our guidelines
and best practices. We appreciate your help in making this project a better tool for everyone.