<div id="top"></div>

<br />
<div align="center">
<a>
  <img src="https://github.com/msthieleag/fan-test-problem-statement/blob/main/cgi.png" alt="cgi" width="150" height="65">
</a>
<h3 align="center">Fan Test Problem Statement</h3>
</div>

<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>


## About The Project

In this project we are simulating a simple ceiling fan. Below the description of challenge. 

The unit has 2 pull cords:

- One increases the speed each time it is pulled. There are 3 speed settings, and an “off” (speed 0) setting.
- If the cord is pulled on speed 3, the fan returns to the “off” setting.
- One reverses the direction of the fan at the current speed setting.
- Once the direction has been reversed, it remains reversed as we cycle through the speed settings, until reversed again.
- You can assume the unit is always powered (no wall switch)

<p align="right">(<a href="#top">back to top</a>)</p>

### Built With
The Project comes with a complete set of modern tools and libraries, including:

* [Java](https://docs.oracle.com/en/java/javase/11/)
* [Maven](https://maven.apache.org/)
* [Junit](https://junit.org/junit5/)

<p align="right">(<a href="#top">back to top</a>)</p>


## Getting Started

Some information for a quick installation of the project

### Prerequisites

* Java 
* Maven
* Java IDE, for example: Intellij, Eclipse, VsCode and others

### Installation

1. Clone the repo
   ```sh
   git clone git@github.com:msthieleag/fan-test-problem-statement.git
   ```
2. Open the project in your favorite IDE and install dependencies
   ```sh
   mvn clean install
   ```
3. After that just run the project using your IDE

<p align="right">(<a href="#top">back to top</a>)</p>

## Usage

The folders for this project should be organized according to the following example:

- Entities: All entities of the project
- Enums: All enums of the project

Project structure:
```
├── src
│   ├── main
│   │   └── java
│   │       └── entities
│   │   │   │   └── Fan.java   
│   │   │   └── enums
│   |   │   │   └── Directions.java
│   │   └── FanTestProblemStatementApplication.java 
├── test
│   ├── java
│   │   └── entities
│   │       └── FanTest.java
```

<p align="right">(<a href="#top">back to top</a>)</p>

## Contact

- linkedin: https://www.linkedin.com/in/thielem/
- email: marcio.sthieleag@gmail.com

<p align="right">(<a href="#top">back to top</a>)</p>