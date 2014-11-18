20.11.2012 [damkon]

This is Syncron version of Mondrian library. In order to build it please follow steps from:
http://mondrian.pentaho.com/documentation/developers_guide.php


Building
--------

To build mondrian.jar in dist directory

    # Currently Mondrian requires Java 6 to compile
    export JAVA_HOME=/path/to/java/6/jdk
    ant dist

To zip sources

    zip -r dist/mondrian-src.zip src



Troubleshooting
---------------

If build fails with something like

    org.olap4j#olap4j;1.0.0.445: not found

Then look what local paths are searched to find the jar. In my case it was
$HOME/.ivy2/local/org.olap4j/olap4j/1.0.0.445/jars/olap4j-1.0.0.445.jar and
$HOME/.ivy2/local/org.olap4j/olap4j/1.0.0.445/sources/olap4j-1.0.0.445.jar for
sources.

Provided that BPP uses olap4j-1.0.1.500.jar, following commands can get you
running:

    mkdir -p ~/.ivy2/local/org.olap4j/olap4j/1.0.0.445/jars ~/.ivy2/local/org.olap4j/olap4j/1.0.0.445/sources
    cp -v bppWorkspace/SyncronLib/mondrian/olap4j-1.0.1.500.jar ~/.ivy2/local/org.olap4j/olap4j/1.0.0.445/jars/olap4j-1.0.0.445.jar
    cp -v bppWorkspace/SyncronLibSource/olap4j-1.0.1.500-src.zip  ~/.ivy2/local/org.olap4j/olap4j/1.0.0.445/sources/olap4j-1.0.0.445.jar

