<img align="center" src="https://raw.githubusercontent.com/arcticicestudio/northem-light-java/develop/src/main/assets/media/northem-light-java-banner.png" alt="Northem Light Java"/> <a href="https://github.com/arcticicestudio/northem-light"><img align="right" src="https://raw.githubusercontent.com/arcticicestudio/northem-light-java/develop/src/main/assets/media/northem-logo.png"/></a>

## 0.2.0 (2016-08-03) - Apache Maven Migration
This version is mainly focused on a [Apache Maven](https://maven.apache.org) migration.
Release and snapshot versions are now deployed to the [Central Repository](https://search.maven.org) via [OSS Sonatype](https://oss.sonatype.org).

### Improvements
#### Build Tool
  - Migrated to [Apache Maven](https://maven.apache.org) based on the [`glacier-apache-maven@0.4.0`](https://github.com/arcticicestudio/glacier-apache-maven) project skeletons

#### Documentation
  - The `README` has been modernized and now includes a "Getting started" section

## 0.1.0 (2016-04-09)
### Features
  - Implemented the [Northem Light](https://github.com/arcticicestudio/northem-light) color palette enumeration class [`NorthemLight`](https://github.com/arcticicestudio/northem-light-java/blob/master/src/main/java/com/arcticicestudio/northem/light/NorthemLight.java)  

**Constants**

| Name         | RGB Value     |
| ------------ | ------------- |
| `DARK_GRAY`  | `69,69,70`    |
| `DARK_GRAY`  | `69,69,70`    |
| `GRAY`       | `109,109,111` |
| `LIGHT_GRAY` | `198,198,200` |
| `DARK_SNOW`  | `242,242,247` |
| `DIRTY_SNOW` | `249,249,252` |
| `SNOW`       | `255,255,255` |
| `AQUA`       | `122,202,194` |
| `LIGHT_BLUE` | `111,186,208` |
| `BLUE`       | `113,167,202` |
| `DARK_BLUE`  | `87,129,179`  |
| `RED`        | `223,92,90`   |
| `YELLOW`     | `255,197,104` |
| `ORANGE`     | `241,144,84`  |
| `LIME`       | `197,201,97`  |
| `PURPLE`     | `186,142,196` |

**Methods**

| Name | Description |
| ---- | ----------- |
| `NorthemLight(final int RED, final int GREEN, final int BLUE)` | Constructs a new color object. |
| `public static String rgb(final Color COLOR)` | Converts the color to the RGB identifier. |
| `public static String hex(final Color COLOR)` | Converts the color to the HEX identifier. |
| `public Color get()` | Returns the color object. |

## 0.0.0 (2016-04-09) - Repository Reinitialization
