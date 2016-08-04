<img align="center" src="src/main/assets/media/northem-light-java-banner.png" alt="Northem Light Java"/> <a href="https://github.com/arcticicestudio/northem-light"><img align="right" src="https://raw.githubusercontent.com/arcticicestudio/northem-light-java/develop/src/main/assets/media/northem-logo.png"/></a>

<img src="https://cdn.travis-ci.org/images/favicon-c566132d45ab1a9bcae64d8d90e4378a.svg" width=24 height=24/> [![Travis CI](https://img.shields.io/travis/arcticicestudio/northem-light-java/develop.svg)](https://travis-ci.org/arcticicestudio/northem-light-java) <img src="https://codecov.io/favicon.ico" width=24 height=24/> [![codecov](https://codecov.io/gh/arcticicestudio/northem-light-java/branch/develop/graph/badge.svg)](https://codecov.io/gh/arcticicestudio/northem-light-java)  
<img src="https://assets-cdn.github.com/favicon.ico" width=24 height=24/> [![release](https://img.shields.io/github/release/arcticicestudio/northem-light-java.svg)](https://github.com/arcticicestudio/northem-light-java/releases/latest) <img src="http://search.maven.org/favicon.ico" width=24 height=24/> [![Central Repository](https://img.shields.io/maven-central/v/com.arcticicestudio/northem-light-java.svg)](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22com.arcticicestudio%22%20AND%20a%3A%22northem-light-java%22) [![OSS Sonatype Snapshot](https://img.shields.io/badge/snapshot-0.3.0--SNAPSHOT-blue.svg)](https://oss.sonatype.org/content/repositories/snapshots/com/arcticicestudio/northem-light-java)

Java library implementation of the north-bluish light color palette [Northem Light](https://github.com/arcticicestudio/northem-light).  
Optimized for syntax highlighting- and UI projects.  
This is a light and more color-intensive variation.

## Getting started
### Setup
To use northem-light-java it must be available on your classpath.  
You can get it from the <img src="https://search.maven.org/favicon.ico" width=16 height=16/> <a href="https://search.maven.org">Central Repository</a> as a dependency for your favorite build tool or [download the latest version](https://github.com/arcticicestudio/northem-light-java/releases/latest).

<img src="http://apache.org/favicons/favicon.ico" width=16 height=16/> <a href="https://maven.apache.org">Apache Maven</a>
```xml
<dependency>
  <groupId>com.arcticicestudio</groupId>
  <artifactId>northem-light-java</artifactId>
  <version>0.1.0</version>
</dependency>
```

<img src="https://gradle.org/wp-content/uploads/fbrfg/favicon.ico" width=16 height=16/> <a href="https://gradle.org">Gradle</a>
```java
compile(group: 'com.arcticicestudio', name: 'northem-light-java', version: '0.1.0')
```

<img src="http://apache.org/favicons/favicon.ico" width=16 height=16/> <a href="https://ant.apache.org/ivy">Apache Ivy</a>
```xml
<dependency org="com.arcticicestudio" name="northem-light-java" rev="0.1.0" />
```

Development snapshots are available via [OSS Sonatype](https://oss.sonatype.org/content/repositories/snapshots/com/arcticicestudio/northem-light-java).   

### Build
Build and install northem-light-java into your local repository without GPG signing:  
```
mvn clean install
```

Signed artifacts may be build by using the `sign-gpg` profile with a provided `gpg.keyname` property:
```
mvn clean install -Dgpg.keyname=YourGPGKeyId
```

A continuous integration build is running at [Travis-CI](https://travis-ci.org/arcticicestudio/northem-light-java).

### Variations
  - <img src="https://java.com/favicon.ico" width=16 height=16 /> <a href="https://github.com/arcticicestudio/northem-java">Northem - Java</a> <img src="https://www.kernel.org/theme/images/logos/favicon.png" width=16 height=16 /> <img src="https://developer.apple.com/favicon.ico" width=16 height=16 /> <img src="https://www.microsoft.com/en-us/windows/favicon.ico" width=16 height=16 />
  - <a href="https://github.com/arcticicestudio/northem-light-java"><img src="https://java.com/favicon.ico" width=16 height=16> Northem Dark - Java</a> <img src="https://www.kernel.org/theme/images/logos/favicon.png" width=16 height=16 /> <img src="https://developer.apple.com/favicon.ico" width=16 height=16 /> <img src="https://www.microsoft.com/en-us/windows/favicon.ico" width=16 height=16 />

### Other Projects
  - <a href="https://github.com/arcticicestudio/northem-light-intellij-idea-syntax"><img src="https://www.jetbrains.com/_assets//shared/favicons/jetbrains.ico" width=16 height=16> Northem Light IntelliJ IDEA Syntax</a> <img src="https://www.kernel.org/theme/images/logos/favicon.png" width=16 height=16 /> <img src="https://developer.apple.com/favicon.ico" width=16 height=16 /> <img src="https://www.microsoft.com/en-us/windows/favicon.ico" width=16 height=16 />
  - <a href="https://github.com/arcticicestudio/northem-light-atom-syntax"><img src="https://atom.io/favicon.ico" width=16 height=16> Northem Light Atom Syntax</a> <img src="https://www.kernel.org/theme/images/logos/favicon.png" width=16 height=16 /> <img src="https://developer.apple.com/favicon.ico" width=16 height=16 /> <img src="https://www.microsoft.com/en-us/windows/favicon.ico" width=16 height=16 />
  - <a href="https://github.com/arcticicestudio/northem-light-atom-ui"><img src="https://atom.io/favicon.ico" width=16 height=16> Northem Light Atom UI</a> <img src="https://www.kernel.org/theme/images/logos/favicon.png" width=16 height=16 /> <img src="https://developer.apple.com/favicon.ico" width=16 height=16 /> <img src="https://www.microsoft.com/en-us/windows/favicon.ico" width=16 height=16 />
  - <a href="https://github.com/arcticicestudio/northem-light-eclipse-syntax"><img src="https://eclipse.org/favicon.ico" width=16 height=16> Northem Light Eclipse Syntax</a> <img src="https://www.kernel.org/theme/images/logos/favicon.png" width=16 height=16 /> <img src="https://developer.apple.com/favicon.ico" width=16 height=16 /> <img src="https://www.microsoft.com/en-us/windows/favicon.ico" width=16 height=16 />
  - <a href="https://github.com/arcticicestudio/northem-light-gedit"><img src="https://static.gnome.org/wiki.gnome.org/gnome/css/favicon.png" width=16 height=16> Northem Light gedit</a> <img src="https://www.kernel.org/theme/images/logos/favicon.png" width=16 height=16 />
  - <a href="#"><img src="http://www.gtk.org/images/gtk-logo.ico" width=16 height=16> Northem Light GTK</a> (in drafting) <img src="https://www.kernel.org/theme/images/logos/favicon.png" width=16 height=16 />
  - <a href="https://github.com/arcticicestudio/northem-light-notepadplusplus"><img src="http://notepad-plus-plus.org/assets/images/favicon.ico" width=16 height=16> Northem Light Notepad++</a> <img src="https://www.microsoft.com/en-us/windows/favicon.ico" width=16 height=16 />

Visit the [official website](http://arcticicestudio.com/northem) for more information.

## Development
[![Changelog](https://img.shields.io/badge/Changelog-v0.1.0-blue.svg)](https://github.com/arcticicestudio/northem-light-java/blob/v0.1.0/CHANGELOG.md)

### Workflow
This project follows the [gitflow](http://nvie.com/posts/a-successful-git-branching-model) branching model.

### Specifications
This project follows the [Arctic Versioning Specification (ArcVer)](https://github.com/arcticicestudio/arcver).

### Contribution
Please report issues/bugs, suggestions for improvements and feature requests to the [issuetracker](https://github.com/arcticicestudio/northem-light-java/issues).

---

<img src="http://arcticicestudio.com/favicon.ico" width=16 height=16/> Copyright &copy; 2016 Arctic Ice Studio

[![GPL-3.0](http://www.gnu.org/graphics/gplv3-88x31.png)](http://www.gnu.org/licenses/gpl.txt) [![CC BY-SA-4.0](http://mirrors.creativecommons.org/presskit/buttons/88x31/svg/by-sa.svg)](http://creativecommons.org/licenses/by-sa/4.0/)
