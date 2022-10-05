# Gradle Example

Spring Boot Java + Groovy MIXED Development

## Groovy plugin

```groovy
plugins {
    id 'org.springframework.boot' version '2.7.4'
    id 'io.spring.dependency-management' version '1.0.14.RELEASE'
    id 'java'
    id 'groovy'
}
```

## Gradle sourceSets

### main

```groovy
sourceSets.main.java.srcDirs = []
sourceSets.main.groovy.srcDirs += ['src/main/java']
```

### test

```groovy
sourceSets.test.java.srcDirs = []
sourceSets.test.groovy.srcDirs += ['src/main/java']
```

## Unit Test configuration

```groovy
test {
    useJUnitPlatform()
}
```