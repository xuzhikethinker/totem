#!/bin/sh

TOTEM_VERSION=3.2.1
TOTEM_HOMEDIR=`dirname $0`
LIBRARYPATH=$TOTEM_HOMEDIR/lib/
EXTDIRS=$TOTEM_HOMEDIR/lib/java

JVMARGS="-Xmx512m"
#JVMARGS="-verbose:jni -Xcheck:jni -Xmx512m"

if [ -z "$JAVA_HOME" ]; then
    JAVA=`which java`
else
    JAVA=$JAVA_HOME/bin/java
fi

if [ ! -f "$JAVA" ]; then
    echo "Java executable not found ($JAVA). Aborting."
    exit 0
fi

if [ ! -x "$JAVA" ]; then 
    echo "Java executable not found ($JAVA). (Not executable). Aborting."
    exit 0
fi


#echo "$JAVA $JVMARGS -Djava.ext.dirs=$EXTDIRS -Djava.library.path=$LIBRARYPATH -jar $TOTEM_HOMEDIR/dist/totem-$TOTEM_VERSION.jar $@"
LD_LIBRARY_PATH=$LIBRARYPATH:$LD_LIBRARY_PATH $JAVA $JVMARGS -Djava.ext.dirs=$EXTDIRS -Djava.library.path=$LIBRARYPATH -jar $TOTEM_HOMEDIR/dist/totem-$TOTEM_VERSION.jar $@

