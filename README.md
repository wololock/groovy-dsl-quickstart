# Groovy DSL Quickstart

[![Groovy DSL Quickstart](https://img.youtube.com/vi/i9pNYW1Pg9A/0.jpg)](https://www.youtube.com/watch?v=i9pNYW1Pg9A)

## Used Groovy version

```
$ groovy -version
Groovy Version: 3.0.2 JVM: 1.8.0_232 Vendor: Oracle Corporation OS: Linux
```

## Running example using dynamic compilation

```
$ groovy jenkinsfile.groovy 

   ___                                ___ _            _ _            
  / _ \_ __ ___   _____   ___   _    / _ (_)_ __   ___| (_)_ __   ___ 
 / /_\/ '__/ _ \ / _ \ \ / / | | |  / /_)/ | '_ \ / _ \ | | '_ \ / _ \
/ /_\\| | | (_) | (_) \ V /| |_| | / ___/| | |_) |  __/ | | | | |  __/
\____/|_|  \___/ \___/ \_/  \__, | \/    |_| .__/ \___|_|_|_| |_|\___|
                            |___/          |_|                        

Running pipeline using any available agent...
==> Running 'Build' stage...
+ ls -la
razem 32
drwxrwxr-x   5 wololock wololock 4096 04-07 18:20 .
drwxrwxr-x. 45 wololock wololock 4096 04-04 12:47 ..
drwxrwxr-x   3 wololock wololock 4096 04-04 12:48 com
drwxrwxr-x   7 wololock wololock 4096 04-07 18:20 .git
-rw-rw-r--   1 wololock wololock   29 04-07 18:19 .gitignore
drwxrwxr-x   2 wololock wololock 4096 04-07 18:19 .idea
-rw-rw-r--   1 wololock wololock 1016 04-04 13:23 jenkinsfile.groovy
-rw-rw-r--   1 wololock wololock   23 04-07 18:20 README.md

+ date +%Y-%m-%d
2020-04-07

[ECHO] Groovy rocks!
[ECHO] env.SOME_STRING = foobar
==> Running 'Test' stage...
+ mvn -version
Apache Maven 3.5.4 (1edded0938998edf8bf061f1ceb3cfdeccf443fe; 2018-06-17T20:33:14+02:00)
Maven home: /home/wololock/.sdkman/candidates/maven/current
Java version: 1.8.0_232, vendor: Oracle Corporation, runtime: /home/wololock/.sdkman/candidates/java/8.0.232-open/jre
Default locale: pl_PL, platform encoding: UTF-8
OS name: "linux", version: "5.5.10-100.fc30.x86_64", arch: "amd64", family: "unix"
```

## Running example using static compilation

```
$ groovy --compile-static jenkinsfile.groovy 

   ___                                ___ _            _ _            
  / _ \_ __ ___   _____   ___   _    / _ (_)_ __   ___| (_)_ __   ___ 
 / /_\/ '__/ _ \ / _ \ \ / / | | |  / /_)/ | '_ \ / _ \ | | '_ \ / _ \
/ /_\\| | | (_) | (_) \ V /| |_| | / ___/| | |_) |  __/ | | | | |  __/
\____/|_|  \___/ \___/ \_/  \__, | \/    |_| .__/ \___|_|_|_| |_|\___|
                            |___/          |_|                        

Running pipeline using any available agent...
==> Running 'Build' stage...
+ ls -la
razem 32
drwxrwxr-x   5 wololock wololock 4096 04-07 18:20 .
drwxrwxr-x. 45 wololock wololock 4096 04-04 12:47 ..
drwxrwxr-x   3 wololock wololock 4096 04-04 12:48 com
drwxrwxr-x   7 wololock wololock 4096 04-07 18:20 .git
-rw-rw-r--   1 wololock wololock   29 04-07 18:19 .gitignore
drwxrwxr-x   2 wololock wololock 4096 04-07 18:19 .idea
-rw-rw-r--   1 wololock wololock 1016 04-04 13:23 jenkinsfile.groovy
-rw-rw-r--   1 wololock wololock   23 04-07 18:20 README.md

+ date +%Y-%m-%d
2020-04-07

[ECHO] Groovy rocks!
[ECHO] env.SOME_STRING = foobar
==> Running 'Test' stage...
+ mvn -version
Apache Maven 3.5.4 (1edded0938998edf8bf061f1ceb3cfdeccf443fe; 2018-06-17T20:33:14+02:00)
Maven home: /home/wololock/.sdkman/candidates/maven/current
Java version: 1.8.0_232, vendor: Oracle Corporation, runtime: /home/wololock/.sdkman/candidates/java/8.0.232-open/jre
Default locale: pl_PL, platform encoding: UTF-8
OS name: "linux", version: "5.5.10-100.fc30.x86_64", arch: "amd64", family: "unix"
```