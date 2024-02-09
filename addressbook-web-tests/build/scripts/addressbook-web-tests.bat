@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem

@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  addressbook-web-tests startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Add default JVM options here. You can also use JAVA_OPTS and ADDRESSBOOK_WEB_TESTS_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto init

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto init

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:init
@rem Get command-line arguments, handling Windows variants

if not "%OS%" == "Windows_NT" goto win9xME_args

:win9xME_args
@rem Slurp the command line arguments.
set CMD_LINE_ARGS=
set _SKIP=2

:win9xME_args_slurp
if "x%~1" == "x" goto execute

set CMD_LINE_ARGS=%*

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\addressbook-web-tests.jar;%APP_HOME%\lib\testng-7.9.0.jar;%APP_HOME%\lib\junit-4.13.2.jar;%APP_HOME%\lib\selenium-java-4.17.0.jar;%APP_HOME%\lib\slf4j-api-1.7.36.jar;%APP_HOME%\lib\jcommander-1.82.jar;%APP_HOME%\lib\jquery-3.7.1.jar;%APP_HOME%\lib\hamcrest-core-1.3.jar;%APP_HOME%\lib\selenium-chrome-driver-4.17.0.jar;%APP_HOME%\lib\selenium-devtools-v119-4.17.0.jar;%APP_HOME%\lib\selenium-devtools-v120-4.17.0.jar;%APP_HOME%\lib\selenium-devtools-v121-4.17.0.jar;%APP_HOME%\lib\selenium-firefox-driver-4.17.0.jar;%APP_HOME%\lib\selenium-devtools-v85-4.17.0.jar;%APP_HOME%\lib\selenium-edge-driver-4.17.0.jar;%APP_HOME%\lib\selenium-ie-driver-4.17.0.jar;%APP_HOME%\lib\selenium-safari-driver-4.17.0.jar;%APP_HOME%\lib\selenium-support-4.17.0.jar;%APP_HOME%\lib\selenium-chromium-driver-4.17.0.jar;%APP_HOME%\lib\selenium-remote-driver-4.17.0.jar;%APP_HOME%\lib\selenium-manager-4.17.0.jar;%APP_HOME%\lib\selenium-http-4.17.0.jar;%APP_HOME%\lib\selenium-json-4.17.0.jar;%APP_HOME%\lib\selenium-os-4.17.0.jar;%APP_HOME%\lib\selenium-api-4.17.0.jar;%APP_HOME%\lib\auto-service-annotations-1.1.1.jar;%APP_HOME%\lib\guava-33.0.0-jre.jar;%APP_HOME%\lib\opentelemetry-semconv-1.23.1-alpha.jar;%APP_HOME%\lib\opentelemetry-exporter-logging-1.34.1.jar;%APP_HOME%\lib\opentelemetry-sdk-extension-autoconfigure-1.34.1.jar;%APP_HOME%\lib\opentelemetry-sdk-extension-autoconfigure-spi-1.34.1.jar;%APP_HOME%\lib\opentelemetry-sdk-1.34.1.jar;%APP_HOME%\lib\opentelemetry-sdk-trace-1.34.1.jar;%APP_HOME%\lib\opentelemetry-sdk-metrics-1.34.1.jar;%APP_HOME%\lib\opentelemetry-sdk-logs-1.34.1.jar;%APP_HOME%\lib\opentelemetry-sdk-common-1.34.1.jar;%APP_HOME%\lib\opentelemetry-api-events-1.34.1-alpha.jar;%APP_HOME%\lib\opentelemetry-extension-incubator-1.34.1-alpha.jar;%APP_HOME%\lib\opentelemetry-api-1.34.1.jar;%APP_HOME%\lib\opentelemetry-context-1.34.1.jar;%APP_HOME%\lib\byte-buddy-1.14.11.jar;%APP_HOME%\lib\failsafe-3.3.2.jar;%APP_HOME%\lib\failureaccess-1.0.2.jar;%APP_HOME%\lib\listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar;%APP_HOME%\lib\jsr305-3.0.2.jar;%APP_HOME%\lib\checker-qual-3.41.0.jar;%APP_HOME%\lib\error_prone_annotations-2.23.0.jar;%APP_HOME%\lib\j2objc-annotations-2.8.jar;%APP_HOME%\lib\commons-exec-1.3.jar

@rem Execute addressbook-web-tests
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %ADDRESSBOOK_WEB_TESTS_OPTS%  -classpath "%CLASSPATH%" ru.larten.addressbook.FirstScript %CMD_LINE_ARGS%

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable ADDRESSBOOK_WEB_TESTS_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%ADDRESSBOOK_WEB_TESTS_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
