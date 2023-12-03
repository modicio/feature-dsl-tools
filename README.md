# feature-dsl-tools

> Eclipse tooling for the feature request DSL using Xtext and Xtend

## Project Structure

* The Xtext grammar specification is located [here](./de.tud.st.featurelang/src/de/tud/st/featurelang/FeatureLang.xtext).
* The Xtend model transformation specification is located [here](de.tud.st.featurelang/src/de/tud/st/featurelang/generator/FeatureLangGenerator.xtend).

## Prerequisites

This project is developed and tested with:

* Java 17 (OpenJDK Eclipse Temurin)
* Eclipse (Eclipse Modeling Tools) version 2023-03
* Xtext version 2.30.0

## Getting Started

1. Have an OpenJDK 17 aktiv on your system (`java --version` must return 17.x)
2. Install Eclipse Modeling Tools https://www.eclipse.org/downloads/packages/release/2023-09/r/eclipse-modeling-tools
3. Open Eclipse for the first time and create an empty workspace
4. Go to Help -> Eclipse Marketplace and install the Xtext plugin. Follow the instructions and restart eclipse once it asks you to do so.
5. Clone this repository somewhere
6. Go to File -> Import -> General -> Existing Projects into Workspace
7. Select the feature-dsl-tools root folder in the top selection. Under "Projects" select all shown parts. Make sure nothing is selected under "Options"
8. Finish the import. Some tasks will be executed and the project parts appear on the left side Model Explorer. Some errors and warnings may appear.
9. The important files are located in `de.tud.st.featurelang/src`. There you find the `FeatureLang.xtext`, the `GenerateFeatureLang.mwe2` and under generator the `Main.java`
and `FeatureLangGenerator.xtend` files.
10. Right-click on the mwe2 file and select Run-As -> mwe2 Workflow. This step should lead to a successful build process.
      * If the build output looks succesfull, but there are still error icons in the Model Explorer, open the Problems view (typically on the right side) and delete all warnings. Repeat the mwe2 build. The errors should be gone now.
      * This build step is always necessary to synchronise changes made in the .xtext file to the project.
11. The `.xtext` file contains the grammar specification. See the official Xtext docs for more information
12. The `.xtend` file contains the compiler translating the grammar syntax tree into the output string sequence.
13. To export the project, go to File -> Export as Runnable Jar and select "Copy libraries into JAR". The Lauch configuration must be the `Main.java`.
      * In case no launch configuration can be selected, go to the Main class in the Model Explorer -> Right click -> Run. The will fail due to missing input parameters but afterwards it is selectable in the export dialog.
14. To actually execute the language tool, create a file with the ending `.featurelang` and place your input request inside. Call `java -jar [export].jar [input path] [output path]`

## Request examples
* HINT #1: words in brackets are optional; words divided with slash '/' could be varied.
* HINT #2: every MUST could be replaced with SHOULD to add optional.

1. The/a (abstract) class `className` must/should (not) be/exist.
2. The/a class `className` must (not) have (a/an) name/URI `actualName`.
3. The/a class `className` has (a/an) (existing) attribute `attributeName`. It must be a time/phrase/number.
4. The/a class `className` has (a/an) (existing) attribute `attributeName`. It must have (a/an) name/URI `actualName`.
5. The/a class `className` has (a/an) (existing) attribute `attributeName`. It must have (a) value `actualValue`.
6. The/a class `className` must (not) have the/a/an attribute `attributeName`. It is a time/phrase/number.
7. The/a class `className` must (not) have association/associations to (other) class `className` called `associationName`.
8. The/a class `className` must (not) have association/associations `associationName` compatible with version `versionName`.
9. The/a class `className` must (not) have association/associations `associationName` with version range from `start` to `end`.
10. The/a class `className` must (not) have association/associations `associationName` with all versions of variant `variantName`.
11. The/a class `className` must (not) have association/associations `associationName` up to date `date`.
12. The/a class `className` must (not) have association/associations `associationName` starting from date `date`.
13. The/a class `className` must (not) inherit from class `className`.
14. The/a class `className` must (not) have inheritance URI `uriString`.
15. The/a class `className` must (not) compose class `className` called `compositionName`. (It must be public/private.)
16. The/a class `className` must (not) have composition `compositionName` with URI/target/role `newName`.
