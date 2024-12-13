# Contributing to michelin-na-o2c-sdk

Welcome and thank you for considering contributing to michelin-na-o2c-sdk!

By following these guidelines, you can help make the contribution process easy and effective for everyone involved. It
also shows that you agree to respect the time of the developers managing and developing these open source projects. In
return, we will reciprocate that respect by addressing your issue, assessing changes, and helping you finalize your pull
requests.

## Getting Started

### Issues

Issues should be used to report problems, request a new feature, or to discuss potential changes before a PR is created.
When you create a new Issue, a template will be loaded that will guide you through collecting and providing the
information we need to investigate.

If you find an existing issue that addresses the problem you're having, please add your own reproduction information to
the existing issue instead of creating a new one. Adding
a [reaction](https://github.blog/2016-03-10-add-reactions-to-pull-requests-issues-and-comments/) can also indicate to
our maintainers that a particular problem is affecting more than just the reporter.

If you're unable to find an open issue addressing the problem, open a new one. Be sure to include a title and a clear
description, relevant information, and a code sample or executable test case demonstrating the expected behavior that is
not occurring.

### Pull Requests

PRs are always welcome and can be a quick way to get your fix or improvement slated for the next release. In general,
PRs should:

- Only fix/add the functionality in question OR address wide-spread style issues, not both.
- Add unit or integration tests for fixed or changed functionality (if a test suite already exists).
- Address a single concern in the least number of changed lines as possible.
- Be accompanied by a complete Pull Request template (loaded automatically when a PR is created).

Be sure to use the past tense ("Added new feature...", "Fixed bug on...") and add tags to the PR ("documentation" for
documentation updates, "bug" for bug fixing, etc.).

For changes that address core functionality or would require breaking changes (e.g. a major release), it's best to open
an Issue to discuss your proposal first. This is not required but can save time creating and reviewing changes.

In general, we follow the ["fork-and-pull" Git workflow](https://github.com/susam/gitpr)

- Fork the repository to your own GitHub account
- Clone the project to your machine
- Create a branch locally from master with a succinct but descriptive name
- Commit changes to the branch
- Following any formatting and testing guidelines specific to this repo
- Push changes to your fork
- Open a PR in our repository targeting master and follow the PR template so that we can efficiently review the changes.

## Style Guide

### Code Style

We maintain a consistent code style using [Checkstyle](https://checkstyle.sourceforge.io/) for Java code.

The configuration file is defined in the `.checkstyle` folder.
To perform Checkstyle validation, run the following:

```bash
./gradlew checkstyleMain checkstyleTest
```

Before you start contributing new code, it is recommended to:

- Install the IntelliJ [CheckStyle-IDEA](https://plugins.jetbrains.com/plugin/1065-checkstyle-idea) plugin.
- Configure the plugin to use michelin-na-o2c-sdk's Checkstyle configuration file.

Adhering to this code style ensures consistency and helps maintain code quality throughout the project.

### Maven Style

For Maven projects, ensure that your code adheres to the following guidelines:

- Use the standard Maven directory structure.
- Ensure that your `pom.xml` file is properly formatted and follows the standard Maven conventions.
- Use meaningful artifact and group IDs.
- Keep dependencies up-to-date and avoid unnecessary dependencies.

To validate your Maven project, run the following:

```bash
mvn clean install
```

This will compile the code, run tests, and package the application, ensuring that everything is in order.

By following these guidelines, you help maintain the quality and consistency of the project, making it easier for everyone to contribute effectively.