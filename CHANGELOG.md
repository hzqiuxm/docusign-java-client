# Change Log
All notable changes to this project will be documented in this file.

See [DocuSign Support Center](https://support.docusign.com/en/releasenotes/) for Product Release Notes.

## [Unreleased]
### Added
- TravisCI automatic tests.
- TravisCI badge.
- Better rendering of the[`Javadoc`](http://docusign.github.io/docusign-java-client/target/apidocs/), using Doclets.

### Changed
- Updated the code snippet in the README file to use the API base url gotten from the login call, instead of using the default one. Required for integrations when they go live.
- Updated the README file with additional Authentication information.
- Updated the package with the latest full API release. No omitted endpoints anymore.

### Fixed
- Issue [`#27`](https://github.com/docusign/docusign-java-client/issues/27): SimpleDateFormat Exception in Java 1.6.

## [2.0.2] - 2016-07-18
### Changed
- Support of newer version of the DocuSign eSignature API.
- Updated the list of omitted endpoints.

### Fixed
- Issue with datetime on such systems such as Android plateform.

## [2.0.1] - 2016-04-27
### Changed
- Updated the package to a newer API release.
- jersey library version updated to 1.19.1.
- jackson library version updated to 2.7.0.

## [2.0.0] - 2016-01-15
### Added
- Initial commit of the new Java SDK for DocuSign API, automatically generated from OpenAPI specification.
- Send-from-template recipe to the README documentation.

### Changed
- Flattened the folder structure of the project page on Github, to look more like standard Java open-source projects.
- Updated NetBeans project file for unit tests.
- Switched to MIT license.
- Updated "core" recipes.
- Updated the list of omitted endpoints.
- Updated the README documentation.

### Fixed
- Several broken links in the README documentation.

