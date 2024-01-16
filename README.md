# Simple Web Crawler in Java

## Description
This Java project is a basic implementation of a web crawler. It navigates through web pages starting from a given URL, exploring links up to a specified depth. The project demonstrates fundamental web crawling techniques using Java and the Jsoup library.

## Features
- Web crawling up to a specified depth
- Extraction and printing of URLs and page titles
- Tracking visited URLs to avoid revisits

## Getting Started

### Prerequisites
- Java Development Kit (JDK) installed on your system
- Jsoup library (for HTML parsing and handling)

### Installation
1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/yourusername/simple-web-crawler.git
2. Ensure that Jsoup library is included in your project's classpath.

### Running the Application
Compile and run the Crawler.java file:
 ```bash
javac Crawler.java Crawler_functions.java
java Crawler
 ```

## Usage
Once the application is running, it will start crawling from the hardcoded URLs in the Crawler.java file. The crawler will print out each visited URL and its title, and then proceed to crawl through the links found on each page.

## Contributing
Contributions are welcome to enhance the crawler's functionality or improve its efficiency:

1. Fork the repository
2. Create your feature branch ```bash (git checkout -b feature/AmazingFeature) ```
3. Commit your changes  ```bash(git commit -m 'Add some amazing feature')```
4. Push to the branch ```bash (git push origin feature/AmazingFeature)```
5. Create a new Pull Request

